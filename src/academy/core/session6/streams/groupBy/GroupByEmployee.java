package academy.core.session6.streams.groupBy;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import academy.core.session5.generics.comparator.Employee;

public class GroupByEmployee {
	
	// What is the output?
	public static void main(String[] args) {
	   List<Employee> employees = Arrays.asList(new Employee(10, "Mikey", 25, 10000),
			new Employee(20, "Arun", 29, 20000),
			new Employee(5, "Lisa", 35, 5000),
			new Employee(1, "Mikey", 32, 80000));
	        
		
		Map<Integer, Long> data = employees.stream()
			.collect(
					Collectors.groupingBy(
							Employee::getAge , Collectors.counting()));
		
		System.out.println(data);
	}
}
