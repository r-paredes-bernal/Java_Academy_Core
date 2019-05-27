package academy.core.session7.streams.limit;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * 
 * The limit(long n) method of java.util.stream.Stream 
 * object returns a reduced stream of first n elements. 
 * This method will throw an exception if n is negative.
 * 
 * @author r.paredes.bernal
 *
 */
public class TestLimit {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6); 
				
		Stream<Integer> stream1 = numbers.stream();
		System.out.println("-------- Limit of Integers----------");
		// Limit until the 3 element
		stream1.limit(3).forEach((a) -> {
			System.out.println(a);
		});
		
		List<String> strings = Arrays.asList("a", "b", "c", "d", "e", "f");
		
		Stream<String> streamSrings = strings.stream();
		System.out.println("-------- Limit of Strings----------");
		streamSrings.limit(3).forEach((a) -> {
			System.out.println(a);
		});
	}
}
