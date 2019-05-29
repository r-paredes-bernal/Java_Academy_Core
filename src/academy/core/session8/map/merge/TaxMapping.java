package academy.core.session8.map.merge;

import java.util.HashMap;
import java.util.Map;

/**
 * default V	merge(K key, V value, BiFunction<? super V,? super V,? extends V> remappingFunction)
 * 
 * Java 8 adds a new merge() function into the java.util.Map interface.
 * 
 * If the Key is not present , Add an element with the new Key and Value.
 * 
 * @author r.paredes.bernal
 *
 */
public class TaxMapping {
	public static void main(String[] args) {
		Map<String, Double> map = new HashMap<>();
		
		map.put("Apple", 9.5);
		map.put("Orange", 15.0); // change value for null and test it 
		map.put("Pear", 10.0);
		
		Double merged = map.merge("Orange", 7.0, (v1,v2)-> v1 * 1.16);
		
		
		System.out.println(merged);
		System.out.println(map);
	}
}
