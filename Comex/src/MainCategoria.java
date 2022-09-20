import java.util.ArrayList;

public class MainCategoria {
	public static void main(String[] args) {
		ArrayList<Object> objetos = new ArrayList<>();
		
		Categoria c1 = new Categoria();
		
		Categoria c2 = new Categoria();
		
		Categoria c3 = new Categoria();
		
		c1.setId(1);
		c1.setNome("INFORMÁTICA");
		
		c2.setId(2);
		c2.setNome("MÓVEIS");
		c2.setStatus("INATIVA");
		
		c3.setId(3);
		c3.setNome("LIVROS");

		objetos.add(c1);
		objetos.add(c2);
		objetos.add(c3);
		
		System.out.println(objetos);
	}
}
