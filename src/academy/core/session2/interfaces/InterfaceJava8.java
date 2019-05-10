package academy.core.session2.interfaces;

public interface InterfaceJava8 {
	// Constant - implicitly public, static and final
	String title = "Avengers"; // have to be initialized
	
	// abstract method, implicitly public
	void classicMethod();
	
	// Somebody explain me this!
	default void implementedMethod() {
		System.out.println("Metodo default de la interfaz");
	}
	
	static void staticMethod() {	
		// static method needs a body
		System.out.println(" InterfaceJava8");

	}
	
}
