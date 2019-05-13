package academy.core.session3.singleton;

public class ClassicSingleton {
	private static final ClassicSingleton instance = new ClassicSingleton();
	
	private ClassicSingleton() {	
	}
	
	public static ClassicSingleton getInstance() {
		return instance;
	}
	
}
