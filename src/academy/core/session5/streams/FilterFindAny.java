package academy.core.session5.streams;

import java.util.Arrays;
import java.util.List;

import academy.core.session5.generics.comparator.Employee;

public class FilterFindAny {
	public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(new Employee(10, "Mikey", 25, 10000),
		new Employee(20, "Arun", 29, 20000),
		new Employee(5, "Lisa", 35, 5000),
		new Employee(1, "Pankaj", 32, 50000));
        
        Employee result = employees.stream()                
                .filter(employee ->  employee.getName().equals("Mikey"))     
                .findAny()
                .orElse(null);            

        System.out.println(result);            
	}
}
