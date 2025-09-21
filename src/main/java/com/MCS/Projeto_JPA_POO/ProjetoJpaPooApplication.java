package com.MCS.Projeto_JPA_POO;

import com.MCS.Projeto_JPA_POO.entity.*;
import com.MCS.Projeto_JPA_POO.repository.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.domain.PageRequest;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

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

//			BORA INSERIR ALGUNS DADOS NO NOSSA BANCOO

//			na tabela de usuarioa
			Usuario caio = new Usuario("Caio", "caio@email.com", "senha123");
			Usuario samuel = new Usuario("Samuel", "samuel@email.com", "senha123");
			Usuario mathias = new Usuario("Mathias", "mathias@email.com", "senha123");
			Usuario vitor = new Usuario("Vitor", "vitor@email.com", "senha123");

			List<Usuario> usuarios = List.of(caio, samuel, mathias, vitor);

			usuarioRepo.saveAll(usuarios);

//			na tabela de perfil
			Perfil perfilCaio = new Perfil("Caioba", caio);
			Perfil perfilCaioOutro = new Perfil("Caiobinha", caio);
			Perfil perfilSamuel = new Perfil("Shura", samuel);
			Perfil perfilMathias = new Perfil("Gruber", mathias);
			Perfil perfilVitor = new Perfil("RennerVitor", vitor);

			List<Perfil> perfis = List.of(perfilCaio, perfilCaioOutro, perfilSamuel, perfilMathias, perfilVitor);

			perfilRepo.saveAll(perfis);

//			na tabela categoria
			Categoria acaoAventura = new Categoria("Ação e Aventura");
			Categoria horror = new Categoria("Terror");
			Categoria suspense = new Categoria("Suspense");
			Categoria romance = new Categoria("Romance");
			Categoria epico = new Categoria("Épico");
			Categoria ficcaoCientifica = new Categoria("Ficção Científica");
			Categoria animacao = new Categoria("Animação");
			Categoria drama = new Categoria("Drama");


			List<Categoria> categorias = List.of(acaoAventura, horror, suspense, romance, epico, ficcaoCientifica, animacao, drama);

			categoriaRepo.saveAll(categorias);

