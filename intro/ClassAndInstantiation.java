package intro;

public class ClassAndInstantiation{

	int value = 0;

	public static void main(String arg[]){

		ClassAndInstantiation object01;
		ClassAndInstantiation object02;

    // INSTANCIAÇÃO -> construtor informa tamanho da variável
		object01 = new ClassAndInstantiation(); 
		object02 = new ClassAndInstantiation();

		object01.value = 133;
		object01.mostra();

		object02.value = 232;
		object02.mostra();

		System.out.println("\n\nEndereço de objeto 01: "+object01);
		System.out.println("\n\nEndereço do objeto 02: "+object02);
	}

	public void mostra(){
		System.out.println("\n\n\tO Valor de 'value' eh: "+value);	
	}
}