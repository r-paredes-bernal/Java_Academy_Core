package academy.core.session3.exceptions;

public class Connector implements AutoCloseable {

	@Override
	public void close() throws Exception {
		System.out.println("Connection closed");
	}

	public void openConnection() {
		System.out.println("Openning connection");		
	}

}