//			na tabela de videos
			Video gladiador = new Video("Gladiador", "Gladiador é um épico histórico que acompanha a jornada de Máximo, um general romano traído que se torna escravo e gladiador. Movido por vingança, ele luta para desafiar o corrupto imperador e restaurar a justiça em Roma.", 120, acaoAventura);
			Video buscaImplacavel = new Video("Busca Implacável", "Busca Implacável é um thriller de ação que acompanha Bryan Mills, um ex-agente da CIA, que precisa resgatar sua filha sequestrada por uma rede de tráfico humano em Paris, usando suas habilidades para localizar os criminosos antes que seja tarde.", 120, acaoAventura);
			Video anabelle = new Video("Anabelle", "Annabelle é um filme de terror que conta a história de uma boneca possuída por uma entidade maligna. Um casal recém-chegado à sua nova casa presencia eventos sobrenaturais ligados à boneca, que começa a espalhar medo e violência.", 150, horror);
			Video lugarSilencioso = new Video("Um Lugar Silencioso", "Um Lugar Silencioso é um suspense/terror que acompanha uma família vivendo em completo silêncio para sobreviver a criaturas mortais que caçam pelo som. Cada ruído pode ser fatal, tornando sua rotina tensa e assustadora enquanto lutam para proteger uns aos outros.", 150, suspense);
			Video culpaEstrelas = new Video("A Culpa é das Estrelas", "Narra o romance de dois adolescentes que se conhecem (e se apaixonam) em um Grupo de Apoio para Crianças com Câncer: Hazel, uma jovem de dezesseis anos que sobrevive graças a uma droga revolucionária que detém a metástase em seus pulmões, e Augustus Waters, de dezessete, ex-jogador de basquete que perdeu a perna para o osteosarcoma.", 120, romance);
			Video pompeia = new Video("Pompéia", "Alguns dias antes da lendária erupção do monte Vesúvio, o escravo Milo (Kit Harrington) está preso dentro de um navio, em direção à Nápoles. Ele vai fazer de tudo para escapar e salvar a mulher que ama, além de ajudar o seu melhor amigo, um gladiador que está em dificuldades no interior do Coliseu.", 150, epico);
			Video vingadores = new Video("Os Vingadores", "Os Vingadores reúne os maiores heróis da Marvel — Homem de Ferro, Capitão América, Thor, Hulk, Viúva Negra e Gavião Arqueiro — que precisam unir forças para enfrentar Loki e seu exército alienígena em uma batalha épica pelo futuro da Terra.", 143, acaoAventura);
			Video titanic = new Video("Titanic", "Titanic é um romance dramático que narra a história de amor entre Jack e Rose a bordo do famoso navio condenado. Enquanto vivem uma intensa paixão, precisam enfrentar a tragédia do naufrágio que mudará suas vidas para sempre.", 195, romance);
			Video matrix = new Video("Matrix", "Matrix é um sci-fi revolucionário em que Neo, um hacker, descobre que o mundo em que vive é uma simulação criada por máquinas. Com a ajuda de Morpheus e Trinity, ele deve enfrentar agentes poderosos e despertar para a verdade.", 136, ficcaoCientifica);
			Video coringa = new Video("Coringa", "Coringa acompanha Arthur Fleck, um comediante fracassado que sofre abusos e rejeição social, até se transformar no temido vilão de Gotham. Um retrato sombrio sobre isolamento, violência e a perda da sanidade.", 122, drama);
			Video velozes = new Video("Velozes e Furiosos", "Dominic Toretto lidera corridas de rua ilegais até conhecer Brian, um policial infiltrado. Entre corridas cheias de adrenalina e conflitos de lealdade, nasce uma amizade inesperada em meio a perseguições eletrizantes.", 106, acaoAventura);
			Video invocacao = new Video("Invocação do Mal", "Baseado em fatos reais, o filme acompanha os investigadores paranormais Ed e Lorraine Warren ajudando uma família aterrorizada por forças malignas em sua nova casa. O terror cresce à medida que os eventos se intensificam.", 112, horror);
			Video interestelar = new Video("Interestelar", "Interestelar é uma ficção científica em que um grupo de astronautas viaja por buracos de minhoca em busca de um novo lar para a humanidade, enquanto Cooper luta para voltar para sua filha em meio a dilemas cósmicos.", 169, ficcaoCientifica);
			Video reiLeao = new Video("O Rei Leão", "O Rei Leão é a jornada de Simba, um leãozinho que precisa enfrentar a perda do pai e assumir seu lugar como rei da savana. Uma história emocionante sobre coragem, amizade e destino.", 118, animacao);
			Video seEuFicar = new Video("Se Eu Ficar", "Após um trágico acidente, Mia fica em coma e precisa decidir se deseja lutar para viver ou partir. Em meio a lembranças de sua família e do amor por Adam, ela enfrenta a escolha mais difícil de sua vida.", 107, romance);
			Video fragmentado = new Video("Fragmentado", "Um suspense intenso sobre Kevin, um homem com 23 personalidades distintas que sequestra três adolescentes. À medida que as jovens tentam escapar, uma nova e perigosa identidade ameaça emergir.", 117, suspense);



			List<Video> videos = List.of(gladiador, buscaImplacavel, anabelle, lugarSilencioso, culpaEstrelas, pompeia, vingadores, titanic, matrix, coringa, velozes, invocacao, interestelar, reiLeao, seEuFicar, fragmentado);

			videoRepo.saveAll(videos);


			// na tabela de visualizacoes
			Visualizacao viewCaioBusca = new Visualizacao(perfilCaio, buscaImplacavel, 90L);
			Visualizacao viewCaioAnabelle = new Visualizacao(perfilCaio, anabelle, 50L);
			Visualizacao viewSamuelGladiador = new Visualizacao(perfilSamuel, gladiador, 120L);
			Visualizacao viewSamuelBusca = new Visualizacao(perfilSamuel, buscaImplacavel, 110L);
			Visualizacao viewCaioOutroLugar = new Visualizacao(perfilCaioOutro, lugarSilencioso, 130L);
			Visualizacao viewCaioOutroAnabelle = new Visualizacao(perfilCaioOutro, anabelle, 80L);
			Visualizacao viewMathiasVingadores = new Visualizacao(perfilMathias, vingadores, 100L);
			Visualizacao viewMathiasMatrix = new Visualizacao(perfilMathias, matrix, 140L);
			Visualizacao viewVitorTitanic = new Visualizacao(perfilVitor, titanic, 180L);
			Visualizacao viewVitorInterestelar = new Visualizacao(perfilVitor, interestelar, 150L);
			Visualizacao viewCaioCoringa = new Visualizacao(perfilCaio, coringa, 95L);
			Visualizacao viewSamuelVelozes = new Visualizacao(perfilSamuel, velozes, 85L);
			Visualizacao viewCaioOutroReiLeao = new Visualizacao(perfilCaioOutro, reiLeao, 110L);
			Visualizacao viewMathiasInvocacao = new Visualizacao(perfilMathias, invocacao, 70L);
			Visualizacao viewVitorSeEuFicar = new Visualizacao(perfilVitor, seEuFicar, 100L);
			Visualizacao viewSamuelFragmentado = new Visualizacao(perfilSamuel, fragmentado, 105L);

			List<Visualizacao> visualizacoes = List.of(
					viewCaioAnabelle, viewCaioOutroAnabelle, viewCaioBusca, viewSamuelBusca,
					viewSamuelGladiador, viewCaioOutroLugar,
					viewMathiasVingadores, viewMathiasMatrix, viewVitorTitanic, viewVitorInterestelar,
					viewCaioCoringa, viewSamuelVelozes, viewCaioOutroReiLeao, viewMathiasInvocacao,
					viewVitorSeEuFicar, viewSamuelFragmentado
			);

			visualRepo.saveAll(visualizacoes);

