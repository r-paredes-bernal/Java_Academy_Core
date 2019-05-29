package academy.core.session8.streams.summaryStatics;

import java.util.LongSummaryStatistics;
/**
 * Java 8 provides summary statistics classes for Double, Long, and 
 * Integer primitive data types. The java.util package contains three 
 * classes to summarizing data and return a summary statistics object 
 * to get count, min, max, sum, and average value.
 * 
 * DoubleSummaryStatistics
 * LongSummaryStatistics
 * IntSummaryStatistics
 * 
 * @author r.paredes.bernal
 *
 */
public class LongSummaryStatisticsExample {

	public static void main(String[] args) {
        LongSummaryStatistics stats = new LongSummaryStatistics();
        stats.accept(1);
        stats.accept(2);
        stats.accept(3);
        stats.accept(4);
        stats.accept(5);
 
        System.out.println("Count: " + stats.getCount());
        System.out.println("Sum: " + stats.getSum());
        System.out.println("Min: " + stats.getMin());
        System.out.println("Max: " + stats.getMax());
        System.out.println("Average: " + stats.getAverage());

	}

}
