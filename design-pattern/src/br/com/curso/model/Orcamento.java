package br.com.curso.model;

public class Orcamento {

	private double valor;
	
	public Orcamento(double valor) {
		this.valor = valor;
	}

	public double getValor() {
		return valor;
	}

	public void deposita(double valor) {
		this.valor += valor;		
	}
	
	
}
