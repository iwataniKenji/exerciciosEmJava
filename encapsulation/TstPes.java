// controller -> tem main

public class TstPes {
  
  public static void main(String arg[]) {
    Leitura leitura = new Leitura();
    Pessoa pessoa = new Pessoa();

    // String cpf_S = leitura.entDados("\nCPF..:");
    // int cpf_I = Integer.parseInt(cpf_S);
    // pessoa.setCpf(cpf_I);

    pessoa.setCpf(Integer.parseInt(leitura.entDados("\nCPF..:")));
    pessoa.setNome(leitura.entDados("NOME..:"));

    System.out.println("\nCPF..: " +pessoa.getCpf());
    System.out.println("NOME..: " +pessoa.getNome());
  }
}