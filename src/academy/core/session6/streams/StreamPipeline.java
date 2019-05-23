package academy.core.session6.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class StreamPipeline {
	public static void main(String[] args) {
		String[] colors = {"RED","YELLOW", "GREEN"};
		
        //Arrays.stream
        Stream<String> colorStream = Arrays.stream(colors);
        
        List<String> result = colorStream // Source
        .filter(color -> color.equals("GREEN")) // Intermediate Operation
        .collect(Collectors.toList()); // Terminal Operation
        
        System.out.println(result);
	}
}
