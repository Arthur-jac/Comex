package br.com.comex.categoria;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MainAtualizacaoCategoria {

	public static void main(String[] args) throws SQLException {
Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","comex","comex");
		
		String comandoSql = "UPDATE comex.categoria SET nome=? WHERE id=?";
		
		PreparedStatement stm = con.prepareStatement(comandoSql); 
	
		stm.setString(1, "LIVROS TÉCNICOS");
		stm.setInt(2, 11);
		
		stm.execute();
		stm.close();
		con.close();

	}

}
