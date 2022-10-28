// NOME: KLEVERSON KENJI IWATANI
// RA: 2465205

public abstract class Veiculo {
  private String placa;
  private String marca;
  private String modelo;
  private String cor;
  private int qtdRodas;
  private int velocMax;

  private Motor motor = new Motor();

  private String dataCadastro;

  // constructor
  public Veiculo() {
    placa = "BRA2E19";
    marca = "Corolla";
    modelo = "2.0 Altis Premium CVT";
    cor = "Prata";
    qtdRodas = 4;
    velocMax = 199;
    motor = new Motor();
    dataCadastro = "25/10/2022";
  }

  // constructor (sobrecarga)
  public Veiculo(String placa, String marca, String modelo, String cor, int qtdRodas, int velocMax, Motor motor, String dataCadastro) {
    this.placa = placa;
    this.marca = marca;
    this.modelo = modelo;
    this.cor = cor;
    this.qtdRodas = qtdRodas;
    this.velocMax = velocMax;
    this.motor = motor;
    this.dataCadastro = dataCadastro;
  }

  // getters
  public Motor getMotor(){
    return motor;
  }
  public String getPlaca() {
    return placa;
  }
  public String getMarca() {
    return marca;
  }
  public String getModelo() {
    return modelo;
  }
  public String getCor() {
    return cor;
  }
  public int getQtdRodas() {
    return qtdRodas;
  }
  public int getVelocMax() {
    return velocMax;
  }
  public String getDataCadastro() {
    return dataCadastro;
  }

  // setters
  public final void setMotor(Motor motor){
    this.motor  = motor;
  }
  public final void setPlaca(String placa) {
    this.placa = placa;
  }
  public final void setMarca(String marca) {
    this.marca = marca;
  }
  public final void setModelo(String modelo) {
    this.modelo = modelo;
  }
  public final void setCor(String cor) {
    this.cor = cor;
  }
  public final void setQtdRodas(int qtdRodas) {
    this.qtdRodas = qtdRodas;
  }
  public final void setVelocMax(int velocMax) {
    if (velocMax < 10 || velocMax > 250) {
      System.out.println("Velocidade máxima está fora dos limites brasileiros!");
      this.velocMax = 100;
    } else {
      this.velocMax = velocMax;
    }
  }
  public void setDataCadastro(String dataCadastro) {
    this.dataCadastro = dataCadastro;
  }

  // abstract method
  public abstract int calcVel();
}
