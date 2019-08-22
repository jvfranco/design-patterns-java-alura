package br.com.curso.descontos;

import br.com.curso.model.Orcamento;

public interface Desconto {
	
	public double desconta(Orcamento orcamento);
	public void setProximo(Desconto desconto);
	
}
