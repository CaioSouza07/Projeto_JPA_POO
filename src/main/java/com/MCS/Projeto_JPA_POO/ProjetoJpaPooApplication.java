package com.MCS.Projeto_JPA_POO;

import com.MCS.Projeto_JPA_POO.entity.Perfil;
import com.MCS.Projeto_JPA_POO.entity.Usuario;
import com.MCS.Projeto_JPA_POO.repository.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

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

			//na tabela de usuarioa
			Usuario caio = new Usuario("Caio", "caio@email.com", "senha123");
			Usuario samuel = new Usuario("Samuel", "samuel@email.com", "senha123");
			Usuario mathias = new Usuario("Mathias", "mathias@email.com", "senha123");
			Usuario vitor = new Usuario("Vitor", "vitor@email.com", "senha123");

			List<Usuario> usuarios = List.of(caio, samuel, mathias, vitor);

			usuarioRepo.saveAll(usuarios);

			//na tabela de perfil
			Perfil perfilCaio = new Perfil("Caioba", caio);
			Perfil perfilCaioOutro = new Perfil("Caiobinha", caio);
			Perfil perfilSamuel = new Perfil("Shura", samuel);

			List<Perfil> perfis = List.of(perfilCaio, perfilCaioOutro, perfilSamuel);

			perfilRepo.saveAll(perfis);

			//na tabela categoria
			

		};
	}

}
