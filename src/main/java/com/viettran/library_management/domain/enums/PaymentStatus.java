package com.viettran.library_management.domain.enums;

import lombok.Getter;

@Getter
public enum PaymentStatus {
    PAID("Đã thanh toán"),
    UN_PAID("Chưa thanh toán");

    private final String label;

    PaymentStatus(String label) {
        this.label = label;
    }
}
