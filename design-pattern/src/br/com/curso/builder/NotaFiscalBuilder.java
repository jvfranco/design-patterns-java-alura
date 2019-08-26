package br.com.curso.builder;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class NotaFiscalBuilder {

	private String razaoSocial;
	private String cnpj;
	private Calendar dataEmissao;
	private double valorBruto;
	private double impostos;
	public List<ItemDaNota> todosItens = new ArrayList<ItemDaNota>();
	public String observacoes;
	
	public NotaFiscalBuilder setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
		return this;
	}
	public NotaFiscalBuilder setCnpj(String cnpj) {
		this.cnpj = cnpj;
		return this;
	}
	public NotaFiscalBuilder setDataEmissao() {
		this.dataEmissao = Calendar.getInstance();
		return this;
	}
	public NotaFiscalBuilder setValorBruto(double valorBruto) {
		this.valorBruto = valorBruto;
		return this;
	}
	public NotaFiscalBuilder setImpostos(double impostos) {
		this.impostos = impostos;
		return this;
	}
	public NotaFiscalBuilder setTodosItens(ItemDaNota item) {
		this.todosItens.add(item);
		valorBruto += item.getValor();
		impostos += item.getValor() * 0.05;
		return this;
	}
	public NotaFiscalBuilder setObservacoes(String observacoes) {
		this.observacoes = observacoes;
		return this;
	}
	
	public NotaFiscal constroi() {
		return new NotaFiscal(razaoSocial, cnpj, dataEmissao, valorBruto, impostos, todosItens, observacoes);
	}
	
}
