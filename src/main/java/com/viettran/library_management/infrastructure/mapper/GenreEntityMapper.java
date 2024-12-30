package com.viettran.library_management.infrastructure.mapper;

import com.viettran.library_management.domain.models.Genre;
import com.viettran.library_management.infrastructure.persistences.GenreEntity;
import org.mapstruct.BeanMapping;
import org.mapstruct.Mapper;
import org.mapstruct.NullValuePropertyMappingStrategy;

@Mapper
public interface GenreEntityMapper {
    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    GenreEntity toGenreEntity(Genre genre);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Genre toGenre(GenreEntity genreEntity);
}

