package com.viettran.library_management.infrastructure.persistences;

import com.viettran.library_management.domain.models.Borrow;
import com.viettran.library_management.domain.models.User;
import com.viettran.library_management.domain.enums.FineType;
import com.viettran.library_management.domain.enums.PaymentStatus;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;

import java.time.Instant;

@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
@Table(name = "fine")
public class FineEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    String amount;
    String notes;

    @Enumerated(EnumType.STRING)
    FineType fineType;

    @Enumerated(EnumType.STRING)
    PaymentStatus paymentStatus;

    Instant issueDate;// ngày phát sinh
    Instant paidDate;// ngày thanh toán nếu đã thanh toán

    @OneToOne
    Borrow borrow;

    @ManyToOne
    User user;
}
