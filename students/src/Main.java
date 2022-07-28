import model.Teacher;
import model.Student;
import model.Address;
import model.Group;

public class Main {

	public static void main(String[] args) {
		
		Address addressStudent = new Address ("Minskk", "Karvata", "23", "1");
		Student student1 = new Student ("Alex", "Petrov", 23, addressStudent);
		
		Address addressTeacher = new Address ("Minsk", "Kirova", "15", "3");
		Teacher teacher1 = new Teacher ("Anna", "Ivanova", 25, addressTeacher);
		
		Group group = new Group ("First", "1", teacher1, student1); 
		
		System.out.println (student1);
		System.out.println (teacher1); 
		System.out.println(group);
	}

}
