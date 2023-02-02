package functionalprogramming.streams.com;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamCreationApp {

	public static void main(String[] args) {
		List<String> musicStyle = List.of("Rock", "Pop", "Trance", "Classical music");
		musicStyle.stream().sorted().forEach(musicStyles -> System.out.println(musicStyles + "Extra"));

		System.out.println(Stream.of("Rock", "Trance", "Blues", "Pop", "Classical Music").collect(Collectors.toList()));

		System.out.println(
				"The number of elements in array : " + Arrays.stream(new double[] { 4.6, 6.7, 8.2, 3.4, 76.0 }).count());
	}

}
