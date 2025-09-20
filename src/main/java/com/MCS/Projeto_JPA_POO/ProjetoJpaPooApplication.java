package com.MCS.Projeto_JPA_POO;

import com.MCS.Projeto_JPA_POO.entity.Usuario;
import com.MCS.Projeto_JPA_POO.repository.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;

@SpringBootApplication
public class ProjetoJpaPooApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjetoJpaPooApplication.class, args);
	}

	@Bean
	CommandLineRunner run(
		UsuarioRepository usuarioRepo,
		AvaliacaoRepository avaliacaoRepo,
		PerfilRepository perfilRepo,
		CategoriaRepository categoriaRepo,
		VideoRepository videoRepo,
		VisualizacaoRepository visualRepo
	){
		return args -> {

			//BORA INSERIR ALGUNS DADOS NO NOSSA BANCOO

			usuarioRepo.save(new Usuario(null,"Caio", "caio@email.com", "senha123", LocalDate.now(), ));

		}
	}

}
