import java.util.ArrayList;

public class MainItemPedido {
	public static void main(String[] args) {
		ArrayList<Object> itens = new ArrayList<>();
		
		Categoria c1 = new Categoria();		
		c1.setNome("INFORMÁTICA");

		Produto produto = new Produto();
		Cliente cliente = new Cliente("Ana", 123, 999, "Rua da Ana", "1111", "Sobrado 1", "Bairro da Ana", "Curitiba", "PR");
		
		produto.setNome("Notebook Samsung");
		produto.setPreco_unitario(3523.00);
		produto.setQtd_estoque(1);
		produto.setQtd_pegada(1);
		produto.setCategoria(c1);
		
		Pedido pedido = new Pedido("21/09/2022", cliente);
		
		// Testes para a promoção
		ItemPedido item1 = new ItemPedido(pedido, produto, 2, "NENHUM"); 
		ItemPedido item2 = new ItemPedido(pedido, produto, 1,"PROMOÇÃO");
		ItemPedido item3 = new ItemPedido(pedido, produto, 11, "QUANTIDADE");
		
		itens.add(item1);
		itens.add(item2);
		itens.add(item3);
		
		System.out.println(itens);
	}
}
