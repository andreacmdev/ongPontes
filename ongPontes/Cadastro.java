package ongPontes;

public abstract class Cadastro {
	
	private String nome;
	private String cpf;
	private int telefone;
	private static int matricula = 1000;
	EnumOficina oficina;
	
	public Cadastro () {
		matricula++;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public int getTelefone() {
		return telefone;
	}

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}

	public EnumOficina getOficina() {
		return oficina;
	}
	
	public void setOficina(EnumOficina oficina) {				
		this.oficina = oficina;
	}
	
}
