import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class StudentTest {
	
	private Student stud1;
	private Student stud2;
	
	@Before
	public void setUp() throws Exception {
		stud1 = new Student("17000454", "Nao Tan", "P4", "4B", "James Wong", "Ryan Tan", "RyanTan69@gmail.com");
		stud2 = new Student("18000883", "Riley Tay", "P5", "5C", "Sam Ong", "Jaclyn Lee", "JaclynLee01@gmail.com");
	}

	@After
	public void tearDown() throws Exception {
		stud1 = null;
		stud2 = null;
		StudentDB.studentList.clear();
	}

	@Test
	public void addStudentTest() {
	
		//Test if the student list is not null
		assertNotNull("Test that student list is not null", StudentDB.studentList);
			
		//Test that the student list is empty 
		assertEquals("Test that the student list is empty", 0, StudentDB.studentList.size());
		
		//Test if student list size is 1 after adding a student
		StudentDB.addStudent(stud1);
		assertEquals("Test if student list size is 1 after adding a student", 1, StudentDB.studentList.size());
		
		//Test if the first element in the student list is the same as the Student object added
		assertSame("Test if the first element in the student list is the same as the Student object added", stud1, StudentDB.studentList.get(0));	
		
		//Test that null values cannot be added to the student list
		StudentDB.addStudent(null);
	    assertNotNull("Test that the element added into the array list is not null");
    
	} //end of addStudentTest
	
	public void viewAllStudentsTest() {
		
		//Test if the student list is not null but empty
		assertNotNull("Test that student list is not null but empty", StudentDB.studentList);
		
		//Test if the student list is not empty
		String allStudent= StudentDB.retrieveAllStudents(StudentDB.studentList);
		String testOutput = "";
		assertEquals("Test if the student list is not empty", testOutput, allStudent);
		
		//Test if student list size is 2 after adding 2 students
		StudentDB.addStudent(stud1);
		StudentDB.addStudent(stud2);
		assertEquals("Test if student list size is 2 after adding 2 students", 2, StudentDB.studentList.size());
		
		//Test if output is the same as the elements in the student list
		testOutput = String.format("%-15s %-15s %-10s %-15s %-15s %-15s %-15s\n",
				"ID", "Name", "Grade", "Classroom", "Teacher", "Parent Name", "Parent Email");
		testOutput += String.format("%-15s %-15s %-10s %-15s %-15s %-15s %-15s\n",
				"17000454", "Nao Tan", "P4", "4B", "James Wong", "Ryan Tan", "RyanTan69@gmail.com");
		testOutput += String.format("%-15s %-15s %-10s %-15s %-15s %-15s %-15s\n",
				"18000883", "Riley Tay", "P5", "5C", "Sam Ong", "Jaclyn Lee", "JaclynLee01@gmail.com");
		
		assertEquals("Test that ViewAllStudents", testOutput, allStudent);
		
	} //end of viewAllStudentsTest
	
	public void deleteStudentTest() {
		
		//Test if the student list is not null
		assertNotNull("Test that student list is not null", StudentDB.studentList);
			
		//Test that the student list is empty 
		assertEquals("Test that the student list is empty", 0, StudentDB.studentList.size());
		
		//Test if student list size is 2 after adding 2 students (test size = 2)
		StudentDB.addStudent(stud1);
		StudentDB.addStudent(stud2);
		assertEquals("Test if student list size is 2 after adding 2 students", 2, StudentDB.studentList.size());
		
		//Test if student list size is 1 after deleting 1 student
		StudentDB.delStudent(stud1.getId());
		assertEquals("Test that ViewAllStudents", 1, StudentDB.studentList.size());
	
	} //end of deleteStudentTest

}
