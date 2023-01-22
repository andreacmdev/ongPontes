package ongPontes;

public class Aluno extends Cadastro{

	private static int matricula = 1000;
	
	public Aluno() {
		setMatricula(getMatricula() + 1);
	}

	public static int getMatricula() {
		return matricula;
	}

	public static void setMatricula(int matricula) {
		Aluno.matricula = matricula;
	}
}
