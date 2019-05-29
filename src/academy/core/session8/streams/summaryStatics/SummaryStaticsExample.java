package academy.core.session8.streams.summaryStatics;

import java.util.DoubleSummaryStatistics;
import java.util.IntSummaryStatistics;
import java.util.LongSummaryStatistics;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import static java.lang.System.out;

public class SummaryStaticsExample {

	public static void main(String[] args) {
		testDoubleSummaryStatics();		
		
		//testLongSummaryStatics();		
		
		//testIntSummaryStatics();	
	}

	private static void testIntSummaryStatics() {
		IntSummaryStatistics istats = IntStream.of(51,22,50,27,35).
				collect(IntSummaryStatistics::new, IntSummaryStatistics::accept, 
						IntSummaryStatistics::combine);
		
		out.println("Max:"+istats.getMax()+", Min:"+istats.getMin());
		out.println("Count:"+istats.getCount()+", Sum:"+istats.getSum());
		out.println("Average:"+istats.getAverage());
	}

	private static void testLongSummaryStatics() {
		LongSummaryStatistics lstats = LongStream.of(51l,23l,53l,23l,35l).
				collect(LongSummaryStatistics::new, LongSummaryStatistics::accept, 
						LongSummaryStatistics::combine);
		
		out.println("Max:"+lstats.getMax()+", Min:"+lstats.getMin());
		out.println("Count:"+lstats.getCount()+", Sum:"+lstats.getSum());
		out.println("Average:"+lstats.getAverage());
	}

	private static void testDoubleSummaryStatics() {
		DoubleSummaryStatistics dstats = DoubleStream.of(5.33d,2.34d,5.32d,2.31d,3.51d).
				collect(DoubleSummaryStatistics::new, DoubleSummaryStatistics::accept, 
						DoubleSummaryStatistics::combine);
		
		out.println("Max:"+dstats.getMax()+", Min:"+dstats.getMin());
		out.println("Count:"+dstats.getCount()+", Sum:"+dstats.getSum());
		out.println("Average:"+dstats.getAverage());
	}

}
