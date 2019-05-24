package academy.core.session6.streams.peek;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import academy.core.session6.streams.Color;

class PeekExample {
	public static void main(String[] args) {
		Color[] colors = {Color.BLUE,Color.RED, Color.YELLOW};
		
        //Arrays.stream
        Stream<Color> colorStream = Arrays.stream(colors);
        
        List<Color> result = colorStream // Source
        .filter(color -> color.toString() == Color.BLUE.toString() ) // Intermediate Operation
        .peek( b -> System.out.println(b.toString() )) // Intermediate Operation
        .collect(Collectors.toList()); // Terminal Operation
        
        System.out.println(result);
	}
}
