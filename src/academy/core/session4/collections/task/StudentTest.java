package academy.core.session4.collections.task;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StudentTest {
	public static void main(String[] args) {
		List<Student> students = new ArrayList<Student>();

		students.add(new Student("Jose", "Ramos", "Tlalpan", 1));
		students.add(new Student("Brenda", "Alejo", "Iztacalco", 2));
		students.add(new Student("Jorge", "González", "Gustavo A. Madero", 1));
		students.add(new Student("Alan", "Ortiz", "Milpa Alta", 3));
		students.add(new Student("Paola", "Campos", "Venustiano Carranza", 2));
		students.add(new Student("Ingrid", "Rodriguez", "Xochimilco", 1));
		students.add(new Student("Laura", "Hernández", "Álvaro Obregón", 1));
		students.add(new Student("Alma", "Dimas", "Azcapotzalco", 2));
		students.add(new Student("Janet", "Cortés", "Cuauhtémoc", 3));
		students.add(new Student("Uriel", "Guerrero", "Tlalpan", 3));

		System.out.println("\nSorted by name ->");
		students.sort(NameComparator);
		StudentTest.print(students);

		System.out.println("\nSorted by location ->");
		students.sort(LocationComparator);
		StudentTest.print(students);

		System.out.println("\nSorted by level ->");
		Collections.sort(students);
		StudentTest.print(students);
	}

	private static void print(List<Student> students){
		Arrays.asList(students).forEach(student -> System.out.println(student));
	}

	private static Comparator<Student> NameComparator = new Comparator<Student>() {

        @Override
        public int compare(Student s1, Student s2) {
            return s1.getName().compareTo(s2.getName());
        }
    };

	private static Comparator<Student> LocationComparator = new Comparator<Student>() {

        @Override
        public int compare(Student s1, Student s2) {
            return s1.getLocation().compareTo(s2.getLocation());
        }
    };
}
