//Nome: Kleverson Kenji Iwatani - RA: 2465205

package exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.NumberFormatException;

public class exerciseArray02 {

  public static void main(String args[]) {
    InputStreamReader reader = new InputStreamReader(System.in);
    BufferedReader buffReader = new BufferedReader(reader);
    
    int arrayRow = 2;
    int arrayColumn = 2;
    int numberArray[][] = new int[arrayRow][arrayColumn];
    String input = "";
    boolean proceed = true;

    // usuário entra com os valores  
    for (int i = 0; i < arrayRow; i++) {
      for (int j = 0; j < arrayColumn; j++) {
        System.out.println("\nInsira um valor para o vetor: ");
      
        while (proceed) {
          try {
            input = buffReader.readLine();
            numberArray[i][j] = Integer.parseInt(input);
            proceed = false;
          } catch(IOException inputException) {
            System.out.println("Erro de entrada");
          } catch(NumberFormatException numberException) {
            System.out.println("O valor deve ser um inteiro");
          }
        }
        proceed = true;
      }
    }
    
    // retorna matriz em ordem inversa
    System.out.println("Valores do vetor em ordem inversa:");
    for (int i = arrayRow - 1; i >= 0; i--) {
      for (int j = arrayRow - 1; j >= 0; j--) {
        System.out.print(+numberArray[i][j]);
      }
      System.out.println();
    }
  }
}