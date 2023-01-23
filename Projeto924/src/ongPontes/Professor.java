package ongPontes;

public class Professor extends Cadastro {

	private String cpf;
	private static int senha = 7777;
	
	public Professor() {
		senha = getSenha() + 1;
	}

	public static int getSenha() {
		return senha;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	@Override
	public String toString() {
		return " PROFESSOR "
				+ "Nome: " + getNome()
				+ " - Cpf: " + getCpf() 
				+ " - Telefone: " + getTelefone()
				+ " - Endereço: " + getEndereco()
				+ " - Oficina: " + getOficina() + "]";
	}
	
	
}
