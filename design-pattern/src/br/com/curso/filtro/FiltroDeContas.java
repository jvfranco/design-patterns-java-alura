package br.com.curso.filtro;

import java.util.ArrayList;
import java.util.List;

import br.com.curso.model.Conta;

public abstract class FiltroDeContas {
	
	protected FiltroDeContas outroFiltro;
	
	public FiltroDeContas() {}
	
	public FiltroDeContas(FiltroDeContas outroFiltro) {
		this.outroFiltro = outroFiltro;
	}
	
	public abstract List<Conta> filtra(List<Conta> contas);
	
	protected List<Conta> proxima(List<Conta> contas) {
		if (outroFiltro != null) return outroFiltro.filtra(contas);
		else return new ArrayList<Conta>();
	}
}
