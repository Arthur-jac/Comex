package br.com.comex.main;

import br.com.comex.modelo.Cliente;
import br.com.comex.modelo.EstadoCliente;

public class MainCliente {
	public static void main(String[] args) {
		
		Cliente cliente = new Cliente("Arthur", "11111111111", "99999999999", "rua do arthur", "N12", null,"bairro do arthur"
				, "cidade do arhur", EstadoCliente.BA);
		
		try {
			if(cliente.getId() > 0 &&
					cliente.getNome().length() > 5 &&
					cliente.getCpf().length() >= 11 && cliente.getCpf().length() <= 14 &&
					cliente.getTelefone().length() >= 11 && cliente.getTelefone().length() <= 16 &&
					cliente.getRua().length() > 5 &&
					cliente.getNumero().length() > 1 &&
					cliente.getBairro().length() > 1 &&
					cliente.getCidade().length() > 1) {
				System.out.println(cliente);
			}else {
				throw new IllegalArgumentException("Produto invalido");
			}
		} catch (IllegalArgumentException ex) {
			System.out.println(ex);
		}finally {
			System.out.println("Programa finalizado.");
		}
	}
}
