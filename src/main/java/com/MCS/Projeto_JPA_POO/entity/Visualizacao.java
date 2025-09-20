package com.MCS.Projeto_JPA_POO.entity;

import java.time.LocalDateTime;

public class Visualizacao {

    private long id;
    private Perfil perfil;
    private Video video;
    private LocalDateTime dataHora;
    private long progresso;

    public Visualizacao() {}

    public Visualizacao(long id, Perfil perfil, Video video, LocalDateTime dataHora, long progresso) {
        this.id = id;
        this.perfil = perfil;
        this.video = video;
        this.dataHora = dataHora;
        this.progresso = progresso;
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

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public void setDataHora(LocalDateTime dataHora) {
        this.dataHora = dataHora;
    }

    public long getProgresso() {
        return progresso;
    }

    public void setProgresso(long progresso) {
        this.progresso = progresso;
    }
}
