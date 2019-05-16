package academy.core.session4.collections;

import java.util.HashMap;
import java.util.Map;

import academy.core.session4.generics.computers.Computer;
import academy.core.session4.generics.computers.Printable;

// Create and use ArrayList, TreeSet, TreeMap, and ArrayDeque objects
public class ComputerStoreMap implements Printable{
	Map<Integer, String> inventory;
	
	ComputerStoreMap(Map<Integer, String> inventory){	
		this.inventory = inventory;
	}
	
	
	@Override
	public void printInventory() {
		//  lambda operator -> body
		this.inventory.forEach((key, value) -> System.out.println(key + " " + value));	
	}
	
	
	public static void main(String[] args) {
		Map<Integer, String> computers = new HashMap<>();
		Computer c1 = new Computer(2009, "white");
		Computer c2 = new Computer(2009, "black");
		Computer c3 = new Computer(2014, "grey");
		
		computers.put(c1.getId(), c1.getDesc());
		computers.put(c2.getId(), c2.getDesc());
		computers.put(c3.getId(), c3.getDesc());
		
		ComputerStoreMap store = new ComputerStoreMap(computers);
		store.printInventory();
		
	}
}
	
	
