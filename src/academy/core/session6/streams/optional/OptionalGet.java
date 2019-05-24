package academy.core.session6.streams.optional;

import java.util.Optional;

public class OptionalGet {
	public static void main(String[] args) {
	    Optional<Integer> zipCode = Optional.of(10);
	    Integer zipCodeValid = zipCode.get();
	    System.out.println(zipCodeValid);
	}
}
