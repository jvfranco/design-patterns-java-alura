package br.com.curso.teste;

import br.com.curso.builder.EnviadorDeEmail;
import br.com.curso.builder.EnviarPorSms;
import br.com.curso.builder.Impressora;
import br.com.curso.builder.ItemDaNota;
import br.com.curso.builder.NotaFiscal;
import br.com.curso.builder.NotaFiscalBuilder;
import br.com.curso.builder.NotaFiscalDAO;

public class TesteObserver {

	public static void main(String[] args) {
		NotaFiscalBuilder builder = new NotaFiscalBuilder();
		builder.adicionaAcao(new EnviadorDeEmail());
		builder.adicionaAcao(new EnviarPorSms());
		builder.adicionaAcao(new NotaFiscalDAO());
		builder.adicionaAcao(new Impressora());
		
		
		NotaFiscal notaFiscal = builder.setRazaoSocial("Curso Design Patterns")
				.setCnpj("12.345.678/0001-99")
				.setDataEmissao()
				.setTodosItens(new ItemDaNota("Tênis 1", 100.0))
				.setTodosItens(new ItemDaNota("Tênis 2", 200.0))
				.setTodosItens(new ItemDaNota("Tênis 3", 300.0))
				.setObservacoes("Observações")
				.setValorBruto(600.0)
				.setImpostos(10.0)
				.constroi();

	}

}
