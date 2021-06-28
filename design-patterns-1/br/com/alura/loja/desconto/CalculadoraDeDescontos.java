package br.com.alura.loja.desconto;

import java.math.BigDecimal;

import br.com.alura.loja.orcamento.Orcamento;

// Chain of Responsibility
public class CalculadoraDeDescontos {
	
	public BigDecimal calcular(Orcamento orcamento) {
		Desconto desconto = new DescontoMaisDeCincoItens(new DescontoMaisDeQuinhentosReais(new SemDesconto()));
		return desconto.calcular(orcamento);
	}
}
