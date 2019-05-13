package academy.core.session2.interfaces.lambdas;

public class FunctionalInterfaceExample {

	public FunctionalInterfaceExample() {
	}

	public static void main(String[] args) {
		// Traditional way
		/*
		FunctionalInterfaceClass fiec = new FunctionalInterfaceClass();
		fiec.fly();
		*/
		
		// Lambda - Java 8
		Flying flying = () -> { System.out.println("Eagle"); };
		flying.fly();
		
	}

}

