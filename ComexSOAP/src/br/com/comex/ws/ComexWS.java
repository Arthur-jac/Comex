package br.com.comex.ws;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import br.com.comex.dao.CategoriaDAO;
import br.com.comex.dao.ClienteDAO;
import br.com.comex.dao.ProdutoDAO;
import br.com.comex.jdbc.ConnectionFactory;
import br.com.comex.modelo.Categoria;
import br.com.comex.modelo.Cliente;
import br.com.comex.modelo.Produto;

@WebService
public class ComexWS {
	
	@WebMethod(operationName = "listarCategorias")
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
	
	public List<Produto> getProdutos() throws SQLException{
		Connection con = new ConnectionFactory().getConnection();	
		ProdutoDAO pd = new ProdutoDAO(con);
		List<Produto> produtos = new ArrayList<Produto>();
		
		produtos = pd.listProdutos();	
		
		con.close();
		
		return produtos;
	}
	
	public Categoria adicionarCategoria(String nome) throws SQLException {
		Connection con = new ConnectionFactory().getConnection();
		CategoriaDAO cd = new CategoriaDAO(con);
		Categoria categoria = new Categoria();
		
		categoria.setNome(nome);
		categoria.setStatus("ATIVA");
		
		cd.createCategoria(categoria);
		
		con.close();
		return categoria;
	}
	
	
	public Cliente adicionarCliente(Cliente cliente) throws SQLException {
		Connection con = new ConnectionFactory().getConnection();
		ClienteDAO cd = new ClienteDAO(con);
		
		cd.createCliente(cliente);
		
		con.close();
		
		return cliente;
	}
}
