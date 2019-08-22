package br.com.curso.templateMethods;

import br.com.curso.model.Orcamento;

public abstract class TemplateDeImpostos {
	
	public double calcula(Orcamento orcamento) {
		if (utilizarMaximaTaxacao(orcamento)) {
			return maximaTaxacao(orcamento);
		}
		else {
			return minimaTaxacao(orcamento);
		}
	}

	protected abstract boolean utilizarMaximaTaxacao(Orcamento orcamento);

	protected abstract double minimaTaxacao(Orcamento orcamento);

	protected abstract double maximaTaxacao(Orcamento orcamento);

	
}
