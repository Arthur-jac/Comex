package br.com.comex.main;
import br.com.comex.modelo.Categoria;
import br.com.comex.modelo.Produto;
import br.com.comex.modelo.Status;

public class MainProduto {

	public static void main(String[] args) {
		Categoria categoria = new Categoria("Alimento", Status.ATIVA);
		Produto produto = new Produto("Chocolate", 10, 2, categoria);
		
		try {
			if(produto.getId() > 0 &&
					produto.getNome() != null && produto.getNome().length() >= 5 && 
					produto.getPreco_unitario() > 0 && 
					produto.getQtd_estoque() > 0 && 
					produto.getCategoria() != null) { 
				System.out.println(produto);
			}else {
				throw new IllegalArgumentException("Produto invalido");
			}
		}catch(IllegalArgumentException ex) {
			System.out.println(ex);
		}finally {
			System.out.println("Programa finalizado");
		}

	}

}
