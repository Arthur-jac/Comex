package br.com.comex.main;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.comex.dao.ItemPedidoDAO;
import br.com.comex.jdbc.ConnectionFactory;
import br.com.comex.modelo.ItemPedido;

public class MainItemPedido {
	public static void main(String[] args) throws SQLException {
		Connection con = new ConnectionFactory().getConnection();
		
		ItemPedidoDAO ipd = new ItemPedidoDAO(con);
		
//		Cria um item pedido
		ItemPedido item = new ItemPedido();
		item.setPreco_unitario(4499);
		item.setQuantidade(1);
		item.setProduto_id(11);
		item.setPedido_id(10);
		item.setDesconto(0.0);
		item.setTipo_desconto("NENHUM");
		
//		ipd.createItem(item);
		
//		Deleta determinado item
		ipd.deleteItem(9);
		
//		Altera determinado item
//		item.setQuantidade(3);
//		ipd.updateItem(item,9);
		
//		Lista todos os itens pedidos
		List<ItemPedido> itens = new ArrayList<ItemPedido>();
		itens = ipd.listItens();
		
		for (ItemPedido i : itens) {
			System.out.println(i);
		}
		
		con.close();
	}
}
