package com.MCS.Projeto_JPA_POO.entity;

import java.util.List;

public class Categoria {

    private long id;
    private String nome;
    private List<Video> listaVideos;

    public Categoria() {}

    public Categoria(long id, String nome, List<Video> listaVideos) {
        this.id = id;
        this.nome = nome;
        this.listaVideos = listaVideos;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
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
