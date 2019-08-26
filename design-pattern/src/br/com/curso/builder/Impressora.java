package br.com.curso.builder;

public class Impressora implements AcaoAposGerarNota {

	@Override
	public void executa(NotaFiscal notaFiscal) {
		System.out.println("Impresso");

	}

}
