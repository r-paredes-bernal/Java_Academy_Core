package academy.core.session3.task;

public class CookieFactory {
	private static CookieFactory instance;
	
	private CookieFactory() {}
	
	public static CookieFactory getInstance() {
		if ( instance == null ) {
			instance = new CookieFactory();
		} 
		return instance;
	}
}
