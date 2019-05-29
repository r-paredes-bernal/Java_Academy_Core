package academy.core.session8.streams.count;

import java.util.stream.Stream;
/**
 * Terminal operation, reduction type.
 * Returns the count of elements in this stream
 * 
 * @author r.paredes.bernal
 *
 */
public class CountExample {
	public static void main(String[] args) {

		// count return long
		long count = Stream.of("a","b","c").count();
		
		System.out.println(count);
	}
}
