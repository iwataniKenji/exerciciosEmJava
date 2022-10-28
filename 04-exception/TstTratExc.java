public class TstTratExc {
  public static void main (String arg[]) {
    Leitura leitura = new Leitura();
    Pessoa pessoa = new Pessoa();

    boolean vai = true;

    try {
      pessoa.setCpf(Integer.parseInt(leitura.entDados("Informe o CPF: "));
      pessoa.setNome(leitura.entDados("\nInforme o NOME:");
    } catch (CpfNegException cne) {
      cne.impErroCpfNeg();
      pessoa = cne.consertaCpfNeg(pessoa);
    } catch (CpfGdrException cge) {
      cge.impErroCpfGdr();
    } catch (NumberFormatException nfe) {
      System.out.println("\nCPF deve ser um numero inteiro! ");
    } catch (NomeException ne) {
      ne.impErroNome();
    } finally {
      System.out.println("\nCPF: "+pessoa.getCpf());
      System.out.println("\nNOME: "+pessoa.getNome());
    }
  }  
}
