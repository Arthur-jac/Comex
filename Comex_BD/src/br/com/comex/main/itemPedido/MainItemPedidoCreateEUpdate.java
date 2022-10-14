package br.com.comex.main.itemPedido;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.comex.dao.ItemPedidoDAO;
import br.com.comex.jdbc.ConnectionFactory;
import br.com.comex.modelo.ItemPedido;

public class MainItemPedidoCreateEUpdate {
	public static void main(String[] args) throws SQLException {
		Connection con = new ConnectionFactory().getConnection();
		
		ItemPedidoDAO ipd = new ItemPedidoDAO(con);
		
		ItemPedido item = new ItemPedido();
		item.setPreco_unitario(4499);
		item.setQuantidade(1);
		item.setProduto_id(11);
		item.setPedido_id(10);
		item.setDesconto(0.0);
		item.setTipo_desconto("NENHUM");
		
//		Cria um item pedido
		ipd.createItem(item);
		
		
//		Altera determinado item
//		item.setQuantidade(3);
//		ipd.updateItem(item,10);
		
		con.close();
	}
}
