//Nome: Kleverson Kenji Iwatani - RA: 2465205

package exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.NumberFormatException;

public class exerciseArray01 {

  public static void main(String args[]) {
    InputStreamReader reader = new InputStreamReader(System.in);
    BufferedReader buffReader = new BufferedReader(reader);
    
    int arraySize = 5;
    int numberArray[] = new int[arraySize];
    String input = "";
    boolean proceed = true;

    // usuário entra com os valores  
    for (int i = 0; i < arraySize; i++) {
      System.out.println("\nInsira um valor para o vetor: ");
    
      while (proceed) {
        try {
          input = buffReader.readLine();
          numberArray[i] = Integer.parseInt(input);
          proceed = false;
        } catch(IOException inputException) {
          System.out.println("Erro de entrada");
        } catch(NumberFormatException numberException) {
          System.out.println("O valor deve ser um inteiro");
        }
      }
      proceed = true;
    }
    
    // retorna inverso
    System.out.println("Valores do vetor em ordem inversa:");
     for (int i = arraySize - 1; i >= 0; i--) {
      System.out.println(+numberArray[i]);
    }
  }
}