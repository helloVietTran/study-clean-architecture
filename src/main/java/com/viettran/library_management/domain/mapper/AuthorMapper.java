package com.viettran.library_management.domain.mapper;

import com.viettran.library_management.domain.dto.AuthorDTO;
import com.viettran.library_management.domain.models.Author;
import org.mapstruct.BeanMapping;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;

@Mapper
public interface AuthorMapper {

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    void updateAuthor(@MappingTarget Author author, AuthorDTO authorDTO);
}
