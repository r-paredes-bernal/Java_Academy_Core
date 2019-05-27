package academy.core.session7.streams.supplier;

import java.util.function.Supplier;

import academy.core.session5.generics.comparator.Employee;

public class SimpleSupplier {

	public static void main(String[] args) {

        // This function returns a random value. 
        Supplier<Double> randomValue = () -> Math.random(); 
  
        // Print the random value using get() 
        System.out.println(randomValue.get()); 

	}

}
