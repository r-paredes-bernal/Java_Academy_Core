package academy.core.session3.homework;

public class FilesUtils implements AutoCloseable {

	
	private String path;
	
	
	
	public FilesUtils(String path) {
		super();
		this.path = path;
	}


	public void openFile() {
		System.out.println("Archivo abierto : " +  path);
	}
	
	
	@Override
	public void close() throws Exception {
		System.out.println("Archivo cerrado : " +  path);

	}

}
