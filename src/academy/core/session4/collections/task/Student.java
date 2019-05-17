package academy.core.session4.collections.task;

public class Student implements Comparable<Student>{
	
	private String name;
	private String lastName;
	private String location;
	private String level;
	
	public Student(String name, String lastName, String location, String level) {
		super();
		this.name = name;
		this.lastName = lastName;
		this.location = location;
		this.level = level;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getLevel() {
		return level;
	}
	public void setLevel(String level) {
		this.level = level;
	}
	
	@Override
	public int compareTo(Student o) {
		
		return this.name.compareTo(o.getName());
		
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", lastName=" + lastName + ", location=" + location + ", level=" + level + "]";
	}
	
	
	public static int compareByLocation(Student lhs, Student rhs) {
		return lhs.getLocation().compareTo(rhs.getLocation());
	}
	
}
