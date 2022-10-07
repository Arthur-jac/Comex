package br.com.comex.csv;

import java.util.ArrayList;

import br.com.comex.modelo.Categoria;
import br.com.comex.modelo.Cliente;
import br.com.comex.modelo.EstadoCliente;
import br.com.comex.modelo.ItemPedido;
import br.com.comex.modelo.Pedido;
import br.com.comex.modelo.Produto;
import br.com.comex.modelo.Status;

public class MainCsvParaPedido {

	public static void main(String[] args) {
		ArrayList<CsvParaPedido> pedidos = new ArrayList<CsvParaPedido>();
		
		Categoria categoria = new Categoria("Moda", Status.INATIVA);
		
		Categoria categoria2 = new Categoria("Alimenticia", Status.INATIVA);
		
		Cliente cliente = new Cliente("Arthur", "01234867872", "99999999999", "rua do arthur", "N12", null,"bairro do arthur"
				, "cidade do arhur", EstadoCliente.PR);
		
		Produto produto = new Produto("Chocolate", 5, 2, categoria2);
		
		Produto produto2 = new Produto("Pizza", 50, 1, categoria2);
		
		Pedido pedido = new Pedido("21/09/2022",cliente);
		
		ItemPedido item = new ItemPedido(pedido, produto, 1, "NENHUM");
		
		CsvParaPedido cpp = new CsvParaPedido(cliente, categoria2, produto, pedido, item);
		CsvParaPedido cpp2 = new CsvParaPedido(cliente, categoria2, produto2, pedido, item);
		
		pedidos.add(cpp);
		pedidos.add(cpp2);
		
		cpp.totalCategorias(pedidos);
		cpp.leitorPedidos(pedidos);
		cpp.totalProdutosVendidos(pedidos);
		cpp.montanteTotal(pedidos);
		cpp.pedidoMaisBaratoMaisCaro(pedidos);

	}

}
