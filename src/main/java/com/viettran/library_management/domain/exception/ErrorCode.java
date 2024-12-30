package com.viettran.library_management.domain.exception;


import lombok.Getter;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;

@Getter
public enum ErrorCode {
    UNCATEGORIZED_EXCEPTION(1999, "Uncategorized error", HttpStatus.INTERNAL_SERVER_ERROR),

    AUTHOR_NAME_NOT_VALID(1010, "Author name must be longer than 5 characters ", HttpStatus.BAD_REQUEST),
    AUTHOR_NOT_EXISTS(1011, "Author not exist", HttpStatus.BAD_REQUEST),

    BOOK_ALREADY_EXISTS(1100, "This book already exists", HttpStatus.BAD_REQUEST),

    UNAUTHENTICATED(1900, "Unauthenticated", HttpStatus.UNAUTHORIZED),
    UNAUTHORIZED(1901, "You do not have permission", HttpStatus.FORBIDDEN),
    ;

    ErrorCode(int code, String message, HttpStatusCode statusCode) {
        this.code = code;
        this.message = message;
        this.statusCode = statusCode;
    }

    private final int code;
    private final String message;
    private final HttpStatusCode statusCode;
}
