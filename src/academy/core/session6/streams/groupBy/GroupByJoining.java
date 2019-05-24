package academy.core.session6.streams.groupBy;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupByJoining {
	
	// What is the output?
	public static void main(String[] args) {
		List<String> names = Arrays.asList("a","b","cd","ef","ghi","jk");
		
		Map<Integer, String> data = names.stream()
			.collect(
					Collectors.groupingBy(
							String::length, Collectors.joining()));
		
		System.out.println(data);
	}
}
