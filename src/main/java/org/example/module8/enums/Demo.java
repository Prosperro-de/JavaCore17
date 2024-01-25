package org.example.module8.enums;

public class Demo {

     static int attemptCount = 0;
    public static void main(String[] args) {
//        Product appleMacBook = new Product("AppleMacBook", "Premium", "Created");
//        Product lenovoThinkPad = new Product("lenovoThinkPad", "UsualLapTop", "Updated");

        Product appleMacBook = new Product("AppleMacBook", ProductType.PREMIUM, ProductStatus.CREATION_IN_PROGRESS);
        Product lenovoThinkPad = new Product("lenovoThinkPad", ProductType.STANDARD, ProductStatus.CREATED);
        Product asusLaptop = new Product(
                "asusLaptop", ProductType.valueOf("STANDARD"), ProductStatus.valueOf("CREATED"));

        System.out.println("appleMacBook = " + appleMacBook);
        System.out.println("lenovoThinkPad = " + lenovoThinkPad);
        System.out.println("asusLaptop = " + asusLaptop);
        String statusStingValue = ProductStatus.CREATION_IN_PROGRESS.name();
        System.out.println("statusStingValue = " + statusStingValue);

        ProductStatus[] values = ProductStatus.values();
        for (ProductStatus value : values) {
            System.out.println("value = " + value);
        }
        int ordinal = ProductType.STANDARD.ordinal();
        System.out.println("ordinal = " + ordinal);

        boolean terminalStatusInProgress = ProductStatus.CREATION_IN_PROGRESS.isTerminalStatus();
        boolean terminalStatusCreated = ProductStatus.CREATED.isTerminalStatus();

        System.out.println("terminalStatusCreated = " + terminalStatusCreated);
        System.out.println("terminalStatusInProgress = " + terminalStatusInProgress);

        processOrder(appleMacBook);
    }

    public static void processOrder(Product product) {

        try {
            if (attemptCount >= 3) {
                product.setProductStatus(ProductStatus.CREATED);
            }
            if (!product.getProductStatus().isTerminalStatus()) {
                attemptCount++;
                System.out.println("Still in creation");
                throw new RuntimeException();
            }
            System.out.println("product.getProductStatus() = " + product.getProductStatus());
            System.out.println("created");
        } catch (RuntimeException exception) {
            processOrder(product);
        }


    }
}
