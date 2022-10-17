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
		
		Cliente cliente = new Cliente();
		cliente.setNome("Teste");
		cliente.setCpf("222.222.222-22");
		cliente.setTelefone("(41)88888-8888");
		cliente.setRua("Rua A");
		cliente.setNumero("7896");
		cliente.setComplemento("Apt.07");
		cliente.setBairro("Bairro A");
		cliente.setCidade("Cidade");
		cliente.setUf("PR");
		
//		Cria um cliente
//		cd.createCliente(cliente);
				
//		Atualiza o cliente
		cliente.setComplemento("Sobrado 10");
		cd.updateCliente(cliente,15);
		

		
		con.close();
	}

}
