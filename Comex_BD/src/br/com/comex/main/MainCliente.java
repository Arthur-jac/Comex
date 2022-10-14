package br.com.comex.main;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.comex.dao.ClienteDAO;
import br.com.comex.jdbc.ConnectionFactory;
import br.com.comex.modelo.Cliente;

public class MainCliente {

	public static void main(String[] args) throws SQLException {
		Connection con = new ConnectionFactory().getConnection();
		ClienteDAO cd = new ClienteDAO(con);
		
		Cliente c = new Cliente();
		c.setNome("Teste");
		c.setCpf("222.222.222-22");
		c.setTelefone("(41)88888-8888");
		c.setRua("Rua A");
		c.setNumero("7896");
		c.setComplemento("Apt.07");
		c.setBairro("Bairro A");
		c.setCidade("Cidade");
		c.setUf("PR");
		
//		Cria um cliente
//		cd.createCliente(c);
		
// 		Deleta determinado cliente
//		cd.deleteCliente(13);
		
//		Altera determinado cliente
		c.setComplemento("Sobrado 8");
//		cd.updateCliente(c,14);
		
// 		Lista todos os Clientes
		List<Cliente> clientes = new ArrayList<Cliente>();
		clientes = cd.listClientes();
		
		for (Cliente cliente : clientes) {
			System.out.println(cliente);
		}
		
		con.close();
	}

}
