package br.com.comex.categoria.essenciais;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.comex.jdbc.ConnectionFactory;

public class MainRemocaoCategoria {

	public static void main(String[] args) throws SQLException {
		Connection con = new ConnectionFactory().getConnection();
		
		String comandoSql = "DELETE FROM comex.categoria WHERE status=?";
		
		PreparedStatement stm = con.prepareStatement(comandoSql); 
		
		stm.setString(1,"INATIVA");
		
		stm.execute();
		
		stm.close();
		con.close();

	}

}
