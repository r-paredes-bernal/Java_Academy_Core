package academy.core.session1.innerclasses;

public class InnerClassExamples { // Top Level Class
	
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
	
	// Local Inner Class, a class in a method
	void normalMethod() {
		class LocalInnerClass {
			// Is this possible? Why nobody didn't tell me that before?
		}
	}
	
	// Local Inner Class and access modifieres
	public void publicMethod() {
		class LocalInnerClass {
		}
		
		private class privateInnerClass {
		}
		
		public class publicteInnerClass {
		}
		
		protected class protectedInnerClass {
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
