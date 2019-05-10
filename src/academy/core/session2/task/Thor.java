package academy.core.session2.task;

public class Thor implements Human {

	public static void main(String[] args) {
		Thor thor = new Thor();
		thor.testIfHuman();
		
		Human human = () -> {System.out.println("Thor isn't a human");};
		human.testIfHuman();
	}

	@Override
	public void testIfHuman() {
		
		System.out.println("Thor is a good");
	}
	
}
