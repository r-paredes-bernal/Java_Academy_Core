package academy.core.session2.task;

public class Thor implements Human{
	public static void main(String args[]) {
		boolean isHuman = false;

		Thor t = new Thor();
		t.testIfHuman(isHuman);

		Human human = (a) -> {
			if(a) {
				System.out.println("Is Human");
			}else {
				System.out.println("Is not Human");
			}
		};

		human.testIfHuman(isHuman);
	}

	@Override
	public void testIfHuman(boolean isHuman) {
		System.out.println("traditional");
	}
}
