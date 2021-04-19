package br.edu.insper.desagil.questao2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TikMoveisTest {
	private static double DELTA = 0.01;
	private Usuario usuario;
	private Video video;
	private Produto produto;
	
	@BeforeEach
	public void setUp() {
		usuario = new Usuario("Bernardo");
		produto = new Produto("Cadeira", 50.00);
		video = new Video(1, usuario.getNome(), produto);
	}

	@Test
	public void umVideo2Avaliacoes() {
		
	}

}
