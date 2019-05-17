package academy.core.session4.collections.task;

public class StudentLevel extends Student {

	public StudentLevel(String name, String lastName, String location, String level) {
		super(name, lastName, location, level);
	}

	@Override
	public int compareTo(Student o) {
		return this.getLevel().compareTo(o.getLevel());
	}
	
}
