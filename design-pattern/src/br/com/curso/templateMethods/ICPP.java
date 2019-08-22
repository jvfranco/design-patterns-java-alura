package br.com.curso.templateMethods;

import br.com.curso.model.Orcamento;

public class ICPP extends TemplateDeImpostos {

	@Override
	protected boolean utilizarMaximaTaxacao(Orcamento orcamento) {
		return (orcamento.getValor() > 500);
	}

	@Override
	protected double minimaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * 0.05;
	}

	@Override
	protected double maximaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * 0.07;
	}
	
}
