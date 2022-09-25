// controller -> tem main

public class TstPes {
  
  static Leitura leitura = new Leitura();
  static int option = 0;

  public static void registerStudent() {
    Aluno aluno = new Aluno();

    aluno.setCpf(Integer.parseInt(leitura.entDados("\nDigite o CPF: ")));
    aluno.setNome(leitura.entDados("\nDigite o nome: "));
    aluno.setRa(Integer.parseInt(leitura.entDados("\nDigite o Ra: ")));
    aluno.setCurso(leitura.entDados("\nDigite o Curso: "));

    System.out.println("\nDADOS DO ALUNO:");
    System.out.println("CPF..: " +aluno.getCpf());
    System.out.println("NOME.: " +aluno.getNome());
    System.out.println("RA...: " +aluno.getRa());
    System.out.println("CURSO: " +aluno.getCurso());
  }

  public static void registerPerson() {
    Pessoa pessoa = new Pessoa();

    pessoa.setCpf(Integer.parseInt(leitura.entDados("\nDigite o CPF: ")));
    pessoa.setNome(leitura.entDados("\nDigite o nome: "));

    System.out.println("\nDADOS DA PESSOA:");
    System.out.println("CPF.: " +pessoa.getCpf());
    System.out.println("NOME: " +pessoa.getNome());
  }

  public static void registerTeacher() {
    Professor professor = new Professor();

    professor.setCpf(Integer.parseInt(leitura.entDados("\nDigite o CPF: ")));
    professor.setNome(leitura.entDados("\nDigite o nome: "));
    professor.setCodP(Integer.parseInt(leitura.entDados("\nDigite o código: ")));
    professor.setTituloP(leitura.entDados("\nDigite o título: "));

    System.out.println("\nDADOS DO PROFESSOR:");
    System.out.println("CPF...: " +professor.getCpf());
    System.out.println("NOME..: " +professor.getNome());
    System.out.println("CODIGO: " +professor.getCodP());
    System.out.println("TITULO: " +professor.getTituloP());
  }

  public static void main(String arg[]) {
    // menu de cadastro
    System.out.println("Digite o tipo de usuário que deseja cadastrar");
    System.out.println("1 - ALUNO");
    System.out.println("2 - PESSOA");
    System.out.println("3 - PROFESSOR");

    while (option != 1 && option != 2 && option != 3) {
      option = Integer.parseInt(leitura.entDados("\nInforme o código do usuário desejado: "));

      if (option != 1 && option != 2 && option != 3) {
        System.out.println("\nCódigo incorreto. Tente outra vez.");
      }
    }

    switch(option) {
      case 1:
        registerStudent();
        break;
      case 2:
        registerPerson();
        break;
      case 3:
        registerTeacher();
        break;
      default:
        System.out.println("Erro na aplicação. Por favor contacte o suporte.");
        break;
    }

    // Pessoa pessoa = new Pessoa(10, "Jesus", new Endereco());
    // Pessoa outraPessoa = new Pessoa();

    // pessoa.setCpf(Integer.parseInt(leitura.entDados("\nCPF..:")));
    // pessoa.setNome(leitura.entDados("NOME..:"));
    
    // // passagem do endereço da primeira pessoa
    // outraPessoa = pessoa;

    // // endereço é privado
    // pessoa.getEndereco().setRua(leitura.entDados("\nRUA..: "));
    // pessoa.getEndereco().setNum(Integer.parseInt(leitura.entDados("\nNÚMERO..: ")));

    // // print -> pessoa
    // System.out.println("\nCPF..: " +pessoa.getCpf());
    // System.out.println("NOME..: " +pessoa.getNome());
    // System.out.println("RUA..: " +pessoa.getEndereco().getRua());
    // System.out.println("NÚMERO..: " +pessoa.getEndereco().getNum());

    // // print -> outraPessoa
    // System.out.println("\nCPF..: " +outraPessoa.getCpf());
    // System.out.println("NOME..: " +outraPessoa.getNome());
  }
}