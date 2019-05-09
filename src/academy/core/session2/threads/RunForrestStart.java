package academy.core.session2.threads;

public class RunForrestStart {
	public static void main(String args[]) {
		Thread run = new Thread ( new RunForrest() );
		run.start();
	} 
}
