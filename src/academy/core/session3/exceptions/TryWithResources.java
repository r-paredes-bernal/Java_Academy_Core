package academy.core.session3.exceptions;

// Develop code that uses try-with-resources statements, including using classes that implement the AutoCloseable interface
public class TryWithResources {

	public static void main(String args[]) {
		TryWithResources.closeWithResources();
	}
	
	// Traditional way of closing resources
	public static void tryWihFinally() throws Exception  {
		Connector connector = new Connector();
		try {
		    connector.openConnection();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			connector.close();
		}
		
	}	
	
	// try with resources - Java 8
	public static void closeWithResources() {
		try (Connector connector = new Connector()) {
		    connector.openConnection();
		} catch (Exception e) {
			e.printStackTrace();
		} 
		
	}
	
	
}	
