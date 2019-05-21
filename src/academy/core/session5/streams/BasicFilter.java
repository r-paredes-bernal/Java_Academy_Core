package academy.core.session5.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// Collections Streams and Filters
public class BasicFilter {
	public static void main(String[] args) {
        List<String> lines = Arrays.asList("spring", "hibernate", "oracle");

        List<String> result = lines.stream()                
                .filter(line -> !line.equals("oracle"))     
                .collect(Collectors.toList());              

        result.forEach(System.out::println);                
	}
}
