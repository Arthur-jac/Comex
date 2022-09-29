package br.com.comex.main;

import br.com.comex.modelo.Cliente;
import br.com.comex.modelo.EstadoCliente;

public class MainCliente {
	public static void main(String[] args) {
		
		Cliente cliente = new Cliente("Arthur", "01234867872", "99999999999", "rua do arthur", "N12", null,"bairro do arthur"
				, "cidade do arhur", EstadoCliente.PR);
		
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
			System.out.println(cliente);
		} catch (IllegalArgumentException ex) {
			System.out.println(ex);
		}finally {
			System.out.println("Programa finalizado.");
		}
	}
}
