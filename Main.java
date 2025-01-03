package logical_sections.day6;

public class Main {

	public static void main(String[] args) {
		Institute ins = new Institute(10);
		Student s1 = new Student(101, "Alice", 987654321, "Computer Science", 'F');
		Student s2 = new Student(102, "Bob", 876543210, "Mechanical Engineering", 'M');
		Student s3 = new Student(103, "Charlie", 765432109, "Civil Engineering", 'M');
		Student s4 = new Student(104, "Diana", 654321098, "Electrical Engineering", 'F');
		Student s5 = new Student(105, "Ethan", 543210987, "Information Technology", 'M');
		Student s6 = new Student(106, "Fiona", 432109876, "Data Science", 'F');
		Student s7 = new Student(107, "George", 321098765, "Mathematics", 'M');
		Student s8 = new Student(108, "Hannah", 2109876543, "Physics", 'F');
		Student s9 = new Student(109, "Ivan", 1098765432, "Biology", 'M');
		Student s10 = new Student(110, "Julia", 1987654321, "Chemistry", 'F');
		ins.addStudent(s1);
		ins.addStudent(s2);
        ins.addStudent(s3);
        ins.addStudentInSpecificIndex(1, s4);
         ins.displayStudentDetails();
         System.out.println(ins.getStudent(1));
         ins.removeStudent(1);
         ins.displayStudentDetails();
        ins.remove('M');
         ins.displayStudentDetails();
         ins.replaceSudent(0, s5);
         ins.displayStudentDetails();
         ins.addStudentInSpecificIndex(1, s6);
         ins.addStudentInSpecificIndex(2, s7);
         ins.addStudentInSpecificIndex(3, s8);
         ins.displayStudentDetails();
         ins.returnStudentsGroup('M');
         System.out.println(ins.checkStudent(s8));
         ins.displayStudentDetails();
         ins.removeAll();
         ins.displayStudentDetails();
	}

}
