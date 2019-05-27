package academy.core.session7.streams.supplier;

import java.util.function.Supplier;

import academy.core.session5.generics.comparator.Employee;

/*
*	It represents a function which does not take in any argument 
*	but produces a value of type T.
*	Hence this functional interface takes in only one generic parameter:
*
* 	T: denotes the type of the result
* 
*	@FunctionalInterface
*	public interface Supplier<T> {
*	
*	    T get();
*	}
 */
public class EmployeeSupplier {

	public static void main(String[] args) {

        Supplier < Employee > supplier = () -> {
        	return new Employee(123, "Richard", 30, 450);
        };
        
        Employee employee = supplier.get();
        System.out.println("Person Detail:\n" + employee.getId() + ", " + employee.getName()
        + ", " + employee.getSalary());

	}

}
