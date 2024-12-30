package com.viettran.library_management.infrastructure.persistences;

import com.viettran.library_management.domain.models.Borrow;
import com.viettran.library_management.domain.models.Fine;
import com.viettran.library_management.domain.models.Role;
import com.viettran.library_management.domain.enums.AccountStatus;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;

import java.time.Instant;
import java.util.Set;


@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
@Table(name = "user")
public class UserEntity {
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

    @ManyToMany
    Set<Role> roles;

    @OneToMany
    Set<Borrow> borrows;

    @OneToMany
    Set<Fine> fines;
}
