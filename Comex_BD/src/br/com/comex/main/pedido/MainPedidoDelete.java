package br.com.comex.main.pedido;

import java.sql.Connection;
import java.sql.SQLException;

import br.com.comex.dao.PedidoDAO;
import br.com.comex.jdbc.ConnectionFactory;

public class MainPedidoDelete {

	public static void main(String[] args) throws SQLException {
		Connection con = new ConnectionFactory().getConnection();		
		PedidoDAO pd = new PedidoDAO(con);
		
		pd.deletePedido(13);
		
		con.close();

	}

}
