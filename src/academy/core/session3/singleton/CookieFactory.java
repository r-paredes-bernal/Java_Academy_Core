package academy.core.session3.singleton;

public class CookieFactory {

	private static Cookie COOKIE;
	
	public static Cookie getInstanceCookie() {
		if(COOKIE==null)
			COOKIE = new Cookie();
		
		return COOKIE;
	}
	
}
