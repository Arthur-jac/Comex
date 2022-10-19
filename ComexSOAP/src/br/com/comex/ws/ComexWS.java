package br.com.comex.ws;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.jws.WebService;

import br.com.comex.dao.CategoriaDAO;
import br.com.comex.dao.ClienteDAO;
import br.com.comex.jdbc.ConnectionFactory;
import br.com.comex.modelo.Categoria;
import br.com.comex.modelo.Cliente;

@WebService
public class ComexWS {
	public List<Categoria> getCategorias() throws SQLException {
		Connection con = new ConnectionFactory().getConnection();
		CategoriaDAO cd = new CategoriaDAO(con);
		
		List<Categoria> categorias = new ArrayList<Categoria>();
		categorias = cd.listCategoria();

		con.close();
		return categorias;
	}
	
	public List<Cliente> getClientes() throws SQLException{
		Connection con = new ConnectionFactory().getConnection();
		ClienteDAO cd = new ClienteDAO(con);
		
		List<Cliente> clientes = new ArrayList<Cliente>();
		clientes = cd.listClientes();
		
		con.close();
		
		return clientes;
	}
}
