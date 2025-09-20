package com.MCS.Projeto_JPA_POO.repository;

import com.MCS.Projeto_JPA_POO.entity.Video;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface VideoRepository extends JpaRepository<Video, Long> {

    List<Video> findByTituloContainsOrderByTitulo(String letras);

}
