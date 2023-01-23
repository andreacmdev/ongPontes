package ongPontes;

public class Avaliacao extends Aluno {
	
	private int presenca;
	private int notaEscolar;
	private int notaOficina;
	private int colaboracao;
	private double mediaAluno;
	
	public Avaliacao() {		
	}

	public int getPresenca() {
		return presenca;
	}

	public void setPresenca(int pontoPresenca) {
		if (pontoPresenca == 10) {
			presenca = 2;
		} else if (pontoPresenca < 10 && pontoPresenca > 5) {
			presenca = 1;
		} else if  (pontoPresenca < 5){
			presenca = 0;
		} else {
			System.out.println("Avaliacão Inválida");
		}
	}

	public double getNotaEscolar() {
		return notaEscolar;
	}

	public void setNotaEscolar(int notaEscola) {
		if (notaEscola == 10) {
			notaEscolar = 2;
		} else if (notaEscola < 10 && notaEscola > 5) {
			notaEscolar = 1;
		} else if  (notaEscola < 5){
			notaEscolar = 0;
		} else {
			System.out.println("Avaliacão Inválida");
		}
	}

	public double getNotaOficina() {
		return notaOficina;
	}

	public void setNotaOficina(int notaOficina) {
		if (notaOficina > 4 ) {
			System.out.println("Avaliacão Inválida");
		}
	}

	public int getColaboracao() {
		return colaboracao;
	}

	public void setColaboracao(String colaboracao) {
		if (notaOficina > 2 ) {
			System.out.println("Avaliacão Inválida");
		}		
		
	}

	public double getMediaAluno() {
		return mediaAluno;
	}

	public void setMediaAluno(double mediaAluno) {
		mediaAluno = presenca + notaEscolar + notaOficina + colaboracao;
	}
}
