import java.util.ArrayList;

public class MainCliente {

	public static void main(String[] args) {
		ArrayList<Object> clientes = new ArrayList<>();
		
		Cliente c1 = new Cliente("Ana", 123, 999, "Rua da Ana", "1111", "Sobrado 1", "Bairro da Ana", "Curitiba", "PR");
		
		Cliente c2 = new Cliente("Eli", 456, 888, "Rua da Eli", "2222", "Sobrado 2", "Bairro da Eli", "São Paulo", "SP");
		
		Cliente c3 = new Cliente("Gabi", 789, 777, "Rua da Gabi", "3333", "Sobrado 3", "Bairro da Gabi", "Rio de Janeiro", "RJ");
		
		clientes.add(c1);
		clientes.add(c2);
		clientes.add(c3);

		System.out.println(clientes);

	}

}
