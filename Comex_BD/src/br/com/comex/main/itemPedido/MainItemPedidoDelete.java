package br.com.comex.main.itemPedido;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.comex.dao.ItemPedidoDAO;
import br.com.comex.jdbc.ConnectionFactory;
import br.com.comex.modelo.ItemPedido;

public class MainItemPedidoDelete {
	public static void main(String[] args) throws SQLException {
		Connection con = new ConnectionFactory().getConnection();
		
		ItemPedidoDAO ipd = new ItemPedidoDAO(con);

		ipd.deleteItem(10);
		
		con.close();
	}
}
