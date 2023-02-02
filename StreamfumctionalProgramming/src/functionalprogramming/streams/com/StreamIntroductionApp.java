package functionalprogramming.streams.com;

import java.util.List;

public class StreamIntroductionApp {

	public static void main(String[] args) {
		List<Integer> temp = List.of(16, 16, 17,18, 19, 19, 16);

		System.out.println(
				temp.stream().filter(temperature -> temperature > 16).filter(temperature -> temperature < 19).count());
	}

}
