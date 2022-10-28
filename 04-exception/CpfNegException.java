// extends Exception -> classe se torna throwable
public class CpfNegException extends Exception {
  
  Leitura leitura = new Leitura();

  public void impErroCpfNeg() {
    System.out.println("\nO valor do CPFdeve ser positivo!");
  }

  public Pessoa consertaCpfNeg(Pessoa pessoa) {
    try {
      pessoa.setCpf(Integer.parseInt(leitura.entDados("Informe DE NOVO o CPF: ")));
    } catch (CpfNegException cne) {
      cne.impErroCpfNeg();
      cne.consertaCpfNeg(pessoa);
    } catch (CpfGrdException cge) {
      cge.impErroCpfGrd();
      cge.consertaCpfGrd(pessoa);
    } catch (NumberFormatException nfe) {
      System.out.println("\nCPF deve ser um numero inteiro!");
    }
    return pessoa;
  }
}
