package com.MCS.Projeto_JPA_POO.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "categorias")
public class Categoria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome", unique = true)
    private String nome;

    @OneToMany(mappedBy = "categoria")
    private List<Video> listaVideos;

    public Categoria() {}

    public Categoria(Long id, String nome, List<Video> listaVideos) {
        this.id = id;
        this.nome = nome;
        this.listaVideos = listaVideos;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Video> getListaVideos() {
        return listaVideos;
    }

    public void setListaVideos(List<Video> listaVideos) {
        this.listaVideos = listaVideos;
    }
}
