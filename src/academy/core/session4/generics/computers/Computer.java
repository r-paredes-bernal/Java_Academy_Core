package academy.core.session4.generics.computers;

// Use java.util.Comparator and java.lang.Comparable interfaces
public class Computer implements Comparable<Computer>{
	private int id;
	private String desc;
	
	public Computer(int id, String desc){
		this.id = id;
		this.desc = desc;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}
	
	@Override
	public String toString() {
		return "id: " + id + ", descprition: " + desc; 
	}

	@Override
	public int compareTo(Computer comp) {
		return this.desc.compareTo(comp.desc);
	}


}
