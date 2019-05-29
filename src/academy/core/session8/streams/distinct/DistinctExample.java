package academy.core.session8.streams.distinct;

import java.util.Arrays;
import java.util.List;
/**
 * Returns a stream consisting of the distinct elements of this stream.
 * 
 * @author r.paredes.bernal
 *
 */
public class DistinctExample {

	public static void main(String[] args) {
        List<String> list = Arrays.asList("AA","AA","BB");
        list.stream().distinct().forEach(System.out::println);
        
	}

}
