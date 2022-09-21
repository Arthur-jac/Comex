import java.util.ArrayList;

public class MainPedido {

	public static void main(String[] args) {
		ArrayList<Object> pedidos = new ArrayList<>();
		
		Cliente c1 = new Cliente(1, "Fulano", 111, 999, "Rua do Fulano", "45A", "Sobrado 2", "Bairro do Fulano", "Curitiba", "PR");
		
		Pedido p1 = new Pedido(1,"21/09/2022",c1);
		
		Pedido p2 = new Pedido(2,"20/09/2022",c1);
		
		pedidos.add(p1);
		pedidos.add(p2);
		
		System.out.println(pedidos);

	}

}
