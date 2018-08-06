import java.util.Collection;
import java.util.HashSet;
import java.util.Scanner;

public class CadastradorProdutos {

	public static void main(String[] args) {
		Collection produtos = new HashSet<>();

		System.out.println("### Cadastro de Produtos ###\n");

		try (Scanner entrada = new Scanner(System.in)) {
			String continuar = "s";
			while ("s".equalsIgnoreCase(continuar)) {
				System.out.print("SKU: ");
				String sku = entrada.nextLine();

				System.out.print("Nome: ");
				String nome = entrada.nextLine();

				Produto produto = new Produto(sku, nome);
				if (produtos.contains(produto)) {
					System.err.println("\nEsse produto jã foi adicionado. Utilize outro SKU");
				} else {
					produtos.add(produto);
					System.out.println("Produto adicionado.");
				}

				System.out.print("Deseja adicionar mais algum produto? (s/n)");

				continuar = entrada.nextLine();
			}
		}
		produtos.forEach(System.out::println);

		System.out.println("Fim");
	}

}
