package academy.core.session6.streams.collectors;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CollectorsExample {
	public static void main(String[] args) {
		//List<String> people = Arrays.asList("Peter", "Ana", "Roger");
		
		List<String> people = Arrays.asList("Peter", "Ana", "Roger", "Richard");
		
		// ToList collector can be used for collecting all Stream elements into a List instance
		List<String> list = people.stream()
				  .collect(Collectors.toList());
		
		System.out.println("toList: " + list); 
		
		// ToSet collector can be used for collecting all Stream elements into a Set instance
		Set<String> set = people.stream().collect(Collectors.toSet());
	
		System.out.println("toSet: " + set); 
		
		// ToMap collector can be used to collect Stream elements into a Map instance.
		Map<String, Integer> map = people.stream()
				  .collect(Collectors.toMap(Function.identity(), String::length));
		
		System.out.println("toMap: " + map); 
		
		// Joining collector can be used for joining Stream<String> elements.
		String joining = people.stream()
				  .collect(Collectors.joining("|")); // Add a custom separator |
		
		System.out.println("joining: " + joining);
		
		// Counting is a simple collector that allows simply counting of all Stream elements.
		Long counting = people.stream()
				  .collect(Collectors.counting());
		
		System.out.println("counting: " + counting);
		
	}
}
