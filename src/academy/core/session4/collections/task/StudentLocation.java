package academy.core.session4.collections.task;

public class StudentLocation extends Student {

	public StudentLocation(String name, String lastName, String location, String level) {
		super(name, lastName, location, level);
	}

	@Override
	public int compareTo(Student o) {
		return this.getLocation().compareTo(o.getLocation());
	}
	
}
