package academy.core.session5.generics.diamond;

import java.util.ArrayList;
import java.util.List;

import academy.core.session4.generics.fruits.task.Apple;
import academy.core.session4.generics.fruits.task.Onion;

//Develop code that uses diamond with generic declarations
public class DiamondFruits {

	public static void main(String[] args) {
		List<String> cars = new ArrayList<>();
		
		BasketOf<Apple> baskeOfApples = new BasketOf<>();
		Apple apple = new Apple();
		Onion onion = new Onion();
		
		baskeOfApples.add(apple);
		
		//baskeOfApples.add(onion);
		
		
	}
	

}
