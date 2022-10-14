package br.com.comex.pedido;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Date;

public class CriarPedido {
	public void createPedido(Connection con,Date data,int cliente) 
			throws SQLException {
		String comandoSql = "INSERT INTO comex.pedido (DATA,CLIENTE_ID) VALUES(?,?)";
		
		PreparedStatement stm = con.prepareStatement(comandoSql);
	
		stm.setDate(1,data);
		stm.setInt(2,cliente);
		
		stm.execute();
		stm.close();
	}
}
