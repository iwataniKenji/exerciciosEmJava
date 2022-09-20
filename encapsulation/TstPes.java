// controller -> tem main

public class TstPes {
  
  public static void main(String arg[]) {
    Leitura leitura = new Leitura();
    Pessoa pessoa = new Pessoa(10, "Jesus", new Endereco());
    Pessoa outraPessoa = new Pessoa();

    pessoa.setCpf(Integer.parseInt(leitura.entDados("\nCPF..:")));
    pessoa.setNome(leitura.entDados("NOME..:"));
    
    // passagem do endereço da primeira pessoa
    outraPessoa = pessoa;

    // endereço é privado
    pessoa.getEndereco().setRua(leitura.entDados("\nRUA..: "));
    pessoa.getEndereco().setNum(Integer.parseInt(leitura.entDados("\nNÚMERO..: ")));

    // print -> pessoa
    System.out.println("\nCPF..: " +pessoa.getCpf());
    System.out.println("NOME..: " +pessoa.getNome());
    System.out.println("RUA..: " +pessoa.getEndereco().getRua());
    System.out.println("NÚMERO..: " +pessoa.getEndereco().getNum());

    // print -> outraPessoa
    System.out.println("\nCPF..: " +outraPessoa.getCpf());
    System.out.println("NOME..: " +outraPessoa.getNome());
  }
}