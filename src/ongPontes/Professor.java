package ongPontes;

public class Professor extends Cadastro {

	private static int senha = 7777;
	
	public Professor() {
		senha = getSenha() + 1;
	}

	public static int getSenha() {
		return senha;
	}
	
}
