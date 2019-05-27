package academy.core.session7.streams.optional;

import java.util.Optional;

public class CreateOptional {

	public static void main(String[] args) {
		String str = null;
		// How to create an Optional with the reference str
		
		// As Optional is a final the constructor is private and inaccesible
		Optional op1 = new Optional(str);
		
		// The method Of doesn't exist, but the method of exists 
		Optional op2 = Optional.Of(str);
		
		// Option.empty is a method withour arguments
		Optional op3 = Optional.empty(str);
		
		Optional op4 = Optional.ofNullable(str);
		
		
	}

}
