package academy.core.session6.streams.partioningBy;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/*
 * PartitioningBy is a specialized case of groupingBy that accepts a Predicate instance and collects Stream 
 * elements into a Map instance that stores Boolean values as keys and collections as value
 */
public class PartioningByExample {
	public static void main(String[] args) {
		List<String> people = Arrays.asList("Peter", "Ana", "Roger");
		
		Map<Boolean, List<String>> result2 = people.stream()
				  .collect(Collectors.partitioningBy(s -> s.length() > 3));
		
		System.out.println(result2);
	}
}

