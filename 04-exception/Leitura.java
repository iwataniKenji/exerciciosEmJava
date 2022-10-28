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
		} catch (IOException casa) {
			System.out.println("\nERRO: RAM - JVM");
		}
    
		return resp;
	}
}