package br.com.curso.descontos;

import br.com.curso.model.Orcamento;

public class SemDesconto implements Desconto {

	@Override
	public double desconta(Orcamento orcamento) {
		return 0;
	}

	@Override
	public void setProximo(Desconto desconto) {
		// Nao faz nada		
	}
	
	

}
