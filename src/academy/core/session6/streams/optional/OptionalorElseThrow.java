package academy.core.session6.streams.optional;

import java.util.Optional;

public class OptionalorElseThrow {

	public static void main(String[] args) {
	    String nullName = null;
	    String name = Optional.ofNullable(nullName).orElseThrow(
	      IllegalArgumentException::new);
	}

}
