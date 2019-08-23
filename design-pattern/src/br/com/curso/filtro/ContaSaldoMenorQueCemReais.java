package br.com.curso.filtro;

import java.util.ArrayList;
import java.util.List;

import br.com.curso.model.Conta;

public class ContaSaldoMenorQueCemReais extends FiltroDeContas {

	public ContaSaldoMenorQueCemReais() {}
	
	public ContaSaldoMenorQueCemReais(FiltroDeContas outroFiltro) {
		super(outroFiltro);
	}

	@Override
	public List<Conta> filtra(List<Conta> contas) {
		List<Conta> filtrada = new ArrayList<Conta>();
		for(Conta c : contas) {
			if (c.getSaldo() < 100) filtrada.add(c);
		}
		filtrada.addAll(proxima(contas));
		return filtrada;
	}
	
	
}
