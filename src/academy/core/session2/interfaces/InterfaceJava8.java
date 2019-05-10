package academy.core.session2.interfaces;

public interface InterfaceJava8 {
	// Constant - implicitly public, static and final
	String title = "Avengers"; // have to be initialized
	
	// abstract method, implicitly public
	void classicMethod();
	
	// Somebody explain me this! metodo abstracto
	default void implementedMethod() {
		
	}
	
	//modificadir donde se requiere implementación
	static void staticMethod() {	
		// static method needs a body
		System.out.println(" InterfaceJava8");

	}
	
}
