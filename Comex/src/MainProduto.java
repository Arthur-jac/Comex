import java.util.ArrayList; 

public class MainProduto {

	public static void main(String[] args) {
		ArrayList<Object> produtos = new ArrayList<>();
		
		CriaCategoria cc = new CriaCategoria();
		
		Produto p1 = new Produto();
		
		Produto p2 = new Produto();
		
		Produto p3 = new Produto();
		
		p1.setId(1);
		p1.setNome("Notebook Samsung");
		p1.setPreco_unitario(3523.00);
		p1.setQtd_estoque(1);
		p1.setCategoria(cc.criaCategoria("informatica"));
		
		p2.setId(2);
		p2.setNome("Clean Architecture");
		p2.setPreco_unitario(102.90);
		p2.setQtd_estoque(2);
		p2.setCategoria(cc.criaCategoria("livros"));
		
		p3.setId(3);
		p3.setNome("Monitor Dell 27");
		p3.setPreco_unitario(1889.00);
		p3.setQtd_estoque(3);
		p3.setCategoria(cc.criaCategoria("informatica"));
		
		produtos.add(p1);
		produtos.add(p2);
		produtos.add(p3);
		
		System.out.println(produtos);
		
		
	}

}
