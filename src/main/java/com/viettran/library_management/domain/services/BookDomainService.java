package com.viettran.library_management.domain.services;

import com.viettran.library_management.domain.exception.AppException;
import com.viettran.library_management.domain.exception.ErrorCode;
import com.viettran.library_management.domain.repositories.BookRepository;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Set;

// domain service co the phu thuoc vao repository nhung chi duoc goi qua interface
// khong biet interface trien khai nhu nao
@Service
@RequiredArgsConstructor
@Slf4j
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class BookDomainService {
    BookRepository bookRepository;

    public void canAddBook(String bookTitle, Set<String> authorNames){
        boolean isDuplicate =  bookRepository
                .findByTitleAndAuthors(bookTitle, authorNames).isPresent();

        if(isDuplicate)
            throw new AppException(ErrorCode.BOOK_ALREADY_EXISTS);
    }



}
