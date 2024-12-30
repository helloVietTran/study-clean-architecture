package com.viettran.library_management.domain.enums;

import lombok.Getter;

@Getter
public enum FineType {
    LOST_BOOK("Làm mất sách"),
    OVERDUE_FINE("Phạt theo thời gian quá hạn"),
    DAMAGED("Làm hư hỏng sách");

    private final String label;

    FineType(String label) {
        this.label = label;
    }
}
