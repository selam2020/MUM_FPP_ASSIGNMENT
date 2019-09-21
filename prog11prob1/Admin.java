package prog11prob1;
import java.util.*;
public class Admin {
	public static HashMap<Key, Student> processStudents(List<Student> students) {
		//implement
		HashMap<Key, Student> table=new HashMap<Key, Student>();
		Key k=null;
		for (Student student : students) {
			k=new Key(student.getFirstName(),student.getLastName());
			table.put(k, student);
			
		}
		
		
		return table;
	}
}
