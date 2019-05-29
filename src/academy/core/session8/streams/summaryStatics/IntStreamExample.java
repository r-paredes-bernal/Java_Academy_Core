package academy.core.session8.streams.summaryStatics;

import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;

public class IntStreamExample {
	public static void main(String[] args) {
		IntStream.range(1, 5).forEach(System.out::println);
		
		IntStream.rangeClosed(10, 15).forEach(System.out::println);
		
		IntStream stream = IntStream.of(10,20,30,40);
		IntSummaryStatistics statics = stream.summaryStatistics();
		// getCount return a Long value
		statics.accept(statics.getCount());	
		
	}
}
