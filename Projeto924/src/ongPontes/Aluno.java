package ongPontes;

public class Aluno extends Cadastro{

	private int RgIdentidade;
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

	public int getRgIdentidade() {
		return RgIdentidade;
	}

	public void setRgIdentidade(int rgIdentidade) {
		RgIdentidade = rgIdentidade;
	}

	@Override
	public String toString() {
	return " ALUNO "
			+ "Nome: " + getNome()
			+ " - Identidade: " + getRgIdentidade() 
			+ " - Telefone: " + getTelefone()
			+ " - Endereço: " + getEndereco()
			+ " - Oficina: " + getOficina()
			+ " - Matricula: " + getMatricula() + "]";
	}
	
}
