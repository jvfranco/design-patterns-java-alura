package br.com.curso.teste;

import br.com.curso.model.Item;
import br.com.curso.model.Orcamento;
import br.com.curso.templateMethods.ICPP;
import br.com.curso.templateMethods.IHIT;
import br.com.curso.templateMethods.IKCV;

public class TesteTemplateMethod {

	public static void main(String[] args) {
		Orcamento orcamento = new Orcamento(261.0);
		
		orcamento.adicionarItem(new Item("Caneta", 101.0));
		orcamento.adicionarItem(new Item("Tesoura", 80.0));
		orcamento.adicionarItem(new Item("Lapis", 80.0));
		
		ICPP icpp = new ICPP();
		IKCV ikcv = new IKCV();
		IHIT ihit = new IHIT();
		
		System.out.println(icpp.calcula(orcamento));
		System.out.println(ikcv.calcula(orcamento));
		System.out.println(ihit.calcula(orcamento));

	}

}
