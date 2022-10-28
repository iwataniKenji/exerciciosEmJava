package intro;

public class CastingAndWrapper{

	public static void main(String arg[]){
		// inteiro para string
		int value = 142;
		String stringConverted = Integer.toString(value); 
		System.out.println("\nString formatada: "+ stringConverted);

		// string para float
		String u = "1.76f";
		float floatConverted = Float.parseFloat(u);
		System.out.println("\nFloat formatado: "+ floatConverted);
		
		// pega dois valores do input do main -> inteiro
		System.out.println("\nSOMA: "+ (Integer.parseInt(arg[0])+Integer.parseInt(arg[1])));

		// CASTING
		float floatValue = 1.45f;
		int integerValue = (int) floatValue;
		System.out.println("\nfloatValue: "+ floatValue);
		System.out.println("\nintegerValue: "+ integerValue);

		String frase1 = arg[0];
		String frase2 = arg[1];
 
		System.out.println("\nFRASE1: "+ frase1);
		System.out.println("\nFRASE2: "+ frase2);
	}
}