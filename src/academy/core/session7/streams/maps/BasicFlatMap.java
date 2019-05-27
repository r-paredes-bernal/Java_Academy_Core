package academy.core.session7.streams.maps;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
/**
 * <R> Stream<R>	flatMap(Function<? super T,? extends Stream<? extends R>> mapper)
 * 
 * Returns a stream consisting of the results of replacing each element of 
 * this stream with the contents of a mapped stream produced by applying
 *  the provided mapping function to each element.
 * @author Admin
 *
 */
public class BasicFlatMap {
	public static void main(String[] args) {
        // Creating a List of Strings 
        List<String> list = Arrays.asList("5.6", "7.4", "4", 
                                          "1", "2.3"); 
  
        // Using Stream flatMap(Function mapper) 
        Stream<String> stream = list.stream().flatMap(num -> Stream.of(num));
        
        stream.forEach(System.out::println); 
	}
}
