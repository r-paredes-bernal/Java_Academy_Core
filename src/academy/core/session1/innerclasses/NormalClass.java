package academy.core.session1.innerclasses;

public class NormalClass { // Top Level Class
	
	// Inner Class
	class InnerClass {

	}
	
	// Static Inner Class
	static class StaticInnerClass {
		static int staticVar = 1;
		int noStaticVar = 2;
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
	
	// Inner interface
	interface innerInterface {
		int car = 1; // Implicit final and static scope
		class clasImpStatic {
			
		}
	}
	
	// Static inner interface 
	static interface staticInnerInterface {

	}
}
