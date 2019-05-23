package academy.core.session3.task;

import academy.core.session3.exceptions.Connector;

public class TestPrintFile {
	public static void main(String... args) {
		try(Connector connector = new Connector();
			PrintFile print = new PrintFile(); ){
			connector.openConnection();
			print.print("files\\session3.txt");
		} catch (Exception e) {
			e.printStackTrace();
		}
	} 
}
