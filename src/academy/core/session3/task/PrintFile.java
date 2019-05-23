package academy.core.session3.task;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class PrintFile implements AutoCloseable{
	FileReader reader;
	BufferedReader buffer;

	public void print(String path) {
		System.out.println("---------------------------------------> Openning file");

		try {
			this.reader = new FileReader(path);
			this.buffer = new BufferedReader(this.reader);
			
			String line = buffer.readLine();
			while(line != null) {
				System.out.println(line);
				line = buffer.readLine();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void close() throws Exception {
		System.out.println("---------------------------------------> File closed");
		buffer.close();
		reader.close();
	}
}
