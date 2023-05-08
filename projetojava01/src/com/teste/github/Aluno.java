package com.teste.github;

import java.util.Objects;

public class Aluno {

	private String nome;
	private int idade;
	private String estadoCiviel;
	private String endereco;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getEstadoCiviel() {
		return estadoCiviel;
	}
	public void setEstadoCiviel(String estadoCiviel) {
		this.estadoCiviel = estadoCiviel;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	@Override
	public int hashCode() {
		return Objects.hash(endereco, estadoCiviel, idade, nome);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		return Objects.equals(endereco, other.endereco) && Objects.equals(estadoCiviel, other.estadoCiviel)
				&& idade == other.idade && Objects.equals(nome, other.nome);
	}
	
	
	

}
