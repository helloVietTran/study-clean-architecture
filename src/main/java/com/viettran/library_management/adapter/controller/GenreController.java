package com.viettran.library_management.adapter.controller;

import com.viettran.library_management.adapter.dto.request.GenreRequest;
import com.viettran.library_management.adapter.dto.response.ApiResponse;
import com.viettran.library_management.adapter.dto.response.GenreResponse;
import com.viettran.library_management.application.services.GenreService;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/genres")
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class GenreController {
    GenreService genreService;

    @PostMapping
    ApiResponse<GenreResponse> createGenre(@RequestBody GenreRequest request){
        return ApiResponse.<GenreResponse>builder()
                .result(genreService.createGenre(request))
                .build();
    }

    @PutMapping("/{genreId}")
    ApiResponse<GenreResponse> updateGenre(
            @RequestBody GenreRequest request,
            @PathVariable Integer genreId
    ){
        return ApiResponse.<GenreResponse>builder()
                .result(genreService.updateGenre(request, genreId))
                .build();
    }

    @DeleteMapping("/{genreId}")
    ApiResponse<String> deleteGenre(
            @PathVariable Integer genreId
    ){
        genreService.deleteGenre(genreId);
        return ApiResponse.<String>builder()
                .result("Genre has been deleted!")
                .build();
    }
}
