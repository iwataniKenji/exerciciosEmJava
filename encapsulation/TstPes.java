// controller -> tem main

public class TstPes {
  
  public static void main(String arg[]) {
    Leitura leitura = new Leitura();
    Pessoa pessoa = new Pessoa();

    pessoa.setCpf(Integer.parseInt(leitura.entDados("\nCPF..:")));
    pessoa.setNome(leitura.entDados("NOME..:"));
    
    // endereço é privado
    pessoa.getEndereco().setRua(leitura.entDados("\nRUA..: "));
    pessoa.getEndereco().setNum(Integer.parseInt(leitura.entDados("\nNÚMERO..: ")));

    System.out.println("\nCPF..: " +pessoa.getCpf());
    System.out.println("NOME..: " +pessoa.getNome());
    System.out.println("RUA..: " +pessoa.getEndereco().getRua());
    System.out.println("NÚMERO..: " +pessoa.getEndereco().getNum());
  }
}