package br.com.comex.main.pedido;

import java.sql.Connection;
import java.sql.Date;
import java.sql.SQLException;

import br.com.comex.dao.PedidoDAO;
import br.com.comex.jdbc.ConnectionFactory;
import br.com.comex.modelo.Pedido;

public class MainPedidoCreateEUpdate {

	public static void main(String[] args) throws SQLException {
		Connection con = new ConnectionFactory().getConnection();		
		PedidoDAO pd = new PedidoDAO(con);
		
		Pedido pedido = new Pedido();
		pedido.setCliente_id(8);
		pedido.setData(Date.valueOf("2020-05-07"));
//		Cria um pedido
//		pd.createPedido(pedido);
		
		
//		Altera determinado pedido
		pedido.setData(Date.valueOf("2017-05-07"));
		pd.updatePedido(pedido,11);
		
		con.close();

	}

}
