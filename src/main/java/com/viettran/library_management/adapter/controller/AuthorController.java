package com.viettran.library_management.adapter.controller;

import com.viettran.library_management.adapter.dto.request.AuthorRequest;
import com.viettran.library_management.adapter.dto.response.ApiResponse;
import com.viettran.library_management.adapter.dto.response.AuthorResponse;
import com.viettran.library_management.application.services.AuthorService;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/authors")
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class AuthorController {
    AuthorService authorService;

    @PostMapping
    ApiResponse<AuthorResponse> createAuthor(@RequestBody AuthorRequest request){
        return ApiResponse.<AuthorResponse>builder()
                .result(authorService.createAuthor(request))
                .build();
    }

    @PutMapping("/{authorId}")
    ApiResponse<AuthorResponse> updateAuthor(
            @RequestBody AuthorRequest request,
            @PathVariable Integer authorId
    ){
        return ApiResponse.<AuthorResponse>builder()
                .result(authorService.updateAuthor(request, authorId))
                .build();
    }

    @DeleteMapping("/{authorId}")
    ApiResponse<String> deleteAuthor(
            @PathVariable Integer authorId
    ){
        authorService.deleteAuthor(authorId);
        return ApiResponse.<String>builder()
                .result("Author has been deleted!")
                .build();
    }
}
