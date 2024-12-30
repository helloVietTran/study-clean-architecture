package com.viettran.library_management.domain.repositories;


import com.viettran.library_management.domain.models.Author;

import java.util.List;
import java.util.Optional;

public interface AuthorRepository {
    Optional<Author> findById(Integer authorId);
    Author save(Author author);
    void delete(Integer authorId);

    //List<Author> findByNameIn(List<String> names);
}
