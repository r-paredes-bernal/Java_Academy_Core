package academy.core.session4.generics.fruits;

public class Fruit implements Comparable<Fruit>{
	private String name = "";
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int compareTo(Fruit fruit) {
		return this.name.compareTo(fruit.name);
	}
}
