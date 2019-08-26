package br.com.curso.builder;

public class EnviarPorSms implements AcaoAposGerarNota {

	@Override
	public void executa(NotaFiscal notaFiscal) {
		System.out.println("Enviando por SMS");
	}

}
