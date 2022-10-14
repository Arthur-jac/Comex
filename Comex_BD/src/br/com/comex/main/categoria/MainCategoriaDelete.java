package br.com.comex.main.categoria;

import java.sql.Connection;
import java.sql.SQLException;

import br.com.comex.dao.CategoriaDAO;
import br.com.comex.jdbc.ConnectionFactory;

public class MainCategoriaDelete {
	public static void main(String[] args) throws SQLException {
		Connection con = new ConnectionFactory().getConnection();
		CategoriaDAO cd = new CategoriaDAO(con);
		
		cd.deleteCategoria(17);

		con.close();
	}	
}
