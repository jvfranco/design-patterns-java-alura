package br.com.curso.teste;

import br.com.curso.builder.ItemDaNota;
import br.com.curso.builder.NotaFiscal;
import br.com.curso.builder.NotaFiscalBuilder;

public class TesteBuilder {

	public static void main(String[] args) {
		NotaFiscal notaFiscal = new NotaFiscalBuilder()
				.setRazaoSocial("Curso Design Patterns")
				.setCnpj("12.345.678/0001-99")
				.setDataEmissao()
				.setTodosItens(new ItemDaNota("Tênis 1", 100.0))
				.setTodosItens(new ItemDaNota("Tênis 2", 200.0))
				.setTodosItens(new ItemDaNota("Tênis 3", 300.0))
				.setObservacoes("Observações")
				.setValorBruto(600.0)
				.setImpostos(10.0)
				.constroi();
		
		System.out.println(notaFiscal.getValorBruto());
		
		System.out.println(notaFiscal.getItens().get(1).getDescricao());
		
		
		

	}

}
