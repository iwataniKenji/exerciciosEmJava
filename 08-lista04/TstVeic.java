// NOME: KLEVERSON KENJI IWATANI
// RA: 2465205

public class TstVeic {

  static Leitura leitura = new Leitura();
  static int option = 0;

  public static void registerPasseio() {
    Passeio passeio = new Passeio();

    // da classe veículo
    passeio.setPlaca(leitura.entDados("\nDigite a placa: "));
    passeio.setMarca(leitura.entDados("\nDigite a marca: "));
    passeio.setModelo(leitura.entDados("\nDigite o modelo: "));
    passeio.setCor(leitura.entDados("\nDigite a cor: "));
    passeio.setQtdRodas(Integer.parseInt(leitura.entDados("\nDigite a quantidade de rodas: ")));
    passeio.setVelocMax(Integer.parseInt(leitura.entDados("\nDigite a velocidade máxima: ")));

    // da classe passeio
    passeio.setQtdePassageiros(Integer.parseInt(leitura.entDados("\nDigite a quantidade de passageiros: ")));

    // da classe motor
    passeio.getMotor().setQtdPistoes(Integer.parseInt(leitura.entDados("\nDigite a quantidade de pistões: ")));
    passeio.getMotor().setPotencia(Integer.parseInt(leitura.entDados("\nDigite a potência do motor: ")));

    // impressões
    System.out.println("\nDADOS DO VEÍCULO DE PASSEIO:");
    System.out.println("PLACA...........: " + passeio.getPlaca());
    System.out.println("MARCA...........: " + passeio.getMarca());
    System.out.println("MODELO..........: " + passeio.getModelo());
    System.out.println("COR.............: " + passeio.getCor());
    System.out.println("QTD. RODAS......: " + passeio.getQtdRodas());
    System.out.println("VEL. MAX........: " + passeio.getVelocMax());
    System.out.println("QTD. PASSAGEIROS: " + passeio.getQtdePassageiros());
    System.out.println("PISTÕES.........: " + passeio.getMotor().getQtdPistoes());
    System.out.println("POTÊNCIA........: " + passeio.getMotor().getPotencia());

    // calcula de km/h para m/h
    System.out.println("VEL. MAX É DE " + passeio.calcVel() + " M/H");
  }

  public static void registerCarga() {
    Carga carga = new Carga();

    // da classe veículo
    carga.setPlaca(leitura.entDados("\nDigite a placa: "));
    carga.setMarca(leitura.entDados("\nDigite a marca: "));
    carga.setModelo(leitura.entDados("\nDigite o modelo: "));
    carga.setCor(leitura.entDados("\nDigite a cor do veículo: "));
    carga.setQtdRodas(Integer.parseInt(leitura.entDados("\nDigite a quantidade de rodas: ")));
    carga.setVelocMax(Integer.parseInt(leitura.entDados("\nDigite a velocidade máxima: ")));

    // da classe passeio
    carga.setTara(Integer.parseInt(leitura.entDados("\nDigite a tara: ")));
    carga.setCargaMax(Integer.parseInt(leitura.entDados("\nDigite a carga máxima: ")));

    // da classe motor
    carga.getMotor().setQtdPistoes(Integer.parseInt(leitura.entDados("\nDigite a quantidade de pistões: ")));
    carga.getMotor().setPotencia(Integer.parseInt(leitura.entDados("\nDigite a potência do motor: ")));

    // impressões
    System.out.println("\nDADOS DO VEÍCULO DE CARGA:");
    System.out.println("PLACA.....: " + carga.getPlaca());
    System.out.println("MARCA.....: " + carga.getMarca());
    System.out.println("MODELO....: " + carga.getModelo());
    System.out.println("COR.......: " + carga.getCor());
    System.out.println("QTD. RODAS: " + carga.getQtdRodas());
    System.out.println("VEL. MAX..: " + carga.getVelocMax());
    System.out.println("TARA......: " + carga.getTara());
    System.out.println("CARGA MAX.: " + carga.getCargaMax());
    System.out.println("PISTÕES...: " + carga.getMotor().getQtdPistoes());
    System.out.println("POTÊNCIA..: " + carga.getMotor().getPotencia());

    // calcula de km/h para cm/h
    System.out.println("VEL. MAX É DE " + carga.calcVel() + " CM/H");
  }

  public static void main(String arg[]) {
    // menu de cadastro
    System.out.println("DIGITE O TIPO DE VEÍCULO QUE DESEJA CADASTRAR:");
    System.out.println("1 - DE PASSEIO");
    System.out.println("2 - DE CARGA");

    option = Integer.parseInt(leitura.entDados("\nOPCAO: "));

    switch (option) {
      case 1:
        registerPasseio();
        break;
      case 2:
        registerCarga();
        break;
      default:
        System.out.println("Erro na aplicação. Por favor contacte o suporte.");
        break;
    }

    System.out.println("\nFIM DO PROGRAMA");
  }
}
