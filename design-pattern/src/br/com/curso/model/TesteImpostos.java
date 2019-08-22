package br.com.curso.model;
import java.util.Random;

import br.com.curso.impostos.CalculadorDeImposto;
import br.com.curso.impostos.ICCC;
import br.com.curso.impostos.ICMS;
import br.com.curso.impostos.ISS;
import br.com.curso.impostos.NewImposto;
import br.com.curso.investimentos.Arrojado;
import br.com.curso.investimentos.Conservador;
import br.com.curso.investimentos.Moderado;
import br.com.curso.investimentos.RealizadorDeInvestimentos;

public class TesteImpostos {

	public static void main(String[] args) {
		
		Orcamento orcamento = new Orcamento(500.0);
		ICMS icms = new ICMS();
		ISS iss = new ISS();
		NewImposto newImposto = new NewImposto();
		
		CalculadorDeImposto calcularImposto = new CalculadorDeImposto();
		calcularImposto.realizaCalculo(orcamento, icms);
		calcularImposto.realizaCalculo(orcamento, iss);
		calcularImposto.realizaCalculo(orcamento, newImposto);
		System.out.println("-------------------------------");
		calcularImposto.realizaCalculo(new Orcamento(800.0), new ICCC());
		calcularImposto.realizaCalculo(new Orcamento(2000.0), new ICCC());
		calcularImposto.realizaCalculo(new Orcamento(5000.00), new ICCC());
		System.out.println("-------------------------------");
		System.out.println("Investimentos\n");
		RealizadorDeInvestimentos investimentos = new RealizadorDeInvestimentos();
		Orcamento orcamento2 = new Orcamento(1000.00);
		System.out.println("Conservador");
		investimentos.calculoInvestimento(orcamento2, new Conservador());
		System.out.println("Moderado");
		investimentos.calculoInvestimento(orcamento2, new Moderado());
		System.out.println("Arrojado");
		investimentos.calculoInvestimento(orcamento2, new Arrojado());
		
	}

}
