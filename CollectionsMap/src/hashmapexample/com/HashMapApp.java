package hashmapexample.com;

import java.util.HashMap;
import java.util.Map;

public class HashMapApp {

	public static void main(String[] args) {
		Map<String, String> capitals = new HashMap<>();

		capitals.put("England", "London");
		capitals.put("India", "New Delhi");
		capitals.put("Russia", "Moscow");
		capitals.put("England", "Oslo");
		System.out.println(capitals);
		
		System.out.println("The capital of England is: " + capitals.get("England"));
		capitals.remove("England", "Oslo");
		System.out.println("The capital of England is: " + capitals.get("England"));

		if (capitals.containsValue("Moscow")) {
			System.out.println("Russia is in list");
		}

		capitals.put(null, "The City is in not list");
		String userInput = "Denmark";
		if (capitals.containsKey(userInput)) {
			System.out.println(capitals.get(userInput));
		} else {
			System.out.println(capitals.get(null));
		}
		System.out.println(capitals.getOrDefault(userInput, "The city is not on the list."));
		
		//replace 
		capitals.replace("India", "Mumbai");
		System.out.println("The replaced capital of India is: " + capitals.get("India"));
		
		//clear
		capitals.clear();
		System.out.println(capitals.size() + " capitals can be found in the hashmap");
		for (String capital : capitals.values()) {
			System.out.println("-" + capital);
		}

	}

}
