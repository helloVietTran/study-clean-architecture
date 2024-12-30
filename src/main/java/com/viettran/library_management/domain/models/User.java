package com.viettran.library_management.domain.models;

import com.viettran.library_management.domain.enums.AccountStatus;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.Instant;
import java.util.Set;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class User {
    Integer id;

    String firstName;
    String lastName;

    String email;

    String password;
    String imgSrc;

    String phoneNumber;
    String address;

    Instant dob;
    Instant createdAt;

    AccountStatus accountStatus;

    Set<Role> roles;
    Set<Borrow> borrows;
    Set<Fine> fines;
}

