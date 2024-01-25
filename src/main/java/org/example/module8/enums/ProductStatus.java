package org.example.module8.enums;

public enum ProductStatus {
    CREATION_IN_PROGRESS(false),
    CREATED(true);

    ProductStatus(boolean isTerminalStatus) {
        this.isTerminalStatus = isTerminalStatus;
    }

    private boolean isTerminalStatus;

    public boolean isTerminalStatus() {
        return isTerminalStatus;
    }


    //    @Override
//    public String toString() {
//        return "INVALID VALUE";
//    }
}
