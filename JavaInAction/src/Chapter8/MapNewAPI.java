package Chapter8;

import static java.util.Map.*;

import java.util.HashMap;
import java.util.Map;

public class MapNewAPI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String, Integer> nameAgeMap = Map.ofEntries(entry("Amit", 10), entry("Kumar", 20), entry("Sharma", 40));
		Map<String, Integer> keyValueMap = Map.of("Java", 100, "Rest", 200, "Thread", 300);
		Map<String, String> valueKeyMap = new HashMap<String, String>();
		valueKeyMap.put("India", "Delhi");
		// Using Old Iterator for traversing of Map
		for (Map.Entry<String, Integer> mapEntry : nameAgeMap.entrySet()) {
			System.out.println("Key is :" + mapEntry.getKey() + "  " + "Value is :" + mapEntry.getValue());
		}
		// Using New forEach introduced in Java8
		keyValueMap.forEach((name, age) -> System.out.println(" Name is :" + name + " " + "Value is " + age));

		// Sorting the Map using Key
		nameAgeMap.entrySet().stream().sorted(Entry.comparingByKey()).forEachOrdered(System.out::println);

		// Sorting the Map using Value
		keyValueMap.entrySet().stream().sorted(Entry.comparingByValue()).forEachOrdered(System.out::println);

		// getting Default Value if Key is not persent
		System.out.println(nameAgeMap.getOrDefault("Sachin", 100));

		// computeIfAbsent
		valueKeyMap.computeIfAbsent("USA", MapNewAPI::returnValue);
		valueKeyMap.forEach((key, value) -> System.out.println(" Key :" + key + " " + "Value :" + value));

		// Replace the Value
		valueKeyMap.replace("USA", "DC");
		valueKeyMap.forEach((key, value) -> System.out.println(" Key :" + key + " " + "Value :" + value));
	}

	public static String returnValue(String key) {
		return "NewYork";
	}
}
