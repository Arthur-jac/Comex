
public class Categoria {
	private int id;
	private String nome;
	private boolean status;
	private static int sequence = 1;
	
	public Categoria() {
		this.id = sequence++;
		this.status = true;
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
	
	public boolean getStatus() {
		return status;
	}
	
	public void setStatus(boolean status) {
		this.status = status;
	}
	
	public String statusCheck() {
		if(this.status) 
			return "ATIVA";
		return "INATIVA";
	}
	
	@Override
	public String toString() {
		return "\n Categoria " +this.nome+ "(" +this.id+ "-" + statusCheck() + ") \n";
	}
	
}
