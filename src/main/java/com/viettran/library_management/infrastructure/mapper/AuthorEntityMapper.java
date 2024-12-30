package com.viettran.library_management.infrastructure.mapper;

import com.viettran.library_management.domain.models.Author;
import com.viettran.library_management.infrastructure.persistences.AuthorEntity;
import org.mapstruct.BeanMapping;
import org.mapstruct.Mapper;
import org.mapstruct.NullValuePropertyMappingStrategy;

@Mapper
public interface AuthorEntityMapper {
    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    AuthorEntity toAuthorEntity(Author author);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Author toAuthor(AuthorEntity authorEntity);
}
