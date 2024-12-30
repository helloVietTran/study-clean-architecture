package com.viettran.library_management.infrastructure.persistences;

import com.viettran.library_management.domain.models.Book;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;

@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
@Table(name = "inventory")
public class InventoryEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    int quantity;
    String bookShelfPosition;

    @OneToOne
    Book book;
}
