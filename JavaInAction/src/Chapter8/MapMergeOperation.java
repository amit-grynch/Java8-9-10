package Chapter8;

import java.util.HashMap;
import java.util.Map;

public class MapMergeOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,String> family = Map.ofEntries(Map.entry("Teo", "Star Wars"), Map.entry("Cristina", "James Bond"),Map.entry("ashu", "null"));
		Map<String, String> friends = Map.ofEntries(Map.entry("Raphael", "Star Wars"), Map.entry("Cristina", "Matrix"),Map.entry("ashu", "DCH"));
		Map<String, String> everyone = new HashMap<String, String>(friends);
		family.forEach((key, value) -> everyone.merge(key, value, (x, y) -> x + "&" +y));
		System.out.println(everyone);

	}

}
