package br.com.curso.teste;

import br.com.curso.descontos.CalculadorDeDescontos;
import br.com.curso.model.Item;
import br.com.curso.model.Orcamento;

public class TesteDeDescontos {

	public static void main(String[] args) {
		CalculadorDeDescontos descontos = new CalculadorDeDescontos();
		
		Orcamento orcamento = new Orcamento(500);
		
		orcamento.adicionarItem(new Item("Caneta", 250.0));
		orcamento.adicionarItem(new Item("Tesoura", 250.0));
		orcamento.adicionarItem(new Item("Lapis", 250.0));
		
		double descontoFinal = descontos.calculaDesconto(orcamento);
		
		System.out.println(descontoFinal);

	}

}
