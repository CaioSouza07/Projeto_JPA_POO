package com.MCS.Projeto_JPA_POO.repository;

import com.MCS.Projeto_JPA_POO.entity.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
}
