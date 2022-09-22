import java.util.ArrayList;

public class MainCategoria {
	public static void main(String[] args) {
		ArrayList<Object> objetos = new ArrayList<>();
		
		Categoria c1 = new Categoria();
		
		Categoria c2 = new Categoria();
		
		Categoria c3 = new Categoria();
		
		c1.setNome("INFORMÁTICA");
		
		c2.setNome("MÓVEIS");
		c2.setStatus(false);
		
		c3.setNome("LIVROS");
	
		objetos.add(c1);
		objetos.add(c2);
		objetos.add(c3);
		
		System.out.println(objetos);
	}
}
