package academy.core.session3.singleton;

/*
 * Create and use singleton classes and immutable classes
 */
public class LazySingleton {
	
	private static LazySingleton instance;
	
	private LazySingleton() {		
	}
	
	public static LazySingleton getInstance() {
		if ( instance == null ) {
			instance = new LazySingleton();
		} 
		return instance;
	}
	
}
