// NOME: KLEVERSON KENJI IWATANI
// RA: 2465205

public final class Passeio extends Veiculo implements Calc {
  private int qtdePassageiros;
  
  // constructor
  public Passeio() {
    super();
    qtdePassageiros = 5;
  }

  // constructor (sobrecarga)
  public Passeio(String placa, String marca, String modelo, String cor, int qtdRodas, int velocMax, Motor motor, String dataCadastro, int qtdePassageiros) {
    super(placa, marca, modelo, cor, qtdRodas, velocMax, motor, dataCadastro);
    this.qtdePassageiros = qtdePassageiros;
  }

  public final int calcular(){
    // contar quantidade de letras
    int placaLetras = getPlaca().length();
    int marcaLetras = getMarca().length();
    int modeloLetras = getModelo().length();
    int corLetras = getCor().length();
    int dataCadastroLetras = getDataCadastro().length();

    return placaLetras + marcaLetras + modeloLetras + corLetras + dataCadastroLetras;
	}

  // getters
  public final int getQtdePassageiros() {
    return qtdePassageiros;
  }

  // setters
  public final void setQtdePassageiros(int qtdePassageiros) {
    this.qtdePassageiros = qtdePassageiros;
  }
  
  // abstract method
  public final int calcVel() {
    // metros por hora
    return (getVelocMax() * 1000) / 3600;
  }
}
