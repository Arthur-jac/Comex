package br.com.comex.csv;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class LeitorPedidosCsv {
	
	public static ArrayList<PedidoCsv> lerCsv() throws FileNotFoundException{
		ArrayList<PedidoCsv> pedidos = new ArrayList<PedidoCsv>();
		InputStream ip = new FileInputStream("pedidos.csv");
		Scanner ler = new Scanner(ip);
	
		ler.nextLine();
		while(ler.hasNext()) {
			String linha = ler.nextLine();
			String[] valor = linha.split(",");
			PedidoCsv pc = new PedidoCsv(valor[0], valor[1], valor[2], valor[3], valor[4], valor[5]);
			pedidos.add(pc);
		}
		
		ler.close();
		return pedidos;
	}
	
	public static void main(String[] args) throws FileNotFoundException {
		ArrayList<PedidoCsv> pedidos = new ArrayList<PedidoCsv>();
		pedidos = lerCsv();
		
		System.out.println("Total de pedidos -> " + pedidos.size());
	}
}

