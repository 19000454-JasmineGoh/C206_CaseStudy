import java.util.ArrayList;

public class StudentDB {

	public static ArrayList<Student> studentList = new ArrayList<Student>();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student stud1 = new Student("17000454", "Nao Tan", "P4", "4B", "James Wong", "Ryan Tan", "RyanTan69@gmail.com");
		Student stud2 = new Student("18000883", "Riley Tay", "P5", "5C", "Sam Ong", "Jaclyn Lee", "JaclynLee01@gmail.com");
		
		StudentDB.addStudent(stud1);
		StudentDB.addStudent(stud2);
		
		int option = 0;

		while (option != 4) {

			viewStudentMenu();
			option = Helper.readInt("Enter an option > ");
		
			if (option == 1) {
				
				String id = Helper.readString("Enter Student ID: ");
				String name = Helper.readString("Enter Student name: ");
				String grade = Helper.readString("Enter Student grade: ");
				String classroom = Helper.readString("Enter Student class: ");
				String teacher = Helper.readString("Enter classroom teacher: ");
				String parentName = Helper.readString("Enter Parent's Name: ");
				String parentEmail = Helper.readString("Enter Parent's Email: ");
				
				StudentDB.addStudent(new Student(id, name, grade, classroom, teacher, parentName, parentEmail));
				System.out.println("Student added");
				
			} else if (option == 2) {
				
				System.out.println("");
				StudentDB.viewAllStudents(StudentDB.studentList);
				
			} else if (option == 3) {
				
				StudentDB.viewAllStudents(StudentDB.studentList);
				String id = Helper.readString("Enter Student ID to delete: ");
				StudentDB.delStudent(id);
				
			} else if (option == 4) {
				System.out.println("Bye!");
				
			} else {
				System.out.println("Invalid option");	
			}
			
		}

	}
		
	public static void viewStudentMenu() {
		System.out.println("");
		System.out.println("----- STUDENT MENU -----");
		System.out.println("1. Add Student");
		System.out.println("2. View All Students");
		System.out.println("3. Delete Student");
		System.out.println("4. Quit");
		Helper.line(80, "-");
	} //end of viewStudentMenu
		
	public static void addStudent(Student stud) {	
		
		studentList.add(stud);
	
	} //end of addStudent

	public static String retrieveAllStudents(ArrayList<Student> studentList) {
		String output = "";
		
		for (int i = 0; i < studentList.size(); i++) {
			
			output += String.format("%-90s", studentList.get(i).toString());
		
		}
		return output;
		
	} //end of retrieveAllStudents
	
	public static void viewAllStudents(ArrayList<Student> studentList) {
		
		String output = String.format("%-15s %-15s %-10s %-15s %-15s %-15s %-15s\n",
				"ID", "Name", "Grade", "Classroom", "Teacher", "Parent Name", "Parent Email");
		
		output += retrieveAllStudents(studentList);
		System.out.print(output);
		
	} //end of viewAllStudents

	public static void delStudent(String id) {
	
		boolean exist = false;
		
		for (int i = 0; i< studentList.size(); i++) {
			if (id.contentEquals(studentList.get(i).getId())){
				studentList.remove(i);
				System.out.println("Student deleted");
				exist = true;
			} 
		}
		
		if(exist == false){
			System.out.println("No such student");
		}	
	
	} //end of delStudent
	
} //end of StudentDB class