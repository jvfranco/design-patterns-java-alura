package br.com.curso.templateMethods;

import java.util.ArrayList;
import java.util.List;

import br.com.curso.model.Item;
import br.com.curso.model.Orcamento;

public class IHIT extends TemplateDeImpostos {

	@Override
	protected boolean utilizarMaximaTaxacao(Orcamento orcamento) {
		List<String> noOrcamento = new ArrayList<String>();
		
		for (Item item : orcamento.getItens()) {
			if (noOrcamento.contains(item.getNome())) return true;
			else noOrcamento.add(item.getNome());
		}
					
		return false;
	}

	@Override
	protected double minimaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * (0.01 * orcamento.getItens().size());
	}

	@Override
	protected double maximaTaxacao(Orcamento orcamento) {
		return (orcamento.getValor() * 0.13) + 100.0;
	}

	
	
}
