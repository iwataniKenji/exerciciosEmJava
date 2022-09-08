// view -> interação direta com usuário

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Leitura{

	public String entDados(String rotulo){

		System.out.println(rotulo);
		String resp = "";

		InputStreamReader teclado = new InputStreamReader(System.in); // system.in -> entrada do sistema -> teclado
		BufferedReader buff = new BufferedReader(teclado);  // buff -> informação entrada no teclado de forma organizada

		try{
			resp = buff.readLine();
		}
		catch(IOException casa){
			System.out.println("\nERRO: RAM - JVM");
		}
		return resp;
	}
}