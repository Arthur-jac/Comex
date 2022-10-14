package br.com.comex.pedido;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.time.LocalDate;

import br.com.comex.jdbc.ConnectionFactory;

public class MainPedido {

	public static void main(String[] args) throws SQLException {
		Connection con = new ConnectionFactory().getConnection();
		
		CriarPedido cp = new CriarPedido();
		cp.createPedido(con,Date.valueOf(LocalDate.now()),8);
		
		AlterarPedido ap = new AlterarPedido();
//		ap.updatePedido(con, Date.valueOf("2022-10-01"), 8);
		
		ExcluirPedido ep = new ExcluirPedido();
//		ep.deleteProduto(con, 8);
		
		ListarPedido lp = new ListarPedido();
		lp.listPedidos(con);
		
		
		con.close();

	}

}
