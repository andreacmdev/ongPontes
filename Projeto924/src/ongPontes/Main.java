package ongPontes;

public class Main {

	public static void main(String[] args) {
		
		Aluno aluno1 = new Aluno();
		aluno1.setOficina(EnumOficina.FUTEBOL);
		aluno1.setNome("Andre");
		aluno1.setEndereco("Rua teixeira, 46");
		aluno1.setRgIdentidade(7241110);
		aluno1.setTelefone(995707334);
		System.out.println(aluno1);
		
		Aluno aluno2 = new Aluno();
		aluno2.setOficina(EnumOficina.MUSICA);
		aluno2.setNome("Andressa");
		aluno2.setRgIdentidade(5207059);
		aluno2.setEndereco("Rua seis, 9");
		aluno2.setTelefone(995255658);
		System.out.println(aluno2);
		
		Professor professorFut = new Professor();
		professorFut.setOficina(EnumOficina.FUTEBOL);
		professorFut.setNome("Nildo");
		professorFut.setCpf("09796948419");
		professorFut.setEndereco("Rua Cap Benedito Bragaça, 426");
		professorFut.setTelefone(994565852);
		System.out.println(professorFut);
		
		Professor professorMus = new Professor();
		professorMus.setOficina(EnumOficina.MUSICA);
		professorMus.setNome("Rejane");
		professorMus.setCpf("70452312358");
		professorMus.setEndereco("Rua expedito Lopes, 98");
		professorMus.setTelefone(984653278);
		System.out.println(professorMus);
	}

}
