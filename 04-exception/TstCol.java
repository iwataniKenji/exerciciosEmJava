import java.util.List;
import java.util.ArrayList;

public class TstCol {

  private static Leitura leitura = new Leitura();
  private static Pessoa pessoa = new Pessoa();

  private static List<Pessoa> bDPes = new ArrayList<Pessoa>();
  
  public static void main(String arg[]) {
    inserePessoa();
    imprimeAllPessoas();
    alteraPessoaPeloCpf();
    imprimeAllPessoas(); 
    removePessoaPeloCpf();
    imprimeAllPessoas();
  }

  public static void inserePessoa() {
    String response = "S";
    
    // ignoreCase -> ignora diferença maiúsculo/minúsculo
    while (response.equalsIgnoreCase("S")) {

      pessoa = new Pessoa();
      
      pessoa.setCpf(Integer.parseInt(leitura.entDados("CPF.: ")));
      pessoa.setNome(leitura.entDados("Nome: "));

      boolean vai = consultaPessoaPeloCpf(pessoa);
      
      if (vai) {
        bDPes.add(pessoa)
      }
    }

    response = leitura.entDados("\n\tDeseja continuar? <S/N>");
  }

  public static boolean consultaPessoaPeloCpf(Pessoa pessoaCpf) {
    for (int i = 0; i < bDPes.size(); i++) {
      if (pessoaCpf.getCpf() == bDPes.get[i].getCpf()) {
        System.out.println("\n\tCPF já existe no índice: "+ i);
        return false;
      } 
    }
    return true;
  }

  public static boolean alteraPessoaPeloCpf() {
    Pessoa pessoaCpf = new Pessoa();

    pessoaCpf.setCpf(Integer.parseInt(leitura.entDados("Informe o CPF a ser alterado ")));
    
    for (int i = 0; i < bDPes.size(); i++) {
      if (pessoaCpf.getCpf() == bDPes.get(i).getCpf()) {
        pessoaCpf.setNome(leitura.entDados("Informe o novo nome: "));
        bDPes.set(i, pessoaCpf);
        return true;
      }
    }
    return false;
  }

  public static boolean removePessoaPeloCpf() {
    Pessoa pessoaCpf = new Pessoa();

    pessoaCpf.setCpf(Integer.parseInt(leitura.entDados("Informe o CPF a ser apagado: ")));
    
    for (int i = 0; i < bDPes.size(); i++) {
      if (pessoaCpf.getCpf() == bDPes.get(i).getCpf()) {
        bDPes.remove(i);
        return true;
      }
    }
    return false;
  }

  public static void imprimeAllPessoas() {
    for (int i = 0; i < bDPes.size(); i++) {
      System.out.println("CPF: "+ bDPes.get(i).getCpf()
      + " - NOME: "
      + bDPes.get(i).getNome()
      + " - INDICE: "
      + i);
    }
  }
}