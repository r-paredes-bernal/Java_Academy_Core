package academy.core.session6.streams.optional;

import java.util.Optional;
/**
 * How to create an optional of an integer and 
 * how to get the value of an Optional Object
 * @author Admin
 *
 */
public class OptionalGet {
	public static void main(String[] args) {
	    Optional<Integer> zipCode = Optional.of(10);
	    Integer zipCodeValid = zipCode.get();
	    System.out.println(zipCodeValid);
	}
}
