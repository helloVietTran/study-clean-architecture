package com.viettran.library_management.infrastructure.repositories;

import com.viettran.library_management.domain.models.Genre;
import com.viettran.library_management.domain.repositories.GenreRepository;
import com.viettran.library_management.infrastructure.mapper.GenreEntityMapper;
import com.viettran.library_management.infrastructure.persistences.GenreEntity;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class GenreRepositoryImpl implements GenreRepository {

    @PersistenceContext
    private EntityManager entityManager;

    GenreEntityMapper genreEntityMapper;

    @Override
    public Optional<Genre> findById(Integer genreId) {

        GenreEntity genreEntity = entityManager.find(GenreEntity.class, genreId);

        return Optional.ofNullable(genreEntityMapper.toGenre(genreEntity));
    }

    @Override
    public Genre save(Genre genre) {
        GenreEntity genreEntity = genreEntityMapper.toGenreEntity(genre);
        entityManager.persist(genreEntity);

        genre.setId(genreEntity.getId());
        return  genre;
    }

    @Override
    public void delete(Integer genreId) {
        GenreEntity genreEntity = entityManager.find(GenreEntity.class, genreId);
        if (genreEntity != null) {
            entityManager.remove(genreEntity);
        }
    }
}