import java.util.ArrayList; 

public class MainProduto {

	public static void main(String[] args) {
		ArrayList<Object> produtos = new ArrayList<>();
		
		CriaCategoria cc = new CriaCategoria();
		
		Produto p1 = new Produto();
		
		//Produto p2 = new Produto();
		ProdutoIsento pi = new ProdutoIsento();
		
		Produto p3 = new Produto();
		
		p1.setNome("Notebook Samsung");
		p1.setPreco_unitario(3523.00);
		p1.setQtd_estoque(1);
		p1.setCategoria(cc.criaCategoria("informatica"));
		
		pi.setNome("Clean Architecture");
		pi.setPreco_unitario(102.90);
		pi.setQtd_estoque(2);
		pi.setCategoria(cc.criaCategoria("livros"));
		
		p3.setNome("Monitor Dell 27");
		p3.setPreco_unitario(1889.00);
		p3.setQtd_estoque(3);
		p3.setCategoria(cc.criaCategoria("informatica"));
		
		produtos.add(p1);
		produtos.add(pi);
		produtos.add(p3);
		
		System.out.println(produtos);
		
		
	}

}
