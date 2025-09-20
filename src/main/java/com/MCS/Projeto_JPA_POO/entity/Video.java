package com.MCS.Projeto_JPA_POO.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "videos")
public class Video {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private String descricao;
    private int duracao;

    @ManyToOne
    @JoinColumn(name = "categoria_id")
    private Categoria categoria;

    @OneToMany(mappedBy = "video")
    private List<Visualizacao> listaVisualizacoes;

    @OneToMany(mappedBy = "video")
    private List<Avaliacao> listaAvaliacoes;

    public Video() {}

    public Video(Long id, String titulo, String descricao, int duracao, Categoria categoria, List<Visualizacao> listaVisualizacoes, List<Avaliacao> listaAvaliacoes) {
        this.id = id;
        this.titulo = titulo;
        this.descricao = descricao;
        this.duracao = duracao;
        this.categoria = categoria;
        this.listaVisualizacoes = listaVisualizacoes;
        this.listaAvaliacoes = listaAvaliacoes;
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

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
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
