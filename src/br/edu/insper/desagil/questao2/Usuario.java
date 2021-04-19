package br.edu.insper.desagil.questao2;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
	private String nome;
	private List<Video> videos;
	
	public Usuario(String nome) {
		super();
		this.nome = nome;
		this.videos = new ArrayList<>();
	}
	
	public String getNome() {
		return nome;
	}
	
	public Video postaVideo(int identificador, Produto produto) {
		Video video = new Video(identificador, this.nome, produto);
		this.videos.add(video);
		return video;
	}
	
	public int totalAvaliacoes() {
		int total = 0;
		for(Video video : videos) {
			total += video.mediaAvaliacoes();
		}
		return total;
	}
	
}
