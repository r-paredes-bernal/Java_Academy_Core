package academy.core.session4.collections;

import java.util.TreeSet;

import academy.core.session4.generics.computers.Computer;
import academy.core.session4.generics.computers.Printable;

// Create and use ArrayList, TreeSet, TreeMap, and ArrayDeque objects
public class ComputerStoreTreeSet implements Printable{
	TreeSet<Computer> inventory;
	
	ComputerStoreTreeSet(TreeSet<Computer> inventory){	
		this.inventory = inventory;
	}
	
	@Override
	public void printInventory() {
		this.inventory.forEach(n -> System.out.println(n));	
	}
	
	public void printInventoryTraditionalForEach() {
		// all collections have toArray method
		Object[] s1 = inventory.toArray();
		
		// Output?
		for (Object s: s1) {
			System.out.println("Computer: " + s);
		}		
	}
	
	public static void main(String[] args) {
		Computer c1 = new Computer(2015, "white");
		Computer c2 = new Computer(2009, "black");
		Computer c3 = new Computer(2014, "black");
		
		TreeSet<Computer> computers = new TreeSet<Computer>();
		computers.add(c1);
		computers.add(c2);
		computers.add(c3);
		
		
		ComputerStoreTreeSet store = new ComputerStoreTreeSet(computers);
		store.printInventory();
	}
}
	
	
