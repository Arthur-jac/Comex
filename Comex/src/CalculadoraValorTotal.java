
public class CalculadoraValorTotal {
	
	public double calcula(ItemPedido item, Produto produto) {
		if (produto instanceof Produto) { 
			double total = produto.getPreco_unitario() * produto.getQtd_pegada();
			return total;
		}
		if(item instanceof ItemPedido) {
			double total = item.precoTotalsemDesconto();
			return total;
		}
		
		return 0;
	}
}
