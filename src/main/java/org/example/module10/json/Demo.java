package org.example.module10.json;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

public class Demo {
    public static void main(String[] args) {
        Gson gsonMapper = new GsonBuilder().setPrettyPrinting().create();
        Customer customer = Customer.builder()
                .name("Mykola")
                .age(32)
                .accountStatus(BigDecimal.valueOf(100L))
                .address(List.of(
                        new Address("Dnipro", "Peremogy", 49000),
                        new Address("Lviv", "Horodotska", 50000)
                ))
                .additionalInfo(Map.of("firstKey", "firstValue", "secondKey", "secondValue"))
                .build();

        String customerJson = gsonMapper.toJson(customer);
        System.out.println(customerJson);

        String anotherCustomerJson = """
                {
                  "name": "Oleg",
                  "age": 24,
                  "accountStatus": 599,
                  "address": [
                    {
                      "city": "Dnipro",
                      "street": "Peremogy",
                      "postCode": 49000
                    },
                    {
                      "city": "Lviv",
                      "street": "Horodotska",
                      "postCode": 50000
                    }
                  ],
                  "additionalInfo": {
                    "secondKey": "secondValue",
                    "firstKey": "firstValue"
                  }
                }
                """;
        Customer anotherCustomer = gsonMapper.fromJson(anotherCustomerJson, Customer.class);
        System.out.println("anotherCustomer = " + anotherCustomer);
    }
}
