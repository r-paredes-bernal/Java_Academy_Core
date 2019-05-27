package academy.core.session7.streams.maps;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * the Stream operations (filter, sum, distinct…) and collectors do not support: 
 * 
 * Stream<String[]>	
 * Stream<Set<String>>	
 * Stream<List<String>>	
 * Stream<List<Object>>
 * 
 * So, we need flatMap() to do the following conversion :
 * Stream<String[]>		-> flatMap ->	Stream<String>
 * Stream<Set<String>>	-> flatMap ->	Stream<String>
 * Stream<List<String>>	-> flatMap ->	Stream<String>
 * Stream<List<Object>>	-> flatMap ->	Stream<Object>
 * 
 * @author r.paredes.bernal
 *
 */
public class WhyFlatMap {

	public static void main(String[] args) {
		WhyFlatMap.emptyResult();
		WhyFlatMap.streamOfArray();
	}
	
	public static void emptyResult(){
        String[][] data = new String[][]{{"a", "b"}, {"c", "d"}, {"e", "f"}};

        //Stream<String[]>
        Stream<String[]> temp = Arrays.stream(data);

        //filter a stream of string[], and return a string[]?
        Stream<String[]> stream = temp.filter(x -> "a".equals(x.toString()));
        System.out.println("Empty Result - Begin");
        stream.forEach(System.out::println);
        System.out.println("Empty Result - End");
	}
	
	public static void streamOfArray(){
        String[][] data = new String[][]{{"a", "b"}, {"c", "d"}, {"e", "f"}};

        //Stream<String[]>
        Stream<String[]> temp = Arrays.stream(data);

        //Stream<String>, GOOD!
        Stream<String> stringStream = temp.flatMap(x -> Arrays.stream(x));

        Stream<String> stream = stringStream.filter(x -> "a".equals(x.toString()));
        System.out.println("Mapping - Begin");
        stream.forEach(System.out::println);	
        System.out.println("Mapping - End");
	}
}
