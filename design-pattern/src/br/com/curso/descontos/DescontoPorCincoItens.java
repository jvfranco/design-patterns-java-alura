package br.com.curso.descontos;

import br.com.curso.model.Orcamento;

public class DescontoPorCincoItens implements Desconto {
	
	private Desconto proximo;

	public double desconta(Orcamento orcamento) {
		if (orcamento.getItens().size() > 5) {
			return orcamento.getValor() * 0.1;
		}
		else {
			return proximo.desconta(orcamento);
		}
	}

	@Override
	public void setProximo(Desconto desconto) {
		this.proximo = desconto;
		
	}
	
	
	
}
