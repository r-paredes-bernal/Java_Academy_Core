package academy.core.session4.collections;



import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import academy.core.session4.generics.computers.Computer;
import academy.core.session4.generics.computers.Printable;

// Declare, instantiate, initialize and use a one-dimensional array
// Create and use ArrayList, TreeSet, TreeMap, and ArrayDeque objects
public class ComputerStoreList implements Printable{
	Computer[] inventory;
	
	ComputerStoreList(Computer[] inventory){	
		this.inventory = inventory;
	}
	
	@Override
	public void printInventory() {
		// from array to list
		List<Computer> list =Arrays.asList(inventory);
		Collections.sort(list);
		list.forEach( n -> System.out.println(n) );		
	}
	
	
	/*
	private void printInventory(Computer[] inventory) {
		Arrays.asList(inventory).forEach( n -> System.out.println(n) );		
	}
	*/
	
	// Overloaded not inherited
	private void printInventory(Computer c1, Computer c2, Computer c3) {
		//Arrays.asList(c1,c2,c3).forEach( n -> System.out.println(n) );		
		Arrays.asList(c1, c2, c3).forEach(System.out::println);
	}
	
	public static void main(String[] args) {
		Computer c1 = new Computer(2015, "white");
		Computer c2 = new Computer(2009, "black");
		Computer c3 = new Computer(2014, "grey");
		
		Computer[] inventory = new Computer[] {c1,c2,c3};
		
		ComputerStoreList store = new ComputerStoreList(inventory);
		
		store.printInventory();
		// store.printInventory(inventory);
		//store.printInventory(c1,c2,c3);
		
	}
	
}
