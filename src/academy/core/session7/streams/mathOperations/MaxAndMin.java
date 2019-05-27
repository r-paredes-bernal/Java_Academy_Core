package academy.core.session7.streams.mathOperations;

import java.util.Comparator;
import java.util.stream.Stream;

public class MaxAndMin {
	public static void main(String[] args) {
		// Get Min or Max String/Char
		String maxChar = Stream.of("H", "T", "D", "I", "J")
		                        .max(Comparator.comparing(String::valueOf))
		                        .get();
		 
		String minChar = Stream.of("H", "T", "D", "I", "J")
		                        .min(Comparator.comparing(String::valueOf))
		                        .get();
		 
		System.out.println("maxChar = " + maxChar);
		System.out.println("minChar = " + minChar);		
		
	}
}
