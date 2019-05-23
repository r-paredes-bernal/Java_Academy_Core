package academy.core.session2.task;

public class IronMan implements CanRun, CanFly{
	public static void main(String[] args) {
		IronMan man = new IronMan();
		man.increaseSpeed(10);
		man.decreaseSpeed(5);
	}
}
