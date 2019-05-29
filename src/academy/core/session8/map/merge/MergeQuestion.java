package academy.core.session8.map.merge;

import java.util.HashMap;
import java.util.Map;

/**
 * default V	merge(K key, V value, BiFunction<? super V,? super V,? extends V> remappingFunction)
 * 
 * If the specified key is not already associated with a value or is associated with null, 
 * associates it with the given non-null value. Otherwise, replaces the associated 
 * value with the results of the given remapping function, or removes if the result is null. 
 * This method may be of use when combining multiple mapped values for a key. For example, 
 * to either create or append a String msg to a value mapping:
 * @author r.paredes.bernal
 *
 */
public class MergeQuestion {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		
		map.put("Item1",1);
		map.put("Item2",2);
		map.put("Item3",3);
		map.put("Item4",4);
		
		map.merge("Item4", 4, (k,v)-> k > 0 ? null: 0);
		//map.merge("Item4", 4, (k,v)-> k > null);
		
		System.out.println(map);
	}
}
