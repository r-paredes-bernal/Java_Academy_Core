package academy.core.session2.task;

import academy.core.session2.task.CanRun;
import academy.core.session2.task.CanFly;

public class CaptainAmerica implements CanRun, CanFly{

	public static void main(String[] args) {
	 CanFly.increaseHeight(10);
	}

	@Override
	public boolean isFlying() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isRunning() {
		// TODO Auto-generated method stub
		return false;
	}

}
