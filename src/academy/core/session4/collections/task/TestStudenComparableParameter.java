package academy.core.session4.collections.task;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestStudenComparableParameter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> students = TaskStudent.getAllStudent();

		
		Collections.sort(students, new Comparator<Student>() {
			 @Override
		        public int compare(Student h1, Student h2) {
		            return h1.getName().compareTo(h2.getName());
		        }
			
		});
		
		System.out.println("Orden por Nombre");
		students.forEach(n->System.out.println(n));
		
		
		System.out.println("\n\nOrden por level");
		students.sort((student1, student2) -> student1.getLevel().compareTo(student2.getLevel()));
		students.forEach(n->System.out.println(n));
		
		
		System.out.println("\n\nOrden por Location");
		students.sort(Student::compareByLocation);
		students.forEach(n->System.out.println(n));
	}
	
}
