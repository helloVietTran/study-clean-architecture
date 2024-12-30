package com.viettran.library_management.adapter.dto.response;

import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.Instant;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class AuthorResponse {
    Integer id;
    String name;
    String biography;
    Instant dob;
    String nationality;
    String[] awards;
}
