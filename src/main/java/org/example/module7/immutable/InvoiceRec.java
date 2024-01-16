package org.example.module7.immutable;

import java.math.BigDecimal;

public record InvoiceRec(int id, BigDecimal price, Customer customer) {
}
