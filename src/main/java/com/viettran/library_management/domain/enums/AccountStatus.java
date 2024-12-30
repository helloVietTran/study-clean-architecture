package com.viettran.library_management.domain.enums;

import lombok.Getter;

@Getter
public enum AccountStatus {
BANNED("Tạm thời cấm mượn sách"),
ACTIVE("Hoạt động bình thường"),
LOCK("Đang bị khóa");

private final String label;

AccountStatus(String label){
    this.label =  label;
}
}