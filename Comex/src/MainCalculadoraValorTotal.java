
public class MainCalculadoraValorTotal {

	public static void main(String[] args) {
		
		double t;
		CalculadoraValorTotal total = new CalculadoraValorTotal();
		Produto p = new Produto();
		
		p.setNome("Celular");
		p.setPreco_unitario(1000.00);
		p.setQtd_pegada(2);
		
		ItemPedido item = new ItemPedido(null, p, 1, null);
		
		t = total.calcula(item,null);
		System.out.println(t);
		

	}

}
