package academy.core.session2.task;

public interface CanRun {

	boolean isRunning=false;
	
	public default void increaseSpeed(int up) {
		System.out.println("Velocidad aumentada en mas : " +  up);
	}
	
	 void decreseSpeed(int down) ;
	
	 
}
