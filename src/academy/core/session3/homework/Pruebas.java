package academy.core.session3.homework;

import academy.core.session3.exceptions.Connector;

public class Pruebas {

	public static void main(String[] args) {
		try (FilesUtils files = new FilesUtils("C:\\prueba.txt"); Connector connector = new Connector()) {
			files.openFile();
			connector.openConnection();
		} catch (Exception e) {
			e.printStackTrace();
		} 

	}

}
