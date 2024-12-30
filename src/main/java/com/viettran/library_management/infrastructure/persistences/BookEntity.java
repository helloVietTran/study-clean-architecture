package com.viettran.library_management.infrastructure.persistences;

import com.viettran.library_management.domain.models.Author;
import com.viettran.library_management.domain.models.Borrow;
import com.viettran.library_management.domain.models.Genre;
import com.viettran.library_management.domain.models.Inventory;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;

import java.time.Instant;
import java.util.Set;

@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
@Table(name = "book")
public class BookEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    String imgSrc;
    String title;
    String pageNumber;
    String publisher;
    String isbn;
    String price;
    String version;

    Instant publishedAt;

    @ManyToMany
    Set<Author> authors;

    @ManyToMany
    Set<Genre> genres;

    @OneToMany
    Set<Borrow> borrows;

    @OneToOne(mappedBy = "book")
    Inventory inventory;
}
