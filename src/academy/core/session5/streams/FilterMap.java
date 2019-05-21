package academy.core.session5.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterMap {
	public static void main(String[] args) {
    	List<Integer> num = Arrays.asList(1,2,3,4,5,6);
        List<Integer> squares = num.stream()
        		.map(n -> n * 2)
        		.collect(Collectors.toList());
        System.out.println(squares);        
	}
}
