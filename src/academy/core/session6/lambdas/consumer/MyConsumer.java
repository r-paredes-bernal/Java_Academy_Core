package academy.core.session6.lambdas.consumer;

import java.util.function.Consumer;

//Consumer implementation that can be reused
class MyConsumer implements Consumer<Integer>{

	public void accept(Integer t) {
		System.out.println("My consumer value::"+t);
	}


}
