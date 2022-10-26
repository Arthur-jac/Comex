package br.com.comex.main.pedido;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.comex.dao.PedidoDAO;
import br.com.comex.jdbc.ConnectionFactory;
import br.com.comex.modelo.Pedido;

public class MainPedidoListagem {

	public static void main(String[] args) throws SQLException {
		Connection con = new ConnectionFactory().getConnection();		
		List<Pedido> pedidos = new ArrayList<Pedido>();
		PedidoDAO pd = new PedidoDAO(con);
		
		pedidos = pd.listPedidos();
		
		for (Pedido p : pedidos) {
			System.out.println(p);
		}
		
		con.close();

	}

}
