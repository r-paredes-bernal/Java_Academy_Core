package academy.core.session8.streams.sorted;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import academy.core.session5.generics.comparator.Employee;

/**
 * Returns a stream consisting of the elements of this stream in natural sorted order.
 * We can also pass our comparator object to get custom sorting. 
 * 
 * Stateful intermediate operation
 * @author r.paredes.bernal
 *
 */
public class SortedExample {
	public static void main(String[] args) {
        List<String> list = Arrays.asList("Z","B","A");
        
        list.stream().
        	sorted().
        		forEach(s->System.out.println(s));
        
        list.stream().
        	sorted( SortedExample.inverseComparator ).
        		forEach(s->System.out.println(s));
	}
	
	
    public static Comparator<String> inverseComparator = new Comparator<String>() {

        @Override
        public int compare(String s1, String s2) {
            return s2.compareTo(s1);
        }
    };
}
