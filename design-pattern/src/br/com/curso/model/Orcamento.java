package br.com.curso.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import br.com.curso.state.EmAprovacao;
import br.com.curso.state.EstadoDeUmOrcamento;

public class Orcamento {

	private double valor;
	private List<Item> itens;
	
	public Orcamento(double valor) {
		this.valor = valor;
		itens = new ArrayList<Item>();
	}

	public double getValor() {
		return valor;
	}

	
	public void deposita(double valor) {
		this.valor += valor;		
	}
	
	public void adicionarItem(Item item) {
		itens.add(item);
	}
	
	public List<Item> getItens() {
		return Collections.unmodifiableList(itens);
	}
	
	
}
