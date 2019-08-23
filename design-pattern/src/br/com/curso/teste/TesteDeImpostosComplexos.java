package br.com.curso.teste;

import br.com.curso.impostos.ICCC;
import br.com.curso.impostos.ICMS;
import br.com.curso.impostos.ISS;
import br.com.curso.impostos.Imposto;
import br.com.curso.impostos.ImpostoMuitoAlto;
import br.com.curso.model.Orcamento;

public class TesteDeImpostosComplexos {

	public static void main(String[] args) {
		Imposto iss = new ISS(new ICMS( new ICCC()));
		
		Orcamento orcamento = new Orcamento(500);
		
		double valor = iss.calcula(orcamento);
		
		System.out.println(valor);
		
		ImpostoMuitoAlto ima = new ImpostoMuitoAlto(new ISS());
		
		Orcamento orcamento2 = new Orcamento(1000);
		
		valor = ima.calcula(orcamento2);
		
		System.out.println(valor);

	}

}
