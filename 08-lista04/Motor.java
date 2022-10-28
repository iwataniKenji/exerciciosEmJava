// NOME: KLEVERSON KENJI IWATANI
// RA: 2465205

public class Motor {
  private int qtdPistoes;
  private int potencia;
  
  // constructor
  public Motor() {
    qtdPistoes = 4;
    potencia = 100;
  }

  // constructor (sobrecarga)
  public Motor(int qtdPistoes, int potencia) {
    this.qtdPistoes = qtdPistoes;
    this.potencia = potencia;
  }

  // getters
  public int getQtdPistoes() {
    return qtdPistoes;
  }
  public int getPotencia() {
    return potencia;
  }

  // setters
  public final void setQtdPistoes(int qtdPistoes) {
    this.qtdPistoes = qtdPistoes;
  }
  public final void setPotencia(int potencia) {
    this.potencia = potencia;
  }
}
