package com.viettran.library_management.infrastructure.persistences;

import com.viettran.library_management.domain.models.Book;
import com.viettran.library_management.domain.models.User;
import com.viettran.library_management.domain.enums.BorrowStatus;
import com.viettran.library_management.domain.enums.DeposisType;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;

import java.time.Instant;

@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
@Table(name = "borrow")
public class BorrowEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    @Column(name = "conditions", columnDefinition = "text[]")
    String[] conditions;// tình trạng sách khi trả

    @Enumerated(EnumType.STRING)
    BorrowStatus borrowStatus;//tình trạng mượn

    @Enumerated(EnumType.STRING)
    DeposisType deposisType;// đặt cọc

    Instant dueDate;    // hạn trả
    Instant borrowDate;
    Instant returnDate;

    @ManyToOne
    User user;

    @ManyToOne
    Book book;
}
