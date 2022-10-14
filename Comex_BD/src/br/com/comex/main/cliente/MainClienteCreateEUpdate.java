package br.com.comex.main.cliente;

import java.sql.Connection;
import java.sql.SQLException;

import br.com.comex.dao.ClienteDAO;
import br.com.comex.jdbc.ConnectionFactory;
import br.com.comex.modelo.Cliente;

public class MainClienteCreateEUpdate {

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
				
//		Atualiza o cliente
		c.setComplemento("Sobrado 10");
		cd.updateCliente(c,14);
		

		
		con.close();
	}

}
