package br.com.comex.main.itemPedido;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.comex.dao.ItemPedidoDAO;
import br.com.comex.jdbc.ConnectionFactory;
import br.com.comex.modelo.ItemPedido;

public class MainItemPedidoListagem {
	public static void main(String[] args) throws SQLException {
		Connection con = new ConnectionFactory().getConnection();
		
		ItemPedidoDAO ipd = new ItemPedidoDAO(con);

		List<ItemPedido> itens = new ArrayList<ItemPedido>();
		itens = ipd.listItens();
		
		for (ItemPedido i : itens) {
			System.out.println(i);
		}
		
		con.close();
	}
}
