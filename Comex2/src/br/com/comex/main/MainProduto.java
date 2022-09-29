package br.com.comex.main;
import br.com.comex.modelo.Categoria;
import br.com.comex.modelo.Produto;
import br.com.comex.modelo.Status;

public class MainProduto {

	public static void main(String[] args) {
		Categoria categoria = new Categoria("Alimento", Status.ATIVA);
		Produto produto = new Produto("Chocolate", 5, 2, categoria);
		
		// Problema no nome
		//Produto produto2 = new Produto("3Chocolate", 5, 2, categoria);
		
		// Problema no estoque ou preço
		//Produto produto2 = new Produto("Chocolate", 0, 0, categoria);
		
		// Problema na categoria
		//Produto produto2 = new Produto("Chocolate", 5, 2, null);
		
		
		try {
			System.out.println(produto);
		}catch(IllegalArgumentException ex) {
			System.out.println(ex);
		}finally {
			System.out.println("Programa finalizado");
		}

	}

}
