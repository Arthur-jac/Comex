
public class Categoria {
	private int id;
	private String nome;
	private String status;
	private static int sequence = 1;
	
	public Categoria() {
		this.id = sequence++;
		this.status = "ATIVO";
	}
	
	
	public int getId() {
		return id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	@Override
	public String toString() {
		return "\n Categoria " +this.nome+ "(" +this.id+ "-" +this.status+ ") \n";
	}
	
}
