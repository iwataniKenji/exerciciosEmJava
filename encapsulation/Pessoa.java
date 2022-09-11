// model -> não tem main

public class Pessoa {
  
  // encapsulado -> não permite acesso direto
  private int cpf = 0;
  private String nome = "";
  private Endereco endereco = new Endereco();
  
  // getters -> retorna valor do atributo
  public int getCpf() {
    return cpf;
  }
  public String getNome() {
    return nome;
  }
  public Endereco getEndereco() {
    return endereco;
  }

  // setters -> alterar valor do atributo
  public void setCpf(int cpf) {
    if (cpf >= 0) {
      this.cpf = cpf;
    } else {
      System.out.println("\nERRO de CPF!");
      this.cpf = 1000;
    }
  }
  public void setNome(String nome) {
    this.nome = nome;
  }
  public void setEndereco(Endereco endereco) {
    this.endereco = endereco;
  }
}