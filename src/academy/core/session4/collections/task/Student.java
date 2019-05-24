package academy.core.session4.collections.task;

public class Student implements Comparable<Student>{
	private String name;
	private String lastName;
	private String location;
	private int level;

	public Student(String name, String lastName, String location, int level) {
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
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}

	@Override
	public String toString() {
		return "\n" + "name=" + this.name + ", lastName=" + this.lastName + ", location=" + this.location + ", level=" + this.level;
	}

	@Override
	public int compareTo(Student o) {
		return this.level - o.getLevel();
	}
}
