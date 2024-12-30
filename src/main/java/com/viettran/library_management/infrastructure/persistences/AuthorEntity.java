package com.viettran.library_management.infrastructure.persistences;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.Instant;

@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
@Table(name = "author")
public class AuthorEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    String name;
    String biography;
    Instant dob;
    String nationality;

    @Column(name = "awards", columnDefinition = "text[]")
    String[] awards;
}

