package com.viettran.library_management.domain.services;

import com.viettran.library_management.domain.dto.AuthorDTO;
import com.viettran.library_management.domain.exception.AppException;
import com.viettran.library_management.domain.exception.ErrorCode;
import com.viettran.library_management.domain.mapper.AuthorMapper;
import com.viettran.library_management.domain.models.Author;
import com.viettran.library_management.domain.repositories.AuthorRepository;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
@Slf4j
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class AuthorDomainService {
    AuthorRepository authorRepository;
    AuthorMapper authorMapper;

    public Author createAuthor(Author author){
        boolean isValidName = author.isValidName();
        if (isValidName)
            throw  new AppException(ErrorCode.AUTHOR_NAME_NOT_VALID);

        return authorRepository.save(author);
    }

    public Author updateAuthor(AuthorDTO authorDTO, Integer authorId){
        Optional<Author> authorOptional = authorRepository.findById(authorId);

        if(authorOptional.isEmpty())
            throw new AppException(ErrorCode.AUTHOR_NOT_EXISTS);

        authorMapper.updateAuthor(authorOptional.get(),authorDTO);

        return authorRepository.save(authorOptional.get());
    }

    public void deleteAuthor(Integer authorId){
        authorRepository.delete(authorId);
    }
}
