package com.viettran.library_management.infrastructure.repositories;

import com.viettran.library_management.domain.models.Book;
import com.viettran.library_management.domain.repositories.BookRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Set;
import java.util.Optional;

@Repository
public class BookRepositoryImpl implements BookRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public Optional<Book> findById(String bookId) {
        Book book = entityManager.find(Book.class, bookId);
        return Optional.ofNullable(book);
    }

    @Override
    public void save(Book book) {
        entityManager.persist(book);
    }

    @Override
    public void delete(String bookId) {
        Book book = entityManager.find(Book.class, bookId);
        if (book != null) {
            entityManager.remove(book);
        }
    }

    @Override
    public Optional<Book> findByTitleAndAuthors(String title, Set<String> authorNames) {
        String query = "SELECT b FROM book b JOIN b.authors a " +
                "WHERE b.title = :title AND a.authorName IN :authorNames " +
                "GROUP BY b.bookId HAVING COUNT(a.authorName) = :authorCount";
        TypedQuery<Book> typedQuery = entityManager.createQuery(query, Book.class);
        typedQuery.setParameter("title", title);
        typedQuery.setParameter("authorNames", authorNames);
        typedQuery.setParameter("authorCount", authorNames.size());

        List<Book> books = typedQuery.getResultList();
        return books.isEmpty() ? Optional.empty() : Optional.of(books.get(0));
    }
}
