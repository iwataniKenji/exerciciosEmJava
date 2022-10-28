//Nome: Kleverson Kenji Iwatani - RA: 2465205

package exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.NumberFormatException;

public class ExerciseG1 {

  public static void main(String args[]) {
    InputStreamReader reader = new InputStreamReader(System.in);
    BufferedReader buffReader = new BufferedReader(reader);

    String input = "";
    int firstValue = 0;
    int secondValue = 0;
    int option = 0;
    boolean proceed = true;
    
    // leitura do primeiro número
    while (proceed) {
      System.out.println("\nInsira o PRIMEIRO valor: ");
    
      try {
        input = buffReader.readLine();
        firstValue = Integer.parseInt(input);
        proceed = false;
      } catch(IOException inputException) {
        System.out.println("Erro de entrada");
      } catch(NumberFormatException numberException) {
        System.out.println("O valor deve ser um inteiro");
      }
    }
    proceed = true;

    // leitura do segundo número
    while (proceed) {
      System.out.println("\nInsira o SEGUNDO valor: ");
    
      try {
        input = buffReader.readLine();
        secondValue = Integer.parseInt(input);
        proceed = false;
      } catch(IOException inputException) {
        System.out.println("Erro de entrada");
      } catch(NumberFormatException numberException) {
        System.out.println("O valor deve ser um inteiro");
      }
    }
    proceed = true;

    // impressão do menu
    System.out.println("\nMenu de opções:");
    System.out.println("1: Somar");
    System.out.println("2: Multiplicar");
    System.out.println("3: Subtrair");
    System.out.println("5: Dividir");

    // lendo opção do usuário -> convertendo para inteiro
    while (proceed) {
      System.out.println("\nInsira o valor da opção desejada: ");

      try {
        input = buffReader.readLine();
        option = Integer.parseInt(input);
        proceed = false;
      } catch(IOException inputException) {
        System.out.println("Erro de entrada");
      } catch(NumberFormatException numberException) {
        System.out.println("O valor deve ser um inteiro");
      }
    }

    switch(option){
      case 1:
        System.out.println("O resultado da soma é "+ (firstValue + secondValue));
        break;
      case 2:
        System.out.println("O resultado da soma é "+ (firstValue * secondValue));
        break;
      case 3:
        System.out.println("O resultado da soma é "+ (firstValue - secondValue));
        break;
      case 5:
        System.out.println("O resultado da soma é "+ ((float) firstValue / (float) secondValue));
        break;
      default:
        System.out.println("Valor não existente dentre as opções");
    } 
  }
}
