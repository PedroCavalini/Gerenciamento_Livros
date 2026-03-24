package com.books.service;


import com.books.model.BookModel;
import com.books.repositories.BookRepositories;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookService {

    private BookRepositories bookRepositories;

    public BookModel save(BookModel bookModel){
        return bookRepositories.save(bookModel);
    }

    public List<BookModel> listarLivros(){
        return bookRepositories.findAll();
    }

    public Optional<BookModel> buscarPorId(Long id){
        return bookRepositories.findById(id);
    }

    public void deletar(Long id){
        bookRepositories.deleteById(id);
    }
}
