package com.MCS.Projeto_JPA_POO.entity;

import java.time.LocalDate;
import java.util.List;

public class Usuario {

    private long id;
    private String nome;
    private String senha;
    private LocalDate dataCadstro;
    private List<Perfil> listaPerfis;

    public Usuario() {}

    public Usuario(long id, String nome, String senha, LocalDate dataCadstro, List<Perfil> listaPerfis) {
        this.id = id;
        this.nome = nome;
        this.senha = senha;
        this.dataCadstro = dataCadstro;
        this.listaPerfis = listaPerfis;
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

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public LocalDate getDataCadstro() {
        return dataCadstro;
    }

    public void setDataCadstro(LocalDate dataCadstro) {
        this.dataCadstro = dataCadstro;
    }

    public List<Perfil> getListaPerfis() {
        return listaPerfis;
    }

    public void setListaPerfis(List<Perfil> listaPerfis) {
        this.listaPerfis = listaPerfis;
    }
}
