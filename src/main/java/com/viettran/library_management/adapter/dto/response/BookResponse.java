package com.viettran.library_management.adapter.dto.response;

import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.Instant;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class BookResponse {
    String title;
    String imgSrc;
    String publisher;
    Instant publishedAt;
    String isbn;
    String price;
    String version;

    Set<String> authorNames;
    Set<String> genreNames;
}
