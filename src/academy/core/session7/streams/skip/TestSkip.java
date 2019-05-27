package academy.core.session7.streams.skip;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * 
* 	The skip(long n) method of java.util.stream.Stream object 
*   returns a stream of remaining elements after skipping 
*   first n elements. This method will throw an exception 
*   if n is negative.
 * 
 * @author r.paredes.bernal
 *
 */
public class TestSkip {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

		Stream<Integer> stream = numbers.stream();
		System.out.println("-------- Integer Skipping ----------");
		// Skipt the first 2 elements
		stream.skip(2).forEach((a) -> {
			System.out.println(a);
		});
		
		List<String> strings = Arrays.asList("a", "b", "c", "d", "e", "f");

		Stream<String> streamSrings = strings.stream();
		System.out.println("------- String skipping ---------");
		streamSrings.skip(3).forEach((a) -> {
			System.out.println(a);
		});
	}
}
