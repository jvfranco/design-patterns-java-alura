package br.com.curso.model;

public class Conta {

	private String nome;
	private double saldo;
	
	public Conta(String nome, double saldo) {
		this.nome = nome;
		this.saldo = saldo;
	}

	public String getNome() {
		return nome;
	}

	public double getSaldo() {
		return saldo;
	}
	
	@Override
	public String toString() {
		return "Titular: " + this.nome + ", Saldo: " + this.saldo;
	}
}
