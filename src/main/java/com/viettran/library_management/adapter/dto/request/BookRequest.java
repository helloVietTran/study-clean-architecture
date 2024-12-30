package com.viettran.library_management.adapter.dto.request;

import lombok.*;
import lombok.experimental.FieldDefaults;
import org.springframework.web.multipart.MultipartFile;

import java.time.Instant;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class BookRequest {
    String title;

    MultipartFile file;
    String pageNumber;
    String publisher;
    Instant publishedAt;
    String isbn;
    String price;
    String version;

    Set<String> authorNames;
    Set<String> genreNames;
}
