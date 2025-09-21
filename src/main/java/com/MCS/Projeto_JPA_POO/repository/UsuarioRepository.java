package com.MCS.Projeto_JPA_POO.repository;

import com.MCS.Projeto_JPA_POO.entity.Usuario;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

    @Query("""
        SELECT v.perfil.usuario
        FROM Visualizacao v
        GROUP BY v.perfil.usuario
        ORDER BY COUNT(v) DESC
        
    """)
    List<Usuario> usuarioMaisAtivo(Pageable pageable);

}

