package com.viettran.library_management.domain.dto;

import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.Instant;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class AuthorDTO {
    String name;
    String biography;
    Instant dob;
    String nationality;
    String[] awards;
}
