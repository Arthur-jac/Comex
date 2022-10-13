package br.com.comex.categoria;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MainRemocaoCategoria {

	public static void main(String[] args) throws SQLException {
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","comex","comex");
		
		String comandoSql = "DELETE FROM comex.categoria WHERE status=?";
		
		PreparedStatement stm = con.prepareStatement(comandoSql); 
		
		stm.setString(1,"INATIVA");
		
		stm.execute();
		
		stm.close();
		con.close();

	}

}
