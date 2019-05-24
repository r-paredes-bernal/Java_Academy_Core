package academy.core.session6.streams.collectors;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class TestMap {

	public static void main(String[] args) {
		
	   /*
		List<String> people = Arrays.asList("Peter", "Ana", "Roger", "Peter");
		
		Map<String, Integer> map = people.stream()
				  .collect(Collectors.toMap(Function.identity(), String::length));
		
		System.out.println("toMap: " + map);
		*/
		
		
		Map<String, Integer> map1 = new HashMap<String, Integer>();
		
		map1.put("Peter", 5);
		map1.put("Peter", 5);
		
		System.out.println("toMap: " + map1);
		
	}

}
