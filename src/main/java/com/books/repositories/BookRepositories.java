package com.books.repositories;

import com.books.model.BookModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepositories  extends JpaRepository<BookModel, Long> {
}
