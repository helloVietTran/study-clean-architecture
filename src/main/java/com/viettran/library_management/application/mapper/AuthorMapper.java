package com.viettran.library_management.application.mapper;

import com.viettran.library_management.adapter.dto.request.AuthorRequest;
import com.viettran.library_management.adapter.dto.response.AuthorResponse;
import com.viettran.library_management.domain.dto.AuthorDTO;
import com.viettran.library_management.domain.models.Author;
import org.mapstruct.Mapper;

// chuyen thanh kieu du lieu phu hop
@Mapper
public interface AuthorMapper {
    Author toAuthor(AuthorRequest request);
    AuthorResponse toAuthorResponse(Author author);

    AuthorDTO toAuthorDTO(AuthorRequest request);
}
