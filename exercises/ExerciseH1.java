//Nome: Kleverson Kenji Iwatani - RA: 2465205

package exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.NumberFormatException;

public class ExerciseH1 {
  public static void main(String args[]) {
    InputStreamReader reader = new InputStreamReader(System.in);
    BufferedReader buffReader = new BufferedReader(reader);

    String input = "";
    int value = 0;
    boolean proceed = true;
    
    // leitura do primeiro número
    while (proceed) {
      System.out.println("\nInsira um número inteiro: ");
    
      try {
        input = buffReader.readLine();
        value = Integer.parseInt(input);
        proceed = false;
      } catch(IOException inputException) {
        System.out.println("Erro de entrada");
      } catch(NumberFormatException numberException) {
        System.out.println("O valor deve ser um inteiro");
      }
    }

    // informa se é par ou ímpar
    if(value % 2 == 0) {
      System.out.println("Valor é PAR");
    } else {
      System.out.println("Valor é ÍMPAR");
    }
  }
}
