package br.com.comex.csv;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class MontanteTotalVendas {

	public static void main(String[] args) throws FileNotFoundException {
		LeitorPedidosCsv lpc = new LeitorPedidosCsv();
		ArrayList<PedidoCsv> pedidos = lpc.lerCsv();
		double total = 0;
		double multi = 0;
		for (PedidoCsv p : pedidos) {
			
			multi = Integer.parseInt(p.getQuantidade()) * Double.parseDouble(p.getPreco());
			total += multi;
		}
		
		System.out.println("Montante de vendas -> " + total);

	}

}
