package br.com.comex.csv;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class TotalCategorias {
	public static void main(String[] args) throws FileNotFoundException {
		LeitorPedidosCsv lpc = new LeitorPedidosCsv();
		ArrayList<PedidoCsv> pedidos = lpc.lerCsv();

		
		Set<String> set = new HashSet<String>(); 
		
		for (PedidoCsv p : pedidos) {
			set.add(p.getCategoria());
		}
		
		
		System.out.println("Total de categorias -> " + set.size());
	}
}
