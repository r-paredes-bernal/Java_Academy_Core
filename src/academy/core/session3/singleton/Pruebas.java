package academy.core.session3.singleton;

import academy.core.session3.singleton.DBConnection.Connection2;

public class Pruebas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection2 connection2 = DBConnection.getDbConnection2();
		//Connection2 connection22 = new DBConnection.Connection2();
		
		Cookie cookie = CookieFactory.getInstanceCookie();
	}

}
