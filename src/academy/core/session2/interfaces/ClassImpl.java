package academy.core.session2.interfaces;

public class ClassImpl implements InterfaceJava8 {

	@Override //anotacion para referirnos a determinados componentes(metodos) 
	public void classicMethod() {

	}
	

	
	public static void main(String[] args) {
		InterfaceJava8.staticMethod();
		
		
		// A statifc interface method cannot be used through inheritance
		 
		/* si agregamos la interface se podra implementar pero nola clase
		ClassWithInterface.staticMethod();
		ClassWithInterface cwf = new ClassWithInterface();
		cwf.staticMethod();
		*/ 
	}
}
