package com.viettran.library_management.adapter.controller;

import com.viettran.library_management.adapter.dto.request.BookRequest;
import com.viettran.library_management.adapter.dto.response.ApiResponse;
import com.viettran.library_management.adapter.dto.response.BookResponse;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/books")
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class BookController {

    // cấu hình pre authorize ở đây
    @PostMapping
    public ApiResponse<BookResponse> createBook(@RequestBody BookRequest request){
        return null;
    }

    @PutMapping
    public ApiResponse<BookResponse> updateBook(@RequestBody BookRequest request){
        return null;
    }

    @DeleteMapping
    public ApiResponse<String> deleteBook(@RequestBody BookRequest request){
        return null;
    }
}
