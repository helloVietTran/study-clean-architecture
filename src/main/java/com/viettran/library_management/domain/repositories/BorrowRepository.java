package com.viettran.library_management.domain.repositories;


import com.viettran.library_management.domain.models.Borrow;

import java.util.Optional;

public interface BorrowRepository {

    Optional<Borrow> findById(String borrowId);
    void save(Borrow borrow);
    void delete(String borrowId);
}

