package academy.core.session2.task;

public interface CanRun {
	public boolean isRunning = false;

	public default void increaseSpeed(int speed) {}
	public default void decreaseSpeed(int speed) {}
}
