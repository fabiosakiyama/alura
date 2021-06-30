package br.com.alura.loja;

import java.math.BigDecimal;
import java.util.Arrays;

import br.com.alura.loja.pedido.GeraPedido;
import br.com.alura.loja.pedido.GeraPedidoHandler;
import br.com.alura.loja.pedido.acao.EnviarEmailPedido;
import br.com.alura.loja.pedido.acao.SalvarPedidoBD;

public class TestesPedidos {

	public static void main(String[] args) {
		String cliente = "Fabio";
		BigDecimal valorOrcamento = new BigDecimal("300");
		int quantidadeItens = 2;
		
		GeraPedido dados = new GeraPedido(cliente, valorOrcamento, quantidadeItens);
		GeraPedidoHandler handler = new GeraPedidoHandler(Arrays.asList(new SalvarPedidoBD(), new EnviarEmailPedido()));
		handler.executa(dados);

	}

}
