package br.com.curso.builder;

public class EnviadorDeEmail implements AcaoAposGerarNota {

	@Override
	public void executa(NotaFiscal notaFiscal) {
		System.out.println("Enviado por email.");
		
	}

}
