package br.com.comex.main.categoria;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.comex.dao.CategoriaDAO;
import br.com.comex.jdbc.ConnectionFactory;
import br.com.comex.modelo.Categoria;

public class MainCategoriaListagem {
	public static void main(String[] args) throws SQLException {
		Connection con = new ConnectionFactory().getConnection();
		CategoriaDAO cd = new CategoriaDAO(con);
		
		List<Categoria> categorias = new ArrayList<Categoria>();
		categorias = cd.listCategoria();
		
		for (Categoria categoria : categorias) {
			System.out.println(categoria);
		}
		
		con.close();
	}	
}
