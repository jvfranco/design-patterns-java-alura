package br.com.curso.templateMethods;

import br.com.curso.model.Item;
import br.com.curso.model.Orcamento;

public class IKCV extends TemplateDeImpostos {

	@Override
	protected boolean utilizarMaximaTaxacao(Orcamento orcamento) {
		return (orcamento.getValor() > 500 && itemComValorAcimaDeCemReais(orcamento));
	}

	@Override
	protected double minimaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * 0.06;
	}

	@Override
	protected double maximaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * 0.10;
	}
	
	private boolean itemComValorAcimaDeCemReais(Orcamento orcamento) {
		for (Item item : orcamento.getItens()) {
			if (item.getValor() >= 100.0) return true;
		}
		return false;
	}

}
