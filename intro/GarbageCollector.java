package intro;

public class GarbageCollector{
		
	int value = 0;
	String phrase = "";

  //classLoader
	public static void main(String arg[]){

		GarbageCollector object01 = new GarbageCollector(); 
		GarbageCollector object02 = new GarbageCollector();

		object01.entDados(10, "Jesus");
		object02.entDados(1, "Elohin");

		object01.value = 10;
		object01.mostra();

		object01.mostra();
		object02.mostra();

		// chama o garbage collector
		System.gc(); 
	}

	public void mostra(){
		System.out.println("\nO Valor de value eh: "+value);
		System.out.println("O Valor da phrase eh: "+ phrase);	
	}

	public void entDados(int a, String b){
		value = a;
		phrase = b;
	}
}