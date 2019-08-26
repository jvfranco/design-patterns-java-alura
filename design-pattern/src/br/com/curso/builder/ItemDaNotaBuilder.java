package br.com.curso.builder;

public class ItemDaNotaBuilder {

	private String descricao;
	private double valor;
	
	public ItemDaNotaBuilder setDescricao(String descricao) {
		this.descricao = descricao;
		return this;
	}
	
	public ItemDaNotaBuilder setValor(double valor) {
		this.valor = valor;
		return this;
	}
	
	public ItemDaNota constroi() {
		return new ItemDaNota(descricao, valor);
	}
}