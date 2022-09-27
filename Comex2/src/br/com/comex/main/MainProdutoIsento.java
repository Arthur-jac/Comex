package br.com.comex.main;

import br.com.comex.modelo.Categoria;
import br.com.comex.modelo.ComexException;
import br.com.comex.modelo.ProdutoIsento;
import br.com.comex.modelo.Status;

public class MainProdutoIsento {

	public static void main(String[] args) {
		Categoria categoria = new Categoria("Moda", Status.ATIVA);
		
		ProdutoIsento pi = new ProdutoIsento("Bolsa", 200, 5, categoria);
		
		if(pi.getId() > 0 &&
				pi.getNome() != null && pi.getNome().length() > 0 && 
				pi.getPreco_unitario() > 0 && 
				pi.getQtd_estoque() > 0 && 
				pi.getCategoria() != null) {
			System.out.println(pi);
		}else {
			throw new ComexException("Produto Isento incorreto");
		}

	}

}
