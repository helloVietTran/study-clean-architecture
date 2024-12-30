package com.viettran.library_management.domain.models;

import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.Instant;
// entity khong chứa annotation
// khong phu thuoc vao bat cu ai, ke ca service
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Author {
    Integer id;
    String name;
    String biography;
    Instant dob;

    String nationality;
    String[] awards;

    public boolean isValidName(){
        return this.name.length() > 5;
    }
}
