package br.com.comex.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MainListagemCategoria {

	public static void main(String[] args) throws SQLException {
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","comex","comex");
		
		String comandoSql = "SELECT * FROM comex.categoria";
		
		PreparedStatement stm = con.prepareStatement(comandoSql); 
		stm.execute();
		
		ResultSet rst = stm.getResultSet();
		
		while(rst.next()) {
			int id = rst.getInt("ID");
			String nome = rst.getString("NOME");
			String status = rst.getString("STATUS");
			System.out.println("ID -> " +id+ " \nNOME -> " +nome+ " \nSTATUS -> " +status+"\n \n");
		}
		stm.close();
		con.close();

	}

}
