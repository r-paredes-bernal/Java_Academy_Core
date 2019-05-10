package academy.core.session1.task;

public interface CanRun {
	public boolean isRunning = false;

	public default void increaseSpeed(int speed) {}
	public default void decreaseSpeed(int speed) {}
}
