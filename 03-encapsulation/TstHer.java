public class TstHer{

	public static void main(String arg[]) {
		Aluno aluno = new Aluno();

		// from aluno
		aluno.setRa(1);
		aluno.setCurso("ADS");

		// from pessoa
		aluno.setCpf(11);
		aluno.setNome("Aluno A");

		System.out.println("\nCPF - Aluno...: "+aluno.getCpf());
		System.out.println("NOME - Aluno..: "+aluno.getNome());
		System.out.println("\nCURSO - Aluno...: "+aluno.getCurso());
		System.out.println("RA - Aluno..: "+aluno.getRa());

		Professor professor = new Professor();
		
		// from professor
		professor.setCodP(16);
		professor.setTituloP("Mestre");
		
		// from pessoa
		professor.setCpf(115);
		professor.setNome("Professor A");

		System.out.println("\nCPF - Professor...: "+professor.getCpf());
		System.out.println("NOME - Professor..: "+professor.getNome());
		System.out.println("\nCURSO - Professor...: "+professor.getTituloP());
		System.out.println("RA - Professor..: "+professor.getCodP());
	}
}