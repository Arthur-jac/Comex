package br.com.comex.main;

import java.util.ArrayList;

import br.com.comex.modelo.Cliente;
import br.com.comex.modelo.EstadoCliente;
import br.com.comex.modelo.Pedido;

public class MainPedido {

	public static void main(String[] args) {
		ArrayList<Object> pedidos = new ArrayList<>();
		
		Cliente c1 = new Cliente("Arthur", "01234867872", "99999999999", "rua do arthur", "N12", null,"bairro do arthur"
				, "cidade do arhur", EstadoCliente.PR);
		
		Pedido p1 = new Pedido("21/09/2022",c1);
		
		Pedido p2 = new Pedido("20/09/2022",c1);
		
		pedidos.add(p1);
		pedidos.add(p2);
		
		System.out.println(pedidos);

	}

}