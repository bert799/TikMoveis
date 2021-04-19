package br.edu.insper.desagil.questao2;

import java.util.HashMap;
import java.util.Map;

public class Video {
	private int id;
	private String usuario;
	private Produto produto;
	private Map<String, Double> avaliacoes;
	
	public Video(int id, String usuario, Produto produto) {
		this.id = id;
		this.usuario = usuario;
		this.produto = produto;
		this.avaliacoes = new HashMap<>();
	}

	public int getId() {
		return id;
	}

	public Produto getProduto() {
		return produto;
	}
	
	public void adicionaAvaliacao(Usuario usuario, double avaliacao) {
		String nome = usuario.getNome();
		if (nome == this.usuario || (avaliacao >= 1) || (avaliacao <= 5)) {
			this.avaliacoes.put(nome, avaliacao);
		}
	}
	
	public int mediaAvaliacoes() {
		double total = 0;
		for(String nome : this.avaliacoes.keySet()) {
			total += this.avaliacoes.get(nome);
		}
		return (int) Math.round(total);
	}
	
}
