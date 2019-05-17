package academy.core.session4.generics.fruits;

public class TestBasket {
	public static void main(String args[]) {
		Basket basket = new Basket();
		Apple apple = new Apple();
		Orange orange = new Orange();
		Pear pear = new Pear();
		Onion onion = new Onion();
		
		basket.add(apple);
		basket.add(pear);
		basket.add(orange);
		
		basket.add(onion);
		
		basket.print();
		
	}
}
