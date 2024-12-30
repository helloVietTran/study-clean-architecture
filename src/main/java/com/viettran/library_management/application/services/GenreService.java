package com.viettran.library_management.application.services;

import com.viettran.library_management.adapter.dto.request.GenreRequest;
import com.viettran.library_management.adapter.dto.response.GenreResponse;
import com.viettran.library_management.application.mapper.GenreMapper;
import com.viettran.library_management.domain.models.Genre;
import com.viettran.library_management.domain.services.GenreDomainService;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class GenreService {
    GenreDomainService genreDomainService;
    GenreMapper genreMapper;

    public GenreResponse createGenre(GenreRequest request){
        Genre genre =  genreDomainService.createGenre(genreMapper.toGenre(request));

        return genreMapper.toGenreResponse(genre);
    }

    public GenreResponse updateGenre(GenreRequest request, Integer genreId){
        Genre genre = genreDomainService.updateGenre(genreMapper.toGenreDTO(request), genreId);

        return genreMapper.toGenreResponse(genre);
    }

    public void deleteGenre(Integer genreId){
        genreDomainService.deleteGenre(genreId);
    }
}
