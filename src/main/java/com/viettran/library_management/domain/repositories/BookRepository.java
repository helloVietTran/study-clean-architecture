package com.viettran.library_management.domain.repositories;

import com.viettran.library_management.domain.models.Book;

import java.util.Optional;
import java.util.Set;

public interface BookRepository {

    Optional<Book> findByTitleAndAuthors(String title, Set<String> authorNames);

    Optional<Book> findById(String bookId);
    void save(Book book);
    void delete(String bookId);
}
