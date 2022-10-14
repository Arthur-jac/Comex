package br.com.comex.main;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.comex.dao.CategoriaDAO;
import br.com.comex.jdbc.ConnectionFactory;
import br.com.comex.modelo.Categoria;

public class MainCategoria {
	public static void main(String[] args) throws SQLException {
		Connection con = new ConnectionFactory().getConnection();
		CategoriaDAO cd = new CategoriaDAO(con);
		
		Categoria cat = new Categoria();
		cat.setNome("Moda");
		cat.setStatus("ATIVA");
		
//		Cria um cliente
//		cd.createCategoria(c);
		
//		Deleta determinada categoria
//		cd.deleteCategoria(17);
		
//		Altera determinado categoria
//		cat.setStatus("INATIVA");
//		cd.updateCategoria(cat,17);
		
//		Lista todos as categorias
		List<Categoria> categorias = new ArrayList<Categoria>();
		categorias = cd.listCategoria();
		
		for (Categoria categoria : categorias) {
			System.out.println(categoria);
		}
		
		con.close();
	}	
}
