package academy.core.session5.generics.diamond.wildcards;

import java.util.ArrayList;
import java.util.List;

public class WildCardQuestion {
	public static void main(String[] args) {
		List<? super Number> list1 = new ArrayList<>();
		List<? extends Number> list2 = new ArrayList<>();
		list1.add(1);
		list2.add( new Long(1));
		
		int num1 = list1.get(0);
		int num2 = list2.get(0);
		
	}
}
