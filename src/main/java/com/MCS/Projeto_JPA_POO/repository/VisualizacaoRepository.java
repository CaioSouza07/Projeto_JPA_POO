package com.MCS.Projeto_JPA_POO.repository;

import com.MCS.Projeto_JPA_POO.entity.Video;
import com.MCS.Projeto_JPA_POO.entity.Visualizacao;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface VisualizacaoRepository extends JpaRepository<Visualizacao, Long> {

}