package br.edu.insper.desagil.questao2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TikMoveisTest {
	private static double DELTA = 0.01;
	private Usuario usuarioPoster;
	private Video video;
	private Produto produto;
	
	@BeforeEach
	public void setUp() {
		usuarioPoster = new Usuario("Bernardo");
		video = usuarioPoster.postaVideo(1, produto);
		produto = new Produto("Cadeira", 50.00);
	}

	@Test
	public void umVideo2AvaliacoesInvalidas() {
		Usuario usuario1 = new Usuario("Pedro");
		Usuario usuario2 = new Usuario("Paulo");
		video.adicionaAvaliacao(usuarioPoster, 5);
		video.adicionaAvaliacao(usuario1, 0);
		video.adicionaAvaliacao(usuario2, 6);
		assertEquals(0, video.mediaAvaliacoes(), DELTA);
		
	}
	
	@Test
	public void umVideo1Avaliacoesvalida() {
		Usuario usuario = new Usuario("Pedro");
		video.adicionaAvaliacao(usuario, 2);
		assertEquals(2, video.mediaAvaliacoes(), DELTA);
		
	}
	
	@Test
	public void umVideo2Avaliacoesvalidas() {
		Usuario usuario1 = new Usuario("Pedro");
		Usuario usuario2 = new Usuario("Paulo");
		video.adicionaAvaliacao(usuario1, 1.5);
		video.adicionaAvaliacao(usuario2, 2.1);
		assertEquals(2, video.mediaAvaliacoes(), DELTA);
		
	}
	
	@Test
	public void umVideo3Avaliacoesvalidas() {
		Usuario usuario1 = new Usuario("Pedro");
		Usuario usuario2 = new Usuario("Paulo");
		Usuario usuario3 = new Usuario("Paolo");
		video.adicionaAvaliacao(usuario1, 1.1);
		video.adicionaAvaliacao(usuario2, 2.1);
		video.adicionaAvaliacao(usuario3, 3.2);
		assertEquals(2, video.mediaAvaliacoes(), DELTA);
		
	}
	
	@Test
	public void doisVideo2Avaliacoesvalidas() {
		Video video2 = usuarioPoster.postaVideo(2, produto);
		Usuario usuario1 = new Usuario("Pedro");
		Usuario usuario2 = new Usuario("Paulo");
		Usuario usuario3 = new Usuario("Paolo");
		video.adicionaAvaliacao(usuario1, 1.1);
		video.adicionaAvaliacao(usuario2, 2.1);
		video2.adicionaAvaliacao(usuario3, 3.2);
		assertEquals(2, video.mediaAvaliacoes(), DELTA);
		assertEquals(3, video2.mediaAvaliacoes(), DELTA);
		assertEquals(5, usuarioPoster.totalAvaliacoes(), DELTA);
		
	}

}
