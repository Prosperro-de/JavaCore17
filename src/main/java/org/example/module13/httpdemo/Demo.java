package org.example.module13.httpdemo;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import lombok.SneakyThrows;
import org.example.module13.httpdemo.request.CreateCustomerRequestDto;
import org.example.module13.httpdemo.request.CreateOrderItemRequestDto;
import org.example.module13.httpdemo.request.CreateOrderRequestDto;
import org.example.module13.httpdemo.response.CustomerResponseDto;
import org.example.module13.httpdemo.response.OrderResponseDto;
import org.example.module13.httpdemo.response.ProductResponseDto;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;

public class Demo {
    public static final String BASE_URL = "http://java-http-demo.eu-central-1.elasticbeanstalk.com";
    @SneakyThrows
    public static void main(String[] args) {
        HttpClient httpClient = HttpClient.newHttpClient();

        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.registerModule(new JavaTimeModule());

        // Get all available products
//        HttpRequest getProductRequest = HttpRequest.newBuilder(new URI(BASE_URL + "/products"))
//                .GET()
//                .build();
//        HttpResponse<String> productResponse = httpClient.send(getProductRequest, HttpResponse.BodyHandlers.ofString());
//
//        System.out.println("productResponse.statusCode() = " + productResponse.statusCode());
//        List<ProductResponseDto> productResponses = objectMapper.readValue(productResponse.body(),
//                objectMapper.getTypeFactory().constructCollectionType(List.class, ProductResponseDto.class));
//        System.out.println("productResponses = " + productResponses);

        // create new customer

        CreateCustomerRequestDto customerRequestDto = CreateCustomerRequestDto.builder()
                .name("Oleg")
                .phone("333-555")
                .city("Poltava")
                .country("UA")
                .postalCode("60000")
                .address("Main Street")
                .build();
        String createCustomerRequestJson = objectMapper.writeValueAsString(customerRequestDto);

        HttpRequest createCustomerRequest = HttpRequest.newBuilder(new URI(BASE_URL + "/customer"))
                .POST(HttpRequest.BodyPublishers.ofString(createCustomerRequestJson))
                .header("accept", "application/json")
                .header("Content-type", "application/json")
                .build();
        HttpResponse<String> customerResponse = httpClient.send(createCustomerRequest, HttpResponse.BodyHandlers.ofString());
        System.out.println("customerResponse.statusCode() = " + customerResponse.statusCode());
        CustomerResponseDto customerDto = objectMapper.readValue(customerResponse.body(), CustomerResponseDto.class);

        // create order for the customer

        CreateOrderRequestDto orderRequestDto = CreateOrderRequestDto.builder()
                .customerId(customerDto.id())
                .items(List.of(
                        CreateOrderItemRequestDto.builder()
                                .productId(1L)
                                .quantity(3)
                                .build(),
                        CreateOrderItemRequestDto.builder()
                                .productId(5L)
                                .quantity(2)
                                .build(),
                        CreateOrderItemRequestDto.builder()
                                .productId(2L)
                                .quantity(6)
                                .build(),
                        CreateOrderItemRequestDto.builder()
                                .productId(7L)
                                .quantity(7)
                                .build()))
                .build();
        String orderRequestJson = objectMapper.writeValueAsString(orderRequestDto);
        HttpRequest createOrderRequest = HttpRequest.newBuilder(new URI(BASE_URL + "/order"))
                .POST(HttpRequest.BodyPublishers.ofString(orderRequestJson))
                .header("accept", "application/json")
                .header("Content-type", "application/json")
                .build();
        HttpResponse<String> orderResponse = httpClient.send(createOrderRequest, HttpResponse.BodyHandlers.ofString());
        System.out.println("orderResponse.statusCode() = " + orderResponse.statusCode());
        OrderResponseDto orderResponseDto = objectMapper.readValue(orderResponse.body(), OrderResponseDto.class);
        System.out.println("orderResponseDto = " + orderResponseDto);
    }
}
