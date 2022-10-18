package br.com.comex.categoria.essenciais;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.comex.jdbc.ConnectionFactory;

public class MainInsercaoCategoria {

	public static void main(String[] args) throws SQLException {
		Connection con = new ConnectionFactory().getConnection();
		
		String comandoSql = "INSERT INTO comex.categoria (nome,status) VALUES (?,?)";
		
		PreparedStatement stm = con.prepareStatement(comandoSql); 
	
//		stm.setString(1, "INFORMÁTICA");
//		stm.setString(2, "ATIVA");
//		
//		stm.setString(1, "MÓVEIS");
//		stm.setString(2, "INATIVA");
//		
		stm.setString(1, "LIVROS");
		stm.setString(2, "ATIVA");
				
		stm.execute();
		stm.close();
		con.close();
		
	}

}
