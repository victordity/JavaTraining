import java.util.HashMap;
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
		
		// Criar Map de consumidor e produtos
		Map<Consumidor, Produto> map = new HashMap<>();
		map.put(consumidor, produto1);
		map.put(consumidor2, produto3);
		
		for(Map.Entry<Consumidor, Produto> entry : map.entrySet()) {
			System.out.println("O comprador: " + entry.getKey().getNome() + " Comprou: " + entry.getValue().getNome()); 
		}
	}

}
