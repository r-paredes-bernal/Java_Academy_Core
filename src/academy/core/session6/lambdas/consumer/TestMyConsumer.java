package academy.core.session6.lambdas.consumer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;


public class TestMyConsumer {
	public static void main(String[] args) {
		//creating sample Collection
		List<Integer> myList = new ArrayList<Integer>();
		for(int i=0; i<10; i++) myList.add(i);
		
		//traversing through forEach method of Iterable with anonymous class
		/*
		myList.forEach(new Consumer<Integer>() {

			public void accept(Integer t) {
				System.out.println("Value in consumer:"+t);
			}

		});
		*/
		
		//traversing with Consumer interface implementation
		MyConsumer action = new MyConsumer();
		myList.forEach(action);
		
	}
}
