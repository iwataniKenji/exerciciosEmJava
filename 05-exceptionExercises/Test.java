// classe não concluída

public class Test {
  
  public static void main(String arg[]) {
    Read read = new Read();
    Pessoa person = new Pessoa();
        
    try {
      person.setNome(Integer.parseInt(read.entDados("Informe o nome: ")));
      System.out.println("\nNOME: " + person.getNome());
    } catch (NameLengthException error) {
      // objeto 'error' gerado automaticamente -> uso do método do objeto
      error.impErroNome();
    } 
  }
}
