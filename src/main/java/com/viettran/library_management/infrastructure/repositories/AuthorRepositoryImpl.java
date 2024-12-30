package com.viettran.library_management.infrastructure.repositories;


import com.viettran.library_management.domain.models.Author;
import com.viettran.library_management.domain.repositories.AuthorRepository;
import com.viettran.library_management.infrastructure.mapper.AuthorEntityMapper;
import com.viettran.library_management.infrastructure.persistences.AuthorEntity;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class AuthorRepositoryImpl implements AuthorRepository {

    @PersistenceContext
    private EntityManager entityManager;

    AuthorEntityMapper authorEntityMapper;

    @Override
    public Optional<Author> findById(Integer authorId) {
        AuthorEntity authorEntity = entityManager.find(AuthorEntity.class, authorId);

        return Optional.ofNullable(authorEntityMapper.toAuthor(authorEntity));
    }

    @Override
    public Author save(Author author) {
        AuthorEntity authorEntity = authorEntityMapper.toAuthorEntity(author);
        entityManager.persist(authorEntity);

        author.setId(authorEntity.getId());
        return author;
    }

    @Override
    public void delete(Integer authorId) {
        AuthorEntity authorEntity = entityManager.find(AuthorEntity.class, authorId);
        if (authorEntity != null) {
            entityManager.remove(authorEntity);
        }
    }

    /*
    @Override
    public List<Author> findByNameIn(List<String> names) {
        String query = "SELECT a FROM Author a WHERE a.authorName IN :names";
        TypedQuery<Author> typedQuery = entityManager.createQuery(query, Author.class);
        typedQuery.setParameter("names", names);
        return typedQuery.getResultList();
    }*/
}

