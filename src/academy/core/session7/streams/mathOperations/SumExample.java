package academy.core.session7.streams.mathOperations;

import java.util.Arrays;
import java.util.List;

public class SumExample {

	public static void main(String[] args) {

        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        int sum = integers.stream().mapToInt(Integer::intValue).sum();
        System.out.println("Total : " + sum);

	}

}
