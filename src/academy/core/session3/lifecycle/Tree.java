package academy.core.session3.lifecycle;

// Explain an Object's Lifecycle (creation, "dereference by reassignment" and garbage collection)
public class Tree {
	
	static {
		System.out.println("The Tree.class is loaded");
	}
	
	Tree(){
		System.out.println(" A new Tree instance is created");
	}
	
	void callGarbageCollector() {
		System.out.println("Calling GC");
		java.lang.System.gc();
	}
	
	public static void main(String args[]) {
		Tree tree = new Tree();
		System.out.println("The tree is living: " + tree.toString());
		tree.callGarbageCollector();
	}
}
