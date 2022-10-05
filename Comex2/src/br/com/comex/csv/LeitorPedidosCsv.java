package br.com.comex.csv;

import java.util.ArrayList;
import java.util.Iterator;

public class LeitorPedidosCsv {
	
	public static PedidoCsv cadastraPedido(String categoria, String produto, String cliente, String preco, String quantidade, String data) {
		PedidoCsv pc = new PedidoCsv(categoria, produto, cliente, preco, quantidade, data);
		return pc;
	}
	
	public static void main(String[] args) {
		ArrayList<PedidoCsv> pedidos = new ArrayList<PedidoCsv>();
		int soma = 0;
		
		pedidos.add(cadastraPedido("MÓVEIS","Sofá 3 lugares","ANA","2500.00","1","05/01/2022"));
		pedidos.add(cadastraPedido("INFORMÁTICA","Notebook Samsung","ANA","3523.00","1","01/01/2022"));
		pedidos.add(cadastraPedido("LIVROS","Clean Architecture","ANA","102.90","2","08/01/2022"));
		pedidos.add(cadastraPedido("MÓVEIS","Mesa de jantar 6 lugares","ELI","3678.98","1","06/01/2022"));
		pedidos.add(cadastraPedido("CELULARES","iPhone 13","ANA","1889.00","6","13/01/2022"));
		pedidos.add(cadastraPedido("INFORMÁTICA","Monitor Dell 27","DANI","1889.00","3","04/01/2022"));
		pedidos.add(cadastraPedido("LIVROS","Implementing Domain-Driven Design","GABI","144.07","3","10/01/2022"));
		pedidos.add(cadastraPedido("AUTOMOTIVA","Jogo de pneus","BIA","1276.79","1","15/01/2022"));
		pedidos.add(cadastraPedido("LIVROS","Clean Code","BIA","95.17","1","09/01/2022"));
		pedidos.add(cadastraPedido("CELULARES","Galaxy S22 Ultra","DANI","8549.10","5","14/01/2022"));
		pedidos.add(cadastraPedido("INFORMÁTICA","Macbook Pro 16","CAIO","31752.00","1","03/01/2022"));
		pedidos.add(cadastraPedido("LIVROS","Refactoring Improving the Design of Existing Code","DANI","173.90","1","12/01/2022"));
		pedidos.add(cadastraPedido("MÓVEIS","Cama queen size","DANI","3100.00","2","07/01/2022"));
		pedidos.add(cadastraPedido("AUTOMOTIVA","Central multimidia","CAIO","711.18","1","16/01/2022"));
		pedidos.add(cadastraPedido("LIVROS","Building Microservices","CAIO","300.28","2","11/01/2022"));
		pedidos.add(cadastraPedido("INFORMÁTICA","Galaxy Tab S8","BIA","5939.10","4","02/01/2022"));
		
		System.out.println("Total de pedidos -> " + pedidos.size());
		
		for (PedidoCsv p : pedidos) {
			soma += Integer.parseInt(p.getQuantidade()); 
		}
		
		System.out.println("Total de produtos vendidos -> " +soma);
	}
}

