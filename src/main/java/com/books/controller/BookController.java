package com.books.controller;


import com.books.model.BookModel;
import com.books.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/livros")
public class BookController {

    @Autowired
    private BookService service;

    @PostMapping
    public BookModel criarLivro(@RequestBody BookModel bookModel){
        return service.save(bookModel);
    }

    @GetMapping
    public List<BookModel> listarLivros(){
        return service.listarLivros();
    }

    @GetMapping("/{id}")
    public BookModel buscarPorId(@PathVariable Long id){
        return service.buscarPorId(id).orElse(null);
    }

    @DeleteMapping("/{id}")
    public void deletarLivro(@PathVariable Long id){
        service.deletar(id);
    }


}
