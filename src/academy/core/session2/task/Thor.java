package academy.core.session2.task;

import academy.core.session2.task.Human;

public class Thor implements Human {

	public static void main(String[] args) {

		Thor thor = new Thor();
		thor.testIfHuman();

		Human human = () -> {
			System.out.println("Is not a human");
		};
		human.testIfHuman();
	}

	@Override
	public void testIfHuman() {
		System.out.println("Is not a human");

	}

}
