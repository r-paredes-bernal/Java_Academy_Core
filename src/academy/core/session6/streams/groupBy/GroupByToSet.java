package academy.core.session6.streams.groupBy;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * GroupingBy collector is used for grouping objects by some property and storing results in a Map instance.
 * 
 * @author r.paredes.bernal
 *
 */
public class GroupByToSet {
	public static void main(String[] args) {
		List<String> people = Arrays.asList("Peter", "Ana", "Roger");
		
		Map<Integer, Set<String>> peopleGrouped = people.stream()
				  .collect(
						  Collectors.groupingBy(
								  String::length, Collectors.toSet()));
	
		System.out.println(peopleGrouped);
		
	}
}
