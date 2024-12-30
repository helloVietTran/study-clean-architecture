package com.viettran.library_management.application.mapper;

import com.viettran.library_management.adapter.dto.request.GenreRequest;
import com.viettran.library_management.adapter.dto.response.GenreResponse;

import com.viettran.library_management.domain.dto.GenreDTO;
import com.viettran.library_management.domain.models.Genre;
import org.mapstruct.Mapper;

@Mapper
public interface GenreMapper {
    Genre toGenre(GenreRequest request);
    GenreResponse toGenreResponse(Genre genre);

    GenreDTO toGenreDTO(GenreRequest request);
}
