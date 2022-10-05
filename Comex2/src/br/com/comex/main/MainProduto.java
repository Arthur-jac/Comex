package br.com.comex.main;
import java.util.ArrayList;

import br.com.comex.modelo.Categoria;
import br.com.comex.modelo.Produto;
import br.com.comex.modelo.Status;

public class MainProduto {

	public static void main(String[] args) {
		ArrayList<Produto> produtos = new ArrayList<Produto>();
		
		Categoria categoria = new Categoria("Alimento", Status.ATIVA);
		Categoria categoria2 = new Categoria("Celulares", Status.ATIVA);
		
		Produto produto = new Produto("Chocolate", 5, 2, categoria);
		Produto produto2 = new Produto("SmartPhone", 4300, 4, categoria2);
		
		// Problema no nome
		//Produto produto2 = new Produto("3Chocolate", 5, 2, categoria);
		
		// Problema no estoque ou preço
		//Produto produto2 = new Produto("Chocolate", 0, 0, categoria);
		
		// Problema na categoria
		//Produto produto2 = new Produto("Chocolate", 5, 2, null);
		
		
		try {
			produtos.add(produto);
			produtos.add(produto2);
			System.out.println(produtos);
		}catch(IllegalArgumentException ex) {
			System.out.println(ex);
		}finally {
			System.out.println("Programa finalizado");
		}

	}

}
