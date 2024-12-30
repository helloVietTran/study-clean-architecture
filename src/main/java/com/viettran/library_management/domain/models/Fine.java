package com.viettran.library_management.domain.models;

import com.viettran.library_management.domain.enums.FineType;
import com.viettran.library_management.domain.enums.PaymentStatus;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.Instant;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Fine {
    Integer id;

    String amount;
    String notes;

    FineType fineType;
    PaymentStatus paymentStatus;

    Instant issueDate;// ngày phát sinh
    Instant paidDate;// ngày thanh toán nếu đã thanh toán

    Borrow borrow;

    User user;
}
