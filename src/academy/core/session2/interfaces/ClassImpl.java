package academy.core.session2.interfaces;

public class ClassImpl implements InterfaceJava8 {

	@Override
	public void classicMethod() {

	}
	
	
	@Override
	public void implementedMethod() {
		System.out.println("Metodo default de la interfaz sobre escrito");
	}

	
	public static void main(String[] args) {
		InterfaceJava8.staticMethod();
	
		// A statifc interface method cannot be used through inheritance
		/*
		ClassImpl.staticMethod();
		ClassImpl cwf = new ClassImpl();
		cwf.staticMethod();
		*/ 
		ClassImpl cwf = new ClassImpl();
		cwf.implementedMethod();
		
	}
}
