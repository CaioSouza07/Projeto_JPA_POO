package com.MCS.Projeto_JPA_POO.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "perfis")
public class Perfil {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nomePerfil;

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;

    @OneToMany(mappedBy = "perfil")
    private List<Visualizacao> listaVisualizacoes;

    @OneToMany(mappedBy = "perfil")
    private List<Avaliacao> listaAvaliacoes;

    public Perfil() {}

    public Perfil(long id, String nomePerfil, Usuario usuario, List<Visualizacao> listaVisualizacoes, List<Avaliacao> listaAvaliacoes) {
        this.id = id;
        this.nomePerfil = nomePerfil;
        this.usuario = usuario;
        this.listaVisualizacoes = listaVisualizacoes;
        this.listaAvaliacoes = listaAvaliacoes;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNomePerfil() {
        return nomePerfil;
    }

    public void setNomePerfil(String nomePerfil) {
        this.nomePerfil = nomePerfil;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public List<Visualizacao> getListaVisualizacoes() {
        return listaVisualizacoes;
    }

    public void setListaVisualizacoes(List<Visualizacao> listaVisualizacoes) {
        this.listaVisualizacoes = listaVisualizacoes;
    }

    public List<Avaliacao> getListaAvaliacoes() {
        return listaAvaliacoes;
    }

    public void setListaAvaliacoes(List<Avaliacao> listaAvaliacoes) {
        this.listaAvaliacoes = listaAvaliacoes;
    }
}
