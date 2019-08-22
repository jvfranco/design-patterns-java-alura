package br.com.curso.descontos;

import br.com.curso.model.Item;
import br.com.curso.model.Orcamento;

public class DescontoPorVendaCasada implements Desconto {

	private Desconto proximo;

	@Override
	public double desconta(Orcamento orcamento) {
		if (contemItem("Lapis", orcamento) && contemItem("Caneta", orcamento)) {
			return orcamento.getValor() * 0.05;
		}
		
		return proximo.desconta(orcamento);
	}

	@Override
	public void setProximo(Desconto desconto) {
		this.proximo = desconto;

	}
	
	public boolean contemItem(String nomeItem, Orcamento orcamento) {
		for (Item item : orcamento.getItens()) {
			if (item.getNome().equals(nomeItem)) {
				return true;
			}
		}
		return false;
	}

}
