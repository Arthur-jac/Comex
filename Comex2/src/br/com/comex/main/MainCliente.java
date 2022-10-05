package br.com.comex.main;

import java.util.ArrayList;

import br.com.comex.modelo.Cliente;
import br.com.comex.modelo.EstadoCliente;

public class MainCliente {
	public static void main(String[] args) {
		
		ArrayList<Cliente> clientes = new ArrayList<Cliente>();
		
		Cliente cliente = new Cliente("Arthur", "01234867872", "99999999999", "rua do arthur", "N12", null,"bairro do arthur"
				, "cidade do arhur", EstadoCliente.PR);
		
		Cliente cliente2 = new Cliente("Fulano", "11111111111", "88888888888", "rua do fulano", "N13", null,"bairro do fulano"
				, "cidade do fulano", EstadoCliente.RJ);
		
		// Problema no nome
		//Cliente cliente2 = new Cliente("4Arthur", "01234867872", "99999999999", "rua do arthur", "N12", null,"bairro do arthur"
		//		, "cidade do arhur", EstadoCliente.PR);
		
		// Problema no cpf
		//Cliente cliente2 = new Cliente("Arthur", "A11234867872", "99999999999", "rua do arthur", "N12", null,"bairro do arthur"
		//		, "cidade do arhur", EstadoCliente.PR);
		
		// Problema no telefone
		//Cliente cliente2 = new Cliente("4Arthur", "01234867872", "A299999999999", "rua do arthur", "N12", null,"bairro do arthur"
		//		, "cidade do arhur", EstadoCliente.PR);
		
		// Problema no endereço
		//Cliente cliente2 = new Cliente("4Arthur", "01234867872", "99999999999", null, null, null,null
		//		, null, EstadoCliente.PR);
		
		try {
			clientes.add(cliente);
			clientes.add(cliente2);
			System.out.println(clientes);
		} catch (IllegalArgumentException ex) {
			System.out.println(ex);
		}finally {
			System.out.println("Programa finalizado.");
		}
	}
}
