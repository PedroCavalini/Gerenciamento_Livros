package com.books.model;

import jakarta.persistence.*;

@Entity(name = "Livro")
@Table(name = "tb_livro")
public class BookModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "col_titulo")
    private String titulo;

    @Column(name = "col_autor")
    private String autor;

    @Column(name = "ano_publicacao")
    private Integer anoPublicacao;

    public BookModel() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Integer getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(Integer anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }
}