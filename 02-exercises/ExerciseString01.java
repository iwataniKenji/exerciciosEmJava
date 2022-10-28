//Nome: Kleverson Kenji Iwatani - RA: 2465205

package exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExerciseString01 {
  public static void main(String args[]) {
    InputStreamReader reader = new InputStreamReader(System.in);
    BufferedReader buffReader = new BufferedReader(reader);

    String phrase = "";
    String input = "";
    char letter = 'a';
    int count = 0;

    try {
      // input de dados
      System.out.println("\nInsira uma frase: ");
      phrase = buffReader.readLine();

      System.out.println("\nInsira uma letra: ");
      input = buffReader.readLine(); 
      letter = input.charAt(0);

      // contagem de aparições
      for(int i = 0; i < phrase.length(); i++) {
        char temp = Character.toLowerCase(phrase.charAt(i));
        if (temp == letter) {
          count++;
        }
      }
      
      System.out.println("Número de vezes que a letra escolhida apareceu na frase: " +count);
      
    } catch(IOException inputException) {
      System.out.println("Erro de entrada");
    }
  }
}