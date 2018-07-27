
public class BreakContinue {

	public static void main(String[] args) {
		// Dado um valor de um carro, descubra quantas vezes ele pode ser parcelado
        // Porém as parcelas não podem ser menores do que 1000
		
		double valorTotal = 30000;
		for (int parcela = 1; parcela <= valorTotal; parcela++) {
			double valorParcela = valorTotal/parcela;
			if(valorParcela >= 1000) {
				System.out.printf("Parcela: %d R$: %.2f %n", parcela, valorParcela);
			}
			else {
				System.out.println("Saindo do laço");
				// O break sai do bloco de repetição
                // O Continue avança para o proximo passo do loop
				break;
			}
			
		}

	}

}
