
public class Conditional {

	public static void main(String[] args) {
		int contador = 1;
		// Loop while
		while(contador < 10) {
			System.out.println(contador++);
		}
		// Loop do While - Entra no Loop ao menos 1 vez
		do {
			System.out.println("Dentro do do while");
		}while(contador < 5);
		
		// Loop repetição
		for(int i = 0; i< 5; i++) {
			System.out.println(i);
		}
 
	}

}
