package streamexample.com;

import java.util.List;
import java.util.stream.Collectors;

public class StreamExampleApp {

	public static void main(String[] args) {
		List<Integer> number = List.of(1, 2, 3, 4, 5);
		List<Integer> output = number.stream().map(num -> num * num).filter(num -> num >= 3)
				.collect(Collectors.toList());

		System.out.println(output);
	}

}
