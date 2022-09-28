package br.com.comex.main;

import br.com.comex.modelo.Cliente;
import br.com.comex.modelo.EstadoCliente;

public class MainCliente {
	public static void main(String[] args) {
		
		Cliente cliente = new Cliente("Arthur", "01234867871", "99999999999", "rua do arthur", "N12", null,"bairro do arthur"
				, "cidade do arhur", EstadoCliente.PR);
		
		try {
			if(cliente.getId() > 0 &&
					cliente.getNome().length() >= 5 &&
					cliente.getNome() != null &&
					cliente.getCpf().length() == 14 &&
					cliente.getCpf() != null &&
					cliente.getTelefone().length() == 14 &&
					cliente.getRua().length() > 5 &&
					cliente.getRua() != null &&
					cliente.getNumero().length() > 1 &&
					cliente.getNumero() != null &&
					cliente.getBairro().length() > 1 &&
					cliente.getBairro() != null &&
					cliente.getCidade() != null &&
					cliente.getEstado() != null &&
					cliente.getCidade().length() > 1) {
				System.out.println(cliente);
			}else {
				throw new IllegalArgumentException("Cliente invalido");
			}
		} catch (IllegalArgumentException ex) {
			System.out.println(ex);
		}finally {
			System.out.println("Programa finalizado.");
		}
	}
}
