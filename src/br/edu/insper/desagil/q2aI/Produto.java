package br.edu.insper.desagil.q2aI;

public class Produto {
	private String Nome;
	private double preco;
	
	public Produto(String nome, long preco) {
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
