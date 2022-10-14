package br.com.comex.pedido;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ListarPedido {
	public void listPedidos(Connection con) throws SQLException {
		String comandoSql = "SELECT * FROM comex.pedido";
		
		PreparedStatement stm = con.prepareStatement(comandoSql);
		stm.execute();
		
		ResultSet rst = stm.getResultSet();
		
		while(rst.next()) {
			int id = rst.getInt("ID");
			Date data = rst.getDate("DATA");
			int cliente = rst.getInt("CLIENTE_ID");
			
			System.out.println("ID -> " +id+ " \nDATA -> " +data+ " \nCliente ID-> " +cliente+ "\n \n");
			
			
		}
		
		rst.close();
		stm.close();
		
	}
}
