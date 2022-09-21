
public class Cliente {
	private int id;
	private String nome;
	private int cpf;
	private int telefone;
	private String rua;
	private String numero;
	private String complemento;
	private String bairro;
	private String cidade;
	private String estado;
	private static int sequence = 1;
	
	
	
	public Cliente(String nome, int cpf, int telefone, String rua, String numero, String complemento,
			String bairro, String cidade, String estado) {
		this.id = sequence++;
		this.nome = nome;
		this.cpf = cpf;
		this.telefone = telefone;
		this.rua = rua;
		this.numero = numero;
		this.complemento = complemento;
		this.bairro = bairro;
		this.cidade = cidade;
		this.estado = estado;
	}
	
	public int getId() {
		return id;
	}
	public String getNome() {
		return nome;
	}
	public int getCpf() {
		return cpf;
	}
	public int getTelefone() {
		return telefone;
	}
	public String getRua() {
		return rua;
	}
	public String getNumero() {
		return numero;
	}
	public String getComplemento() {
		return complemento;
	}
	public String getBairro() {
		return bairro;
	}
	public String getCidade() {
		return cidade;
	}
	public String getEstado() {
		return estado;
	}

	@Override
	public String toString() {
		return " \n Cliente ID ->" + id + " \n"
				+ " Nome -> " + nome + " \n"
				+ " CPF -> " + cpf + " \n"
				+ " Telefone -> " + telefone + " \n"
				+ " Rua -> " + rua
				+ " Numero ->" + numero + "\n"
				+ " Complemento -> " + complemento + "\n"
				+ " Bairro -> " + bairro + " \n"
				+ " Cidade -> " + cidade + " \n"
				+ " Estado -> " + estado + " \n \n";
	}
	
	
}
