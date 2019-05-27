package academy.core.session7.streams.maps;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
 * In Java 8, stream().map() lets you convert an object to something else
 */
public class BasicMap {
	public static void main(String[] args) {
		List<String> alpha = Arrays.asList("a", "b", "c", "d");
		//List<String> collect = alpha.stream().map(String::toUpperCase).collect(Collectors.toList());
		List<String> collect = alpha.stream().map(s -> s.toUpperCase()).collect(Collectors.toList());
		
		System.out.println(collect); // [A, B, C, D]
	}
}
