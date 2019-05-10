package academy.core.session2.task;

public interface CanRun {
	public boolean isRunning();
	default void increaseSpeed(int speed) {
	}
	
	default void decreaseSpeed(int speed) {
		
	}
}
