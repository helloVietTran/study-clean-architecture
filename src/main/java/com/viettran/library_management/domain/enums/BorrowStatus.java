package com.viettran.library_management.domain.enums;

import lombok.Getter;

@Getter
public enum BorrowStatus {
    RETURNED("Đã trả lại"),
    OVERDUE("Quá hạn"),
    BORROWED("Đang mượn");

    private final String label;

    BorrowStatus(String label) {
        this.label = label;
    }
}