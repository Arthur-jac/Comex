package br.com.comex.main;

import br.com.comex.modelo.Categoria;
import br.com.comex.modelo.ComexException;
import br.com.comex.modelo.ProdutoIsento;
import br.com.comex.modelo.Status;

public class MainProdutoIsento {

	public static void main(String[] args) {
		Categoria categoria = new Categoria("Moda", Status.ATIVA);
		
		ProdutoIsento pi = new ProdutoIsento("3Bolsa", 200, 5, categoria);

		try {
			System.out.println(pi);
		}catch(IllegalArgumentException ex) {
			System.out.println(ex);
		}finally {
			System.out.println("Programa encerrado.");
		}

	}

}
