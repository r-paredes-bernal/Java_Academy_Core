package academy.core.session2.interfaces;

public class ClassImpl implements InterfaceJava8 {

	@Override
	public void classicMethod() {

	}
	

	
	public static void main(String[] args) {
		InterfaceJava8.staticMethod();
		
		
		// A statifc interface method cannot be used through inheritance
		 
		/*
		ClassWithInterface.staticMethod();
		ClassWithInterface cwf = new ClassWithInterface();
		cwf.staticMethod();
		*/ 
	}
}
