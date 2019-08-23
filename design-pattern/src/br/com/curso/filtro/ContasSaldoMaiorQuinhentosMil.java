package br.com.curso.filtro;

import java.util.ArrayList;
import java.util.List;

import br.com.curso.model.Conta;

public class ContasSaldoMaiorQuinhentosMil extends FiltroDeContas {

	public ContasSaldoMaiorQuinhentosMil() {}
	
	public ContasSaldoMaiorQuinhentosMil(FiltroDeContas outroFiltro) {
		super(outroFiltro);
	}

	@Override
	public List<Conta> filtra(List<Conta> contas) {
		List<Conta> filtrada = new ArrayList<Conta>();
		
		for (Conta c : contas) {
			if (c.getSaldo() > 500000) filtrada.add(c);
		}
		
		filtrada.addAll(proxima(contas));
		return filtrada;
	}
	
	

}
