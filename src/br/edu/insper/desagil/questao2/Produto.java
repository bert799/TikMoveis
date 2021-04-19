package br.edu.insper.desagil.questao2;

public class Produto {
	private String Nome;
	private double preco;
	
	public Produto(String nome, double preco) {
		Nome = nome;
		this.preco = preco;
	}

	public String getNome() {
		return Nome;
	}

	public double getPreco() {
		return preco;
	}
	
	
}
