package br.com.comex.modelo;

import java.util.regex.Pattern;

public class Cliente {
	private static int sequence = 1;
	private int id;
	private String nome;
	private String cpf;
	private String telefone;
	private String rua;
	private String numero;
	private String complemento;
	private String bairro;
	private String cidade;
	private EstadoCliente estado;
	
	
	
	
	public Cliente(String nome, String cpf, String telefone, String rua, String numero, String complemento,
			String bairro, String cidade, EstadoCliente estado) {
		
		if(nome == null || nome.length() < 5) {
			throw new IllegalArgumentException("O nome não pode ser nullo ou ser menor que 4 caracteres");
		}
		
		if(nome.startsWith("0") || nome.startsWith("1") || nome.startsWith("2") || nome.startsWith("3") || nome.startsWith("4") ||
				nome.startsWith("5") || nome.startsWith("6") || nome.startsWith("7") || nome.startsWith("8") || nome.startsWith("9")) {
			throw new IllegalArgumentException("O nome não pode começar com números");
		}
		
		if(cpf == null) {
			throw new IllegalArgumentException("O cpf não pode ser nulo");
		}
		
		if(!cpf.matches("[0-9]{11}") || cpf.length() != 11) {
			throw new IllegalArgumentException("O cpf não poder letras ou ser diferente de 11 números");
		}else {
			String primeiro = cpf.substring(0,3);
			String segundo = cpf.substring(3,6);
			String terceiro = cpf.substring(6,9);
			String quarto = cpf.substring(9,11);
			
			cpf = primeiro+"."+segundo+"."+terceiro+"-"+quarto;
		}
		
		if(!telefone.matches("[0-9]{11}") || telefone.length() != 11) {
			throw new IllegalArgumentException("O telefone não poder letras ou ser diferente de 11 números");
		}else {
			String primeiro = telefone.substring(0,2);
			String segundo = telefone.substring(2,6);
			String terceiro = telefone.substring(6,11);
			
			telefone = "("+primeiro+")"+segundo+"-"+terceiro;
		}
		
		if(id < 0) {
			throw new IllegalArgumentException("O id não pode ser menor que zero");
		}
		
		if(rua == null || rua.length() < 5 || numero == null || numero.length() < 1 || bairro == null || bairro.length() < 1 ||
				cidade == null || cidade.length() < 1 || estado == null) {
			throw new IllegalArgumentException("O endereço está incorreto");
		}
		
		if(id < 0) {
			throw new IllegalArgumentException("O id não pode ser menor que zero");
		}
		
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
	public String getCpf() {
		return cpf;
	}
	public String getTelefone() {
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
	public EstadoCliente getEstado() {
		return estado;
	}
	
	@Override
	public String toString() {
		return "Cliente "
				+ " ID -> " + id + " \n"
				+ " Nome -> " + nome + " \n"
				+ " CPF -> " + cpf + " \n"
				+ " Telefone -> " + telefone + " \n"
				+ " Rua -> " + rua + " \n"
				+ " Numero -> " + numero + " \n"
				+ " Complemento -> " + complemento + " \n"
				+ " Bairro -> " + bairro + " \n"
				+ " Cidade -> " + cidade + " \n"
				+ " Estado -> " + estado + " \n \n";
	}
}
