package com.viettran.library_management.domain.services;

import com.viettran.library_management.domain.dto.GenreDTO;
import com.viettran.library_management.domain.exception.AppException;
import com.viettran.library_management.domain.exception.ErrorCode;
import com.viettran.library_management.domain.mapper.GenreMapper;
import com.viettran.library_management.domain.models.Genre;
import com.viettran.library_management.domain.repositories.GenreRepository;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
@Slf4j
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class GenreDomainService {
    GenreRepository genreRepository;
    GenreMapper genreMapper;

    public Genre createGenre(Genre genre){
        boolean isValidName = genre.isValidName();
        if (isValidName)
            throw  new AppException(ErrorCode.AUTHOR_NAME_NOT_VALID);

        return genreRepository.save(genre);
    }

    public Genre updateGenre(GenreDTO genreDTO, Integer genreId){
        Optional<Genre> genreOptional = genreRepository.findById(genreId);

        if(genreOptional.isEmpty())
            throw new AppException(ErrorCode.AUTHOR_NOT_EXISTS);

        genreMapper.updateGenre(genreOptional.get(),genreDTO);

        return genreRepository.save(genreOptional.get());
    }

    public void deleteGenre(Integer genreId){
        genreRepository.delete(genreId);
    }
}
