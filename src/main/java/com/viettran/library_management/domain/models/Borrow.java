package com.viettran.library_management.domain.models;

import com.viettran.library_management.domain.enums.BorrowStatus;
import com.viettran.library_management.domain.enums.DeposisType;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.Instant;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Borrow {
    Integer id;

    BorrowStatus borrowStatus;//tình trạng mượn
    DeposisType deposisType;// đặt cọc
    Instant dueDate;    // hạn trả
    Instant borrowDate;
    Instant returnDate;
    String[] conditions;// tình trạng sách khi trả
    User user;
    Book book;

    public boolean isOverDue() {
        return Instant.now().isAfter(dueDate);
    }

}


