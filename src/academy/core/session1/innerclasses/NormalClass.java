package academy.core.session1.innerclasses;

public class NormalClass {
	
	// Inner Class
	class InnerClass {

	}
	
	// Static Inner Class
	static class StaticInnerClass {
		
	}
	
	// What?... See references.txt
	{
		System.out.println("'I´m an empty/object block");
	}
	
	// Omg... See references.txt
	static {
		System.out.println("I'm a static block...");		
	}
	
	
	void normalMethod() {
		class InnerMethodClass {
			// Is this possible? Why you didn't tell me this before?
		}
	}
	
}
