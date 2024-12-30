package com.viettran.library_management.domain.models;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Inventory {
    Integer id;

    int quantity;
    String bookShelfPosition;
}
