package br.com.comex.categoria.essenciais;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.comex.jdbc.ConnectionFactory;

public class MainAtualizacaoCategoria {

	public static void main(String[] args) throws SQLException {
		Connection con = new ConnectionFactory().getConnection();
		
		String comandoSql = "UPDATE comex.categoria SET nome=? WHERE id=?";
		
		PreparedStatement stm = con.prepareStatement(comandoSql); 
	
		stm.setString(1, "LIVROS TÉCNICOS");
		stm.setInt(2, 11);
		
		stm.execute();
		stm.close();
		con.close();

	}

}
