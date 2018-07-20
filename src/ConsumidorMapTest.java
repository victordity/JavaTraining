import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ConsumidorMapTest {

	public static void main(String[] args) {
		// Consumidores
		Consumidor consumidor = new Consumidor("Dity", "111987");
		Consumidor consumidor2 = new Consumidor("Bot", "555555");
		
		// Produtos
		Produto produto1 = new Produto("001", "Abacate", 2.50);
		Produto produto2 = new Produto("002", "Beringela", 5);
		Produto produto3 = new Produto("003", "Cenoura", 4.30);
		
		
		// Exercicio 1 - Criar Mapa com um valor para cada chave
		// Criar Map de consumidor e produtos
		Map<Consumidor, Produto> map = new HashMap<>();
		map.put(consumidor, produto1);
		map.put(consumidor2, produto3);
		
		for(Map.Entry<Consumidor, Produto> entry : map.entrySet()) {
			System.out.println("O comprador: " + entry.getKey().getNome() + " Comprou: " + entry.getValue().getNome()); 
		}
		// Exercicio 2 - Criar Mapa com varioso valores para cada chave
		// Criar Lista de produtos
		List<Produto> produtosC1 = new ArrayList<>();
		produtosC1.add(produto1);
		produtosC1.add(produto2);
		
		List<Produto> produtosC2 = new ArrayList<>();
		produtosC2.add(produto2);
		produtosC2.add(produto3);
		Map<Consumidor, List<Produto>> map2 = new HashMap<>();
		map2.put(consumidor, produtosC1);
		map2.put(consumidor2, produtosC2);
		
		for (Map.Entry<Consumidor, List<Produto>> entry : map2.entrySet()) {
			System.out.print("Consumidor: " + entry.getKey().getNome() + " comprou:"); 
			for (Produto produto : entry.getValue() ) {
				System.out.print(" " + produto.getNome());
			}
			System.out.println("");
		}
	}

}
