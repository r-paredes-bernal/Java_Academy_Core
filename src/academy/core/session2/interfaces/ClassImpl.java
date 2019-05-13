package academy.core.session2.interfaces;

public class ClassImpl implements InterfaceJava8 {

	@Override
	public void classicMethod() {

	}
	

	public static void main(String[] args) {
		InterfaceJava8.staticMethod();
		
		
		// A static interface method cannot be used through inheritance
		/*
		ClassImpl.staticMethod();
		ClassImpl cwf = new ClassImpl();
		cwf.staticMethod();
		 */
	}
}
