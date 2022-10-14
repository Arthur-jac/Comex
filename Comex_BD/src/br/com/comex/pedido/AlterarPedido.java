package br.com.comex.pedido;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AlterarPedido {
	public void updatePedido(Connection con,Date data,int id) throws SQLException {
		// Update que muda a data do pedido
		String comandoSql = "UPDATE comex.pedido SET data=? WHERE id=?";
		
		PreparedStatement stm = con.prepareStatement(comandoSql); 
		
		stm.setDate(1, data);
		stm.setInt(2, id);
		
		stm.execute();
		stm.close();
	}
}
