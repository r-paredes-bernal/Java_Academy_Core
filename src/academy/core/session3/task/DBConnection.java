package academy.core.session3.task;

public class DBConnection {
	private static final DBConnection instance = new DBConnection();

	private DBConnection() {}

	public static DBConnection getDBConnection(){
		return instance;
	}
}
