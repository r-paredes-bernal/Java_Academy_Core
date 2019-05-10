package academy.core.session2.task;

import academy.core.session2.task.CanRun;
import academy.core.session2.task.CanFly;

public class IronMan implements  CanRun, CanFly{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

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
