import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Hash {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		map.put("Elado", "Errado");
		map.put("Alombada", "Arrombada");
		map.put("Alanha", "Aranha");
		// Pegar a chave do map
		for (String key : map.keySet()) {
			System.out.println(key);
		}
		// Pegar a Chave e o Value do map
		for (Map.Entry<String, String> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
		// Manter a ordem de inserção
		Map<String, String> record = new LinkedHashMap<>();
		record.put("Elado", "Errado");
		record.put("Alombada", "Arrombada");
		record.put("Alanha", "Aranha");
		record.put("Otalio", "Otario");
		record.put("Polco", "Porco");
		record.put("Palaguai", "Paraguai");
		for(Map.Entry<String, String> dict : record.entrySet()) {
			System.out.println(dict.getKey() + " "  + dict.getValue());
		}

	}

}
