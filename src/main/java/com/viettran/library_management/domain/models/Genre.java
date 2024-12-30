package com.viettran.library_management.domain.models;


import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Genre {
    Integer id;

    String name;
    String description;

    public boolean isValidName(){
        return this.name.length() > 5;
    }
}
