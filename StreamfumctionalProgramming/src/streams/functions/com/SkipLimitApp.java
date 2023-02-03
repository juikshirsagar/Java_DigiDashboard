package streams.functions.com;

import java.util.stream.Stream;

public class SkipLimitApp {

	public static void main(String[] args) {
		Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10).filter(i -> i % 2 == 0).skip(2)
				.forEach(i -> System.out.print(i + " "));
		System.out.println("------");
		// limit()
		Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10).filter(i -> i % 2 == 0).limit(2)
				.forEach(i -> System.out.print(i + " "));
	}

}
