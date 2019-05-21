package academy.core.session5.generics.diamond;

import java.util.ArrayList;
import java.util.Collections;

import academy.core.session4.generics.fruits.task.Fruit;
import academy.core.session4.generics.fruits.task.Printable;

public class BasketOf<T extends Fruit> implements Printable {
	ArrayList<T> list = new ArrayList<T>();
	
	public void add(T t) {
		list.add(t);
	}
	
	@Override
	public void print() {
		if ( list.isEmpty() ) {
			System.out.println("The basket is empty");			
		} else {
			System.out.println("The basket contains: ");
			Collections.sort(list);
			for(T fruit: list) {
				System.out.println( fruit.getName() );
			}
		}
	}
}
