package academy.core.session2.task;

public class CaptainAmerica implements CanFly, CanRun{

	public static void main(String[] args) {

		CanFly.increaseHeight(2);
		
	}

	@Override
	public void decreseSpeed(int down) {
		System.out.println("Captain Velocidad disminuida en: " +  down);
		
	}


}