// na tabela avaliacoes
			Avaliacao avalCaioBusca = new Avaliacao(perfilCaio, buscaImplacavel, 5, "Filmão do caramba bixo, espetacular");
			Avaliacao avalSamuelGla = new Avaliacao(perfilSamuel, gladiador, 5, "QUE FILME PO, simplesmente histórico cara, que loucura!");
			Avaliacao avalCaioOutroAna = new Avaliacao(perfilCaioOutro, anabelle, 1, "Uma merda, não gosto de terror ta loko");
			Avaliacao avalMathiasVingadores = new Avaliacao(perfilMathias, vingadores, 5, "Explosão de ação e heróis, impossível não gostar.");
			Avaliacao avalMathiasMatrix = new Avaliacao(perfilMathias, matrix, 4, "Bem profundo, mas dá um nó na cabeça em algumas partes.");
			Avaliacao avalVitorTitanic = new Avaliacao(perfilVitor, titanic, 5, "Clássico eterno, chorei como sempre. Perfeito.");
			Avaliacao avalVitorInterestelar = new Avaliacao(perfilVitor, interestelar, 5, "Simplesmente obra-prima, emocionante e inteligente.");
			Avaliacao avalCaioCoringa = new Avaliacao(perfilCaio, coringa, 4, "Pesado, mas atuação do Joaquin Phoenix é surreal.");
			Avaliacao avalSamuelVelozes = new Avaliacao(perfilSamuel, velozes, 3, "Legalzinho, mas meio viajado em algumas cenas.");
			Avaliacao avalCaioOutroReiLeao = new Avaliacao(perfilCaioOutro, reiLeao, 5, "Clássico da infância, nostalgia pura.");
			Avaliacao avalMathiasInvocacao = new Avaliacao(perfilMathias, invocacao, 4, "Dá uns sustos bons, curti bastante.");
			Avaliacao avalVitorSeEuFicar = new Avaliacao(perfilVitor, seEuFicar, 3, "Bonito, mas meio paradão às vezes.");
			Avaliacao avalSamuelFragmentado = new Avaliacao(perfilSamuel, fragmentado, 5, "Atuação absurda, prende do início ao fim.");

			List<Avaliacao> avaliacoes = List.of(
					avalCaioBusca, avalCaioOutroAna, avalSamuelGla,
					avalMathiasVingadores, avalMathiasMatrix, avalVitorTitanic, avalVitorInterestelar,
					avalCaioCoringa, avalSamuelVelozes, avalCaioOutroReiLeao,
					avalMathiasInvocacao, avalVitorSeEuFicar, avalSamuelFragmentado
			);


			avaliacaoRepo.saveAll(avaliacoes);
//
//
////			 COMEÇAR A FAZER AS BUSCAS

////			Busca de caracteres no titulo
			System.out.println("\n-----------------------------------------");
			System.out.println("\nSegue lista de títulos que possuem 'o':");
            videoRepo.findByTituloContainsOrderByTitulo("o").forEach(video ->
					System.out.println("\n" + video.getTitulo() + " - " + video.getCategoria().getNome())
			);

//        	Busca de categorias especificas
            System.out.println("\n-----------------------------------------");
            System.out.println("\nVídeos da categoria ordenados por título:");
            videoRepo.findByCategoriaNomeOrderByTitulo("Terror").forEach(video ->
                    System.out.println("\n" + video.getTitulo() + " - " + video.getCategoria().getNome())
            );

//         Os top 10 vídeos mais bem avaliados
			AtomicInteger ordem = new AtomicInteger(1);
            System.out.println("\n-----------------------------------------");
            System.out.println("\nOs top 10 melhores vídeos:");
            videoRepo.top10MaisAvaliados(PageRequest.of(0,10)).forEach(video ->
                    System.out.println("\n" + ordem.getAndIncrement()+ "º " + video.getTitulo() + " - " + video.getCategoria().getNome())
            );

//         Os top 10 vídeos mais assistidos
			ordem.set(1);
            System.out.println("\n-----------------------------------------");
            System.out.println("\nOs top 10 vídeos mais assistidos:");
            videoRepo.top10MaisAssistidos(PageRequest.of(0,10)).forEach(video ->
                    System.out.println("\n"+ ordem.getAndIncrement()+ "º " + video.getTitulo() + " - " + video.getCategoria().getNome())
            );

//         O usuário mais ativo
            System.out.println("\n-----------------------------------------");
            System.out.println("\nUsuário que mais assistiu vídeos:");
            usuarioRepo.usuarioMaisAtivo(PageRequest.of(0, 1)).forEach(usuario ->
                    System.out.println("\n" + usuario.getNome()));
            System.out.println("\n-----------------------------------------\n");
        };
    }

}
