package com.viettran.library_management.domain.models;

import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZoneOffset;
import java.util.Set;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Book {
    Integer id;
    String imgSrc;
    String title;
    String pageNumber;
    String publisher;
    String isbn;
    String price;
    String version;

    Instant publishedAt;

    Set<Author> authors;
    Set<Borrow> borrow;
    Set<Genre> genres;

    public boolean isPublishedAfter1945(){
        Instant instant1945 = LocalDateTime.of(1945, Month.JANUARY, 1, 0, 0)
                .toInstant(ZoneOffset.UTC);

        return publishedAt.isAfter(instant1945);
    }
}
