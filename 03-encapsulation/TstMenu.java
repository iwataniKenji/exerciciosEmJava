
public class TstMenu{
	
	public static void main(String arg[]) {

        Leitura leitura = new Leitura();

        boolean vai = true;
        int val1 = 0, val2 = 0, opcao = 0;

        // leitura de dados
        val1 = Integer.parseInt(leitura.entDados("\nInforme o PRIMEIRO valor: "));
        val2 = Integer.parseInt(leitura.entDados("\nInforme o SEGUNDO valor: "));

        while(vai) {
            System.out.println("\n========= MENU =========");
            System.out.println("\n1) SOMAR");
            System.out.println("\n2) SUBTRAIR");
            System.out.println("\n3) DIVIDIR");
            System.out.println("\n4) MULTIPLICAR");

            opcao = Integer.parseInt(leitura.entDados("\nESCOLHA UMA OPCAO"));

            switch(opcao) {
                case 1: {
                    System.out.println("Escolheu SOMAR");
                    System.out.println("A soma é: "+somar(val1, val2));
                    System.exit(0);
                    break;
                }
                case 2: {
                    System.out.println("Escolheu SUBTRAIR");
                    System.exit(0);
                    break;
                }
                case 3: {
                    System.out.println("Escolheu DIVIDIR");
                    System.exit(0);
                    break;
                }
                case 4: {
                    System.out.println("Escolheu MULTIPLICAR");
                    System.exit(0);
                    break;
                }
                case 5: {
                    System.out.println("Escolheu SAIR");
                    System.exit(0);
                    break;
                }
                default: {
                    System.out.println("Escolha deve estar entre 1 e 5");
                }
                
            }
        }
	} 

    public static int somar(int a, int b) {
        return a + b;
    }
}