package com.viettran.library_management.domain.repositories;


import com.viettran.library_management.domain.models.Genre;

import java.util.Optional;

public interface GenreRepository {

    Optional<Genre> findById(Integer genreId);
    Genre save(Genre genre);
    void delete(Integer genreId);
}
