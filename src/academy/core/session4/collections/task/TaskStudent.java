package academy.core.session4.collections.task;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TaskStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> students = getAllStudent();
		List<Student> studentsLevel  =  getAllStudentLeve();
		List<Student> studentsLocation = getAllStudentLocation();
		
		Collections.sort(students);
		Collections.sort(studentsLevel);
		Collections.sort(studentsLocation);
		
		System.out.println("Orden por Nombre");
		students.forEach(n->System.out.println(n));
		
		System.out.println("\n\nOrden por level");
		studentsLevel.forEach(n->System.out.println(n));
		
		System.out.println("\n\nOrden por Location");
		studentsLocation.forEach(n->System.out.println(n));
	
		
	}
	
	
	public static List<Student> getAllStudent(){
		List<Student> students = new ArrayList<Student>();
		students.add(new Student("Juan", "Cruz", "Xochimilco", "Second"));
		students.add(new Student("Carlos", "Torres", "Azcapotzalco", "Second"));
		students.add(new Student("Mario", "Morales", "Benito Juarez", "Second"));
		students.add(new Student("Susana", "Juarez", "Miguel Hidalgo", "Second"));
		students.add(new Student("Juana", "Flores", "Tlalpan", "Second"));
		students.add(new Student("Ivan", "Jaimes", "Miguel Hidalgo", "Three"));
		students.add(new Student("Maria", "Guerro", "Iztacalco", "Three"));
		students.add(new Student("Ana", "Jimenez", "Álvaro Obregón", "Three"));
		students.add(new Student("Ana Maria", "Gonzales", "Xochimilco", "Three"));
		students.add(new Student("Rosa", "Martinez", "Xochimilco", "First"));
		students.add(new Student("Pedro", "Torres", "Álvaro Obregón", "First"));
		students.add(new Student("Miguel", "Cruz", "Tlalpan", "First"));
		students.add(new Student("Senen", "Cruz", "Iztacalco", "First"));
		
		return students;
	}
	
	public static List<Student> getAllStudentLeve(){
		List<Student> students = new ArrayList<Student>();
		students.add(new StudentLevel("Juan", "Cruz", "Xochimilco", "Second"));
		students.add(new StudentLevel("Carlos", "Torres", "Azcapotzalco", "Second"));
		students.add(new StudentLevel("Mario", "Morales", "Benito Juarez", "Second"));
		students.add(new StudentLevel("Susana", "Juarez", "Miguel Hidalgo", "Second"));
		students.add(new StudentLevel("Juana", "Flores", "Tlalpan", "Second"));
		students.add(new StudentLevel("Ivan", "Jaimes", "Miguel Hidalgo", "Three"));
		students.add(new StudentLevel("Maria", "Guerro", "Iztacalco", "Three"));
		students.add(new StudentLevel("Ana", "Jimenez", "Álvaro Obregón", "Three"));
		students.add(new StudentLevel("Ana Maria", "Gonzales", "Xochimilco", "Three"));
		students.add(new StudentLevel("Rosa", "Martinez", "Xochimilco", "First"));
		students.add(new StudentLevel("Pedro", "Torres", "Álvaro Obregón", "First"));
		students.add(new StudentLevel("Miguel", "Cruz", "Tlalpan", "First"));
		students.add(new StudentLevel("Senen", "Cruz", "Iztacalco", "First"));
		
		return students;
	}
	
	public static List<Student> getAllStudentLocation(){
		List<Student> students = new ArrayList<Student>();
		students.add(new StudentLocation("Juan", "Cruz", "Xochimilco", "Second"));
		students.add(new StudentLocation("Carlos", "Torres", "Azcapotzalco", "Second"));
		students.add(new StudentLocation("Mario", "Morales", "Benito Juarez", "Second"));
		students.add(new StudentLocation("Susana", "Juarez", "Miguel Hidalgo", "Second"));
		students.add(new StudentLocation("Juana", "Flores", "Tlalpan", "Second"));
		students.add(new StudentLocation("Ivan", "Jaimes", "Miguel Hidalgo", "Three"));
		students.add(new StudentLocation("Maria", "Guerro", "Iztacalco", "Three"));
		students.add(new StudentLocation("Ana", "Jimenez", "Álvaro Obregón", "Three"));
		students.add(new StudentLocation("Ana Maria", "Gonzales", "Xochimilco", "Three"));
		students.add(new StudentLocation("Rosa", "Martinez", "Xochimilco", "First"));
		students.add(new StudentLocation("Pedro", "Torres", "Álvaro Obregón", "First"));
		students.add(new StudentLocation("Miguel", "Cruz", "Tlalpan", "First"));
		students.add(new StudentLocation("Senen", "Cruz", "Iztacalco", "First"));
		
		return students;
	}

}
