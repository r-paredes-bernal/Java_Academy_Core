package academy.core.session2.interfaces.defaultmodifier;

/**
 * Duplicate default methods named method with the parameters 
 * () and () are inherited from the types Interface2 and Interface1
 * 
 * @author r.paredes.bernal
 *
 */
public class Class1 implements Interface1, Interface2 {
	
	// If a subclass overrides the duplicate method, the code will compile
	// If not the code will not.
	public int method() {
		return 3;
	}
	
	public static void main(String[] args) {
		Class1 class1 = new Class1();
		System.out.println(class1.method());
	}
}
