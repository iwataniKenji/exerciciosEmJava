// NOME: KLEVERSON KENJI IWATANI
// RA: 2465205

public final class Carga extends Veiculo {
  private int tara;
  private int cargaMax;

  // constructor
  public Carga() {
    super();
    tara = 0;
    cargaMax = 0;
  }

  // constructor (sobrecarga)
  public Carga(String placa, String marca, String modelo, String cor, int qtdRodas, int velocMax, Motor motor, String dataCadastro, int tara, int cargaMax) {
    super(placa, marca, modelo, cor, qtdRodas, velocMax, motor, dataCadastro);
    this.tara = tara;
    this.cargaMax = cargaMax;
  }

  public final int calcular(){
    // contar valores numéricos
    return getMotor().getQtdPistoes() + getMotor().getPotencia() + getQtdRodas() + getVelocMax() + getTara() + getCargaMax();
	}

  // getters
  public final int getTara() {
    return tara;
  }
  public final int getCargaMax() {
    return cargaMax;
  }

  // setters
  public final void setTara(int tara) {
    this.tara = tara;
  }
  public final void setCargaMax(int cargaMax) {
    this.cargaMax = cargaMax;
  }

  // abstract method
  public final int calcVel() {
    // centímetros por hora
    return getVelocMax() * 100000;
  }
}
