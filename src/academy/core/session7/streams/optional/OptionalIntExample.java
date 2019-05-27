package academy.core.session7.streams.optional;

import java.util.Optional;
import java.util.OptionalInt;

public class OptionalIntExample {
	public static void main(String[] args) {
		Optional<String> ops = Optional.of("1");
		//OptionalInt op = ops.map( Integer::parseInt );
		Optional<Integer> op = ops.map( Integer::parseInt );
		System.out.println(op);
	}
}
