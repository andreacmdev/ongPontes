package ongPontes;

public class Resultado extends Avaliacao {
	
	private String resultado;


	public void setResultado(String resultado) {
		if (getMediaAluno() > 6) {
			System.out.println(" APROVADO ");
		} else {
			System.out.println(" REPROVADO ");
		}
		this.resultado = resultado;
	}


	public String getResultado() {
		return resultado;
	}

}
