package com.viettran.library_management.domain.enums;

import lombok.Getter;

@Getter
public enum DeposisType {
    CCCD("Căn cước công dân"),
    MONEY("Tiền");

    private final String label;
    DeposisType(String label) {
        this.label = label;
    }
}
