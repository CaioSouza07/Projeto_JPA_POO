package com.MCS.Projeto_JPA_POO.repository;

import com.MCS.Projeto_JPA_POO.entity.Video;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface VideoRepository extends JpaRepository<Video, Long> {


    List<Video> findByTituloContainsOrderByTitulo(String letras);

    List<Video> findByCategoriaNomeOrderByTitulo(String nome);



    @Query("""
    SELECT v 
    FROM Video v 
    LEFT JOIN v.listaAvaliacoes a 
    GROUP BY v 
    ORDER BY AVG(a.nota) DESC
    """)
    List<Video> top10MaisAvaliados(Pageable pageable);




    @Query("""
    SELECT v 
    FROM Video v 
    LEFT JOIN v.listaVisualizacoes vis 
    GROUP BY v 
    ORDER BY COUNT(vis) DESC 
    """)
    List<Video> top10MaisAssistidos(Pageable pageable);



}
