package com.MCS.Projeto_JPA_POO;

import com.MCS.Projeto_JPA_POO.entity.*;
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
//			Usuario caio = new Usuario("Caio", "caio@email.com", "senha123");
//			Usuario samuel = new Usuario("Samuel", "samuel@email.com", "senha123");
//			Usuario mathias = new Usuario("Mathias", "mathias@email.com", "senha123");
//			Usuario vitor = new Usuario("Vitor", "vitor@email.com", "senha123");
//
//			List<Usuario> usuarios = List.of(caio, samuel, mathias, vitor);
//
//			usuarioRepo.saveAll(usuarios);

			//na tabela de perfil
//			Perfil perfilCaio = new Perfil("Caioba", caio);
//			Perfil perfilCaioOutro = new Perfil("Caiobinha", caio);
//			Perfil perfilSamuel = new Perfil("Shura", samuel);
//
//			List<Perfil> perfis = List.of(perfilCaio, perfilCaioOutro, perfilSamuel);
//
//			perfilRepo.saveAll(perfis);

			//na tabela categoria
//			Categoria acaoAventura = new Categoria("Ação e Aventura");
//			Categoria horror = new Categoria("Terror");
//			Categoria suspense = new Categoria("Suspense");
//
//			List<Categoria> categorias = List.of(acaoAventura, horror, suspense);
//
//			categoriaRepo.saveAll(categorias);

			//na tabela de videos
//			Video gladiador = new Video("Gladiador", "Gladiador é um épico histórico que acompanha a jornada de Máximo, um general romano traído que se torna escravo e gladiador. Movido por vingança, ele luta para desafiar o corrupto imperador e restaurar a justiça em Roma.", 120, acaoAventura);
//			Video buscaImplacavel = new Video("Busca Implacável", "Busca Implacável é um thriller de ação que acompanha Bryan Mills, um ex-agente da CIA, que precisa resgatar sua filha sequestrada por uma rede de tráfico humano em Paris, usando suas habilidades para localizar os criminosos antes que seja tarde.", 120, acaoAventura);
//			Video anabelle = new Video("Anabelle", "Annabelle é um filme de terror que conta a história de uma boneca possuída por uma entidade maligna. Um casal recém-chegado à sua nova casa presencia eventos sobrenaturais ligados à boneca, que começa a espalhar medo e violência.", 150, horror);
//			Video lugarSilencioso = new Video("Um Lugar Silencioso", "Um Lugar Silencioso é um suspense/terror que acompanha uma família vivendo em completo silêncio para sobreviver a criaturas mortais que caçam pelo som. Cada ruído pode ser fatal, tornando sua rotina tensa e assustadora enquanto lutam para proteger uns aos outros.", 150, suspense);
//
//			List<Video> videos = List.of(gladiador, buscaImplacavel, anabelle, lugarSilencioso);
//
//			videoRepo.saveAll(videos);

			//na tabela de visualizacoes
//			Visualizacao viewCaioBusca = new Visualizacao(perfilCaio, buscaImplacavel, 90L);
//			Visualizacao viewCaioAnabelle = new Visualizacao(perfilCaio, anabelle, 50L);
//			Visualizacao viewSamuelGladiador = new Visualizacao(perfilSamuel, gladiador, 120L);
//			Visualizacao viewSamuelBusca = new Visualizacao(perfilSamuel, buscaImplacavel, 110L);
//			Visualizacao viewCaioOutroLugar = new Visualizacao(perfilCaioOutro, lugarSilencioso, 130L);
//			Visualizacao viewCaioOutroAnabelle = new Visualizacao(perfilCaioOutro, anabelle, 80L);
//
//			List<Visualizacao> visualizacoes = List.of(viewCaioAnabelle, viewCaioOutroAnabelle, viewCaioBusca, viewSamuelBusca, viewSamuelGladiador, viewCaioOutroLugar);
//
//			visualRepo.saveAll(visualizacoes);

			//na tabela avaliacoes
//			Avaliacao avalCaioBusca = new Avaliacao(perfilCaio, buscaImplacavel, 5, "Filmão do caramba bixo, espetacular");
//			Avaliacao avalSamuelGla = new Avaliacao(perfilSamuel, gladiador, 5,"QUE FILME PO, simplesmente histórico cara, que loucura!");
//			Avaliacao avalCaioOutroAna = new Avaliacao(perfilCaioOutro, anabelle, 1, "Uma merda, não gosto de terror ta loko");
//
//			List<Avaliacao> avaliacoes = List.of(avalCaioBusca, avalCaioOutroAna, avalSamuelGla);
//
//			avaliacaoRepo.saveAll(avaliacoes);


			// COMEÇAR A FAZER AS BUSCAS

			//Busca de caracteres no titulo
			System.out.println("Segue lista de títulos que possuem 'o':");
			videoRepo.findByTituloContainsOrderByTitulo("o").forEach(video ->
					System.out.println(video.getTitulo() + " - " + video.getCategoria().getNome())
			);


		};
	}

}
