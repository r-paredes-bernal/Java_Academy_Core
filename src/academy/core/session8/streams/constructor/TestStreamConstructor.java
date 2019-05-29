package academy.core.session8.streams.constructor;

import java.util.Arrays;
import java.util.stream.DoubleStream;

/**
 * Returns a sequential DoubleStream with the specified range of the specified array as its source.
 * 
 * @author r.paredes.bernal
 *
 */
public class TestStreamConstructor {
	public static void main(String[] args) {
		double[] arr = {1.1,2.2,3.3,4.4,5.5};
		DoubleStream dbs = Arrays.stream(arr,3,5);
		System.out.println(dbs.sum());
	}
}
