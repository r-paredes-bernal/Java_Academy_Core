package academy.core.session3.singleton;

public class DBConnection {

	private static final Connection DB_CONNECTION = new Connection();
	
	private static final DBConnection.Connection2 DB_CONNECTION2 = new DBConnection.Connection2();
	
	private DBConnection() {
		
	}

	public static Connection getDbConnection() {
		return DB_CONNECTION;
	}
	
	public static DBConnection.Connection2 getDbConnection2() {
		return DB_CONNECTION2;
	}
	
	
	static class Connection2{
		
		private Connection2() {
			
		}
	}
	
	
}
