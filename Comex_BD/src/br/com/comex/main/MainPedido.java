package br.com.comex.main;

import java.sql.Connection;
import java.sql.Date;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.comex.dao.PedidoDAO;
import br.com.comex.jdbc.ConnectionFactory;
import br.com.comex.modelo.Pedido;

public class MainPedido {

	public static void main(String[] args) throws SQLException {
		Connection con = new ConnectionFactory().getConnection();		
		List<Pedido> pedidos = new ArrayList<Pedido>();
		PedidoDAO pd = new PedidoDAO(con);
		
//		Cria um pedido
		Pedido pedido = new Pedido();
		pedido.setCliente_id(8);
		pedido.setData(Date.valueOf("2020-05-07"));
//		pd.createPedido(pedido);
		
//		Deleta determinado pedido
		pd.deletePedido(12);
		
//		Altera determinado pedido
//		pedido.setData(Date.valueOf("2017-05-07"));
//		pd.updatePedido(pedido,12);
		
// 		Lista todos os pedidos
		pedidos = pd.listPedidos();
		
		for (Pedido p : pedidos) {
			System.out.println(p);
		}
		
		con.close();

	}

}
