package br.com.curso.teste;

import br.com.curso.state.OrcamentoState;

public class TesteDeDescontoExtra {

	public static void main(String[] args) {
		OrcamentoState reforma = new OrcamentoState(500.0);
		
		reforma.aplicaDesconto();
		System.out.println(reforma.getValor());
		reforma.aprova();
		
		reforma.aplicaDesconto();
		System.out.println(reforma.getValor());
		
		reforma.finaliza();
		
		//reforma.aplicaDesconto();

		reforma.aprova();
	}

}
