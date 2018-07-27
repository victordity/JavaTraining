public class Switch {

	public static void main(String[] args) {
		int dia = 5;
		// char, int, byte, short, enum e String
		switch (dia) {
		case 1:
			System.out.println("Segunda");
			break;
		case 2:
			System.out.println("Terça");
			break;
		case 3:
			System.out.println("Quarta");
			break;
		case 4:
			System.out.println("Quinta");
			break;
		case 5:
			System.out.println("Sexta");
			break;
		case 6:
			System.out.println("Sabado");
			break;
		case 7:
			System.out.println("Domingo");
			break;
		}

		// Para interromper o case quando entrar
		// devemos adicionar o break.

		String sexo = "Y";
		switch (sexo) {
		case "F":
			System.out.println("It's a Girl");
			break;
		case "M":
			System.out.println("It's a Boy");
			break;
		default:
			System.out.println("Invalid Option");
			break;
		}

	}

}
