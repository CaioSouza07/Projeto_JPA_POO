package com.MCS.Projeto_JPA_POO.entity;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "usuarios")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String senha;
    private LocalDate dataCadastro;

    @OneToMany(mappedBy = "usuario")
    private List<Perfil> listaPerfis;

    public Usuario() {}

    public Usuario(Long id, String nome, String senha, LocalDate dataCadastro, List<Perfil> listaPerfis) {
        this.id = id;
        this.nome = nome;
        this.senha = senha;
        this.dataCadastro = dataCadastro;
        this.listaPerfis = listaPerfis;
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

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public LocalDate getdataCadastro() {
        return dataCadastro;
    }

    public void setdataCadastro(LocalDate dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public List<Perfil> getListaPerfis() {
        return listaPerfis;
    }

    public void setListaPerfis(List<Perfil> listaPerfis) {
        this.listaPerfis = listaPerfis;
    }
}
