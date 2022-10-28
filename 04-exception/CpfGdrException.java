// extends Exception -> classe se torna throwable
public class CpfGdrException extends Exception {
  
  // constructor chamado em -> new CpfNegException()
  public void impErroCpfGrd() {
    System.out.println("\nO valor do CPF deve ser <= 1000!");
  }
}
