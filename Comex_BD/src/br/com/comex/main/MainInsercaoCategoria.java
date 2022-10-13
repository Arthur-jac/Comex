package br.com.comex.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MainInsercaoCategoria {

	public static void main(String[] args) throws SQLException {
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","comex","comex");
		
		String comandoSql = "INSERT INTO comex.categoria (nome,status) VALUES (?,?)";
		
		PreparedStatement stm = con.prepareStatement(comandoSql); 
	
		stm.setString(1, "LIVROS");
		stm.setString(2, "ATIVA");
		
		stm.execute();
		stm.close();
		con.close();
		
	}

}
