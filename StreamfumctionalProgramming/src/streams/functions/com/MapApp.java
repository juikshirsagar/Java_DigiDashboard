package streams.functions.com;

import java.util.List;
import java.util.stream.Collectors;

public class MapApp {

	public static void main(String[] args) {
		List<String> names = List.of("aladdin", "clara", "Cesar", "polly");
		List<String> namesCapital = names.stream().map( name -> name.substring(0,1).toUpperCase() + name.substring(1)).collect(Collectors.toList());
		System.out.println("Capitalized Name : ");
		System.out.println(namesCapital);

	}

}
