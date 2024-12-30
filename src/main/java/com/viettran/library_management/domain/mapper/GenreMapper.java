package com.viettran.library_management.domain.mapper;

import com.viettran.library_management.domain.dto.GenreDTO;
import com.viettran.library_management.domain.models.Genre;
import org.mapstruct.BeanMapping;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;

@Mapper
public interface GenreMapper {
    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    void updateGenre(@MappingTarget Genre genre, GenreDTO genreDTO);
}
