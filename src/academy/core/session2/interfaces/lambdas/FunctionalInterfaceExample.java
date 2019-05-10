package academy.core.session2.interfaces.lambdas;

public class FunctionalInterfaceExample {

	public FunctionalInterfaceExample() {
	}

	public class InnerClass{

		public void anyMethod() {
			System.out.println("Llamada a metodo cualquiera");
		}
	}

	public static void main(String[] args) {
		// Traditional way
		FunctionalInterfaceClass fiec = new FunctionalInterfaceClass();
		fiec.fly();
		System.out.println(fiec.toString());

		// Lambda - Java 8
		Flying flying = () -> { System.out.println("Eagle"); };
		flying.fly();
		System.out.println("Lamda object : " + flying.toString());
		System.out.println("Lamda object : " + flying.hashCode());
		System.out.println("Lamda object : " + flying.getClass());
		
		FunctionalInterfaceExample example = new FunctionalInterfaceExample();
		FunctionalInterfaceExample.InnerClass innerClass =  example.new InnerClass(); 
		innerClass.anyMethod();
		System.out.println("Inner object : " + innerClass.toString());
		System.out.println("Inner object : " + innerClass.hashCode());
		System.out.println("Inner object : " + innerClass.getClass());
		
	}

	public static void myFly() {
		System.out.println("My fly");
	}



}

