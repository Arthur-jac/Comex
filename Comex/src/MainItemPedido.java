import java.util.ArrayList;

public class MainItemPedido {
	public static void main(String[] args) {
		ArrayList<Object> itens = new ArrayList<>();
		
		Produto produto = new Produto();
		
		produto.setPreco_unitario(10);
		produto.setNome("Chocolate");
		
		Pedido pedido = new Pedido(1, "21/09/2022", null);
		
		ItemPedido ip1 = new ItemPedido(pedido, produto, 11, 50, "QUANTIDADE");
		
		Produto produto2 = new Produto();
		
		produto2.setPreco_unitario(999.99);
		produto2.setNome("Celular");
		
		Pedido pedido2 = new Pedido(3, "07/09/2022", null);
		
		ItemPedido ip2 = new ItemPedido(pedido2, produto2, 1, 100, "PROMOÇÃO");
		
		itens.add(ip1);
		itens.add(ip2);
		
		System.out.println(itens);
	}
}
