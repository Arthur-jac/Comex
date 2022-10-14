package br.com.comex.categoria.essenciais;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import br.com.comex.jdbc.ConnectionFactory;

public class MainListagemCategoria {

	public static void main(String[] args) throws SQLException {
		Connection con = new ConnectionFactory().getConnection();
		
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
		
		rst.close();
		stm.close();
		con.close();

	}

}
