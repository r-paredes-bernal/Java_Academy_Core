package academy.core.session5.task;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import academy.core.session5.generics.comparator.Employee;

public class FilterFindAll {
	public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(new Employee(10, "Mikey", 25, 10000),
		new Employee(20, "Arun", 29, 20000),
		new Employee(5, "Lisa", 35, 5000),
		new Employee(1, "Mikey", 32, 80000));
        
        List<Employee> result = employees.stream()                
                .filter(employee ->  employee.getSalary() > 3_000)
                .filter(employee ->  employee.getAge() == 25 || employee.getAge() == 29)
                .collect(Collectors.toList());

        System.out.println(result);            
	}
}
