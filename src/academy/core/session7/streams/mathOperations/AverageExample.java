package academy.core.session7.streams.mathOperations;

import java.util.OptionalDouble;
import java.util.stream.DoubleStream;

public class AverageExample {
	public static void main(String[] args) {
        DoubleStream doubleStream = DoubleStream.of(1.2, 1.3, 1.4, 1.5, 1.6);
        OptionalDouble d = doubleStream.average();
        
        System.out.println(d);
    }
}
