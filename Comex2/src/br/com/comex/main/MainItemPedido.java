package br.com.comex.main;


import java.util.ArrayList;

import br.com.comex.modelo.Categoria;
import br.com.comex.modelo.Cliente;
import br.com.comex.modelo.EstadoCliente;
import br.com.comex.modelo.ItemPedido;
import br.com.comex.modelo.Pedido;
import br.com.comex.modelo.Produto;
import br.com.comex.modelo.Status;

public class MainItemPedido {
	public static void main(String[] args) {
		ArrayList<Object> itens = new ArrayList<>();
		
		Categoria c1 = new Categoria("Celulares", Status.ATIVA);	;

		Produto produto = new Produto("Notebook Samsung", 3523.00, 1, c1);
		Cliente cliente = new Cliente("Arthur", "01234867872", "99999999999", "rua do arthur", "N12", null,"bairro do arthur"
				, "cidade do arhur", EstadoCliente.PR);
		
		Pedido pedido = new Pedido("21/09/2022", cliente);
		
		// Testes para a promoção
		ItemPedido item1 = new ItemPedido(pedido, produto, 2, "NENHUM"); 
		ItemPedido item2 = new ItemPedido(pedido, produto, 1,"PROMOÇÃO");
		ItemPedido item3 = new ItemPedido(pedido, produto, 11, "QUANTIDADE");
		
		itens.add(item1);
		itens.add(item2);
		itens.add(item3);
		
		System.out.println(itens);
	}
}
