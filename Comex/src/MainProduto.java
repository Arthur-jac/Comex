import java.util.ArrayList; 

public class MainProduto {

	public static void main(String[] args) {
		ArrayList<Object> produtos = new ArrayList<>();
		
		Categoria c1 = new Categoria();
		Categoria c3 = new Categoria();
		c1.setNome("INFORMÁTICA");
		c3.setNome("LIVROS");
		
		Produto p1 = new Produto();
		
		//Produto p2 = new Produto();
		ProdutoIsento pi = new ProdutoIsento();
		
		Produto p3 = new Produto();
		
		p1.setNome("Notebook Samsung");
		p1.setPreco_unitario(3523.00);
		p1.setQtd_estoque(1);
		p1.setQtd_pegada(1);
		p1.setCategoria(c1);
		
		pi.setNome("Clean Architecture");
		pi.setPreco_unitario(102.90);
		pi.setQtd_estoque(2);
		pi.setQtd_pegada(1);
		pi.setCategoria(c3);
		
		p3.setNome("Monitor Dell 27");
		p3.setPreco_unitario(1889.00);
		p3.setQtd_estoque(3);
		p3.setQtd_pegada(1);
		p3.setCategoria(c1);
		
		produtos.add(p1);
		produtos.add(pi);
		produtos.add(p3);
		
		System.out.println(produtos);
		
		
	}

}
