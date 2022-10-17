package br.com.comex.main.itemPedido;

import java.sql.Connection;
import java.sql.SQLException;

import br.com.comex.dao.ItemPedidoDAO;
import br.com.comex.jdbc.ConnectionFactory;

public class MainItemPedidoDelete {
	public static void main(String[] args) throws SQLException {
		Connection con = new ConnectionFactory().getConnection();
		
		ItemPedidoDAO ipd = new ItemPedidoDAO(con);

		ipd.deleteItem(11);
		
		con.close();
	}
}
