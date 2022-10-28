// classe não concluída

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Read {

	public String entDados(String rotulo) {

		System.out.println(rotulo);
		String resp = "";

		InputStreamReader teclado = new InputStreamReader(System.in);
		BufferedReader buff = new BufferedReader(teclado);
		
		try {
			resp = buff.readLine();
		} catch (IOException exception) {
			System.out.println("\nERRO: RAM - JVM");
		} catch (NumberFormatException nfe) {
			System.out.println("\nDeve ser um número inteiro");
		} finally () {
			System.out.println("\nFINALLY foi executado!");
		}
    
		return resp;
	}
}