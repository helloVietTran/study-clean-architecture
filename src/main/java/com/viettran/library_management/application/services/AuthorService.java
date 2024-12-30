package com.viettran.library_management.application.services;

import com.viettran.library_management.adapter.dto.request.AuthorRequest;
import com.viettran.library_management.adapter.dto.response.AuthorResponse;
import com.viettran.library_management.application.mapper.AuthorMapper;
import com.viettran.library_management.domain.models.Author;
import com.viettran.library_management.domain.services.AuthorDomainService;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class AuthorService {
    AuthorDomainService authorDomainService;
    AuthorMapper authorMapper;

    public AuthorResponse createAuthor(AuthorRequest request){
        Author author =  authorDomainService.createAuthor(authorMapper.toAuthor(request));

        return authorMapper.toAuthorResponse(author);
    }

    public AuthorResponse updateAuthor(AuthorRequest request, Integer authorId){
        Author author = authorDomainService.updateAuthor(authorMapper.toAuthorDTO(request), authorId);

        return authorMapper.toAuthorResponse(author);
    }

    public void deleteAuthor(Integer authorId){
        authorDomainService.deleteAuthor(authorId);
    }
}
