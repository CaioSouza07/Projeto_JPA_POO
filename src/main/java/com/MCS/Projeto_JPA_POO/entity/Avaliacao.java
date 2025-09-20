package com.MCS.Projeto_JPA_POO.entity;

public class Avaliacao {

    private long id;
    private Perfil perfil;
    private Video video;
    private int nota;
    private String comentario;

    public Avaliacao() {}

    public Avaliacao(long id, Perfil perfil, Video video, int nota, String comentario) {
        this.id = id;
        this.perfil = perfil;
        this.video = video;
        this.nota = nota;
        this.comentario = comentario;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Perfil getPerfil() {
        return perfil;
    }

    public void setPerfil(Perfil perfil) {
        this.perfil = perfil;
    }

    public Video getVideo() {
        return video;
    }

    public void setVideo(Video video) {
        this.video = video;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }
}
