package br.com.comex.item_pedido;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.time.LocalDate;

import br.com.comex.jdbc.ConnectionFactory;

public class MainItemPedido {

	public static void main(String[] args) throws SQLException {
		Connection con = new ConnectionFactory().getConnection();
		
		CriarItem cp = new CriarItem();
//		cp.createItem(con, 4999, 1, 11, 10, 0, "NENHUM");
		
		AlterarItem ap = new AlterarItem();
//		ap.updateItem(con, 2, 8);
		
		ExcluirItem ep = new ExcluirItem();
//		ep.deleteItem(con, 8);
		
		ListarItens lp = new ListarItens();
		lp.listItens(con);
		
		
		con.close();

	}

}
