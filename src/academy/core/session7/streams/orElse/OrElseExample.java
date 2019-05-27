package academy.core.session7.streams.orElse;

import java.util.Optional;
import java.util.stream.Stream;

public class OrElseExample {
	public static void main(String[] args) {
		Stream<String> stream = Stream.of("A","AC","ABC","ABCD","AB");
		
		String out = stream.
						filter(s -> s.length() > 2). // find strings with length greater than 2 
						filter(s -> s.indexOf("C") > -1 ). // find strings with a letter C
							findAny().
								orElse("None");
		
		// The result is nondeterministic 
		// so it could be ABC or ABCD
		System.out.println(out);
		
		Optional<String> out1 = stream.
				filter(s -> s.length() > 2). // find strings with length greater than 2 
				filter(s -> s.indexOf("C") > -1 ). // find strings with a letter C
					findAny(); // findAny returns a generic Optional
		
		System.out.println(out);
	}
}
