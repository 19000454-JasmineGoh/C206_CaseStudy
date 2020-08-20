import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class InstructorTest { 
	private Instructor int1;
	private Instructor int2;

	
	@Before 
	public void setUp() throws Exception {
    int1 = new Instructor("Tan sick sick " , "E234523F","Lihui@giggle.com");
    int2 = new Instructor("Saw Jing BI " , "X102345s","superpower@gmail.com");
	}
	
	@After 
	public void tearDown() throws Exception { 
		int1 = null;
		int2 = null;
		InstructorDB.Instructorlist.clear();
	}
	@Test 
	public void addinstructortest() {
		//Test that instructor list is Not null 
		assertNotNull("Test that instructor list is Not null",InstructorDB.Instructorlist);
		// Test that instructor list is 0 before adding any instructor
		
		assertEquals("Test that instructor list is 0 before adding any instructor",0,InstructorDB.Instructorlist.size());
		// Test that the size of instructor list is 1 after adding a instructor 
		InstructorDB.addinstructor(int1);
		assertEquals(" Test that the size of instructor list is 1 after adding a instructor ",1,InstructorDB.Instructorlist.size());
		//Test that the first element in instructor list is the same as instructor object added 
       assertSame("Test that the first element in instructor list is the same as instructor object added",int1,InstructorDB.Instructorlist.get(0));
	}

	@Test 
	public void viewinstructortest() {
		//Test that if instructor list is not null but empty , so that can add instructors
		assertNotNull("Test that if instructor list is not null but empty , so that can add instructors",InstructorDB.Instructorlist);
		// Test that instructor list is 0 before adding any instructor
		
		assertEquals("Test that instructor list is 0 before adding any instructor",0,InstructorDB.Instructorlist.size());
		// Test that the size of instructor list is 1 after adding a instructor 
		InstructorDB.addinstructor(int1);
		assertEquals(" Test that the size of instructor list is 1 after adding a instructor ",1,InstructorDB.Instructorlist.size());
		//Test that the first element in instructor list is the same as instructor object added 
       assertSame("Test that the first element in instructor list is the same as instructor object added",int1,InstructorDB.Instructorlist.get(0));
	}
	@Test 
	public void deleteinstructortest() {
		//Test that instructor list is Not null 
		assertNotNull("Test that instructor list is Not null",InstructorDB.Instructorlist);
		// Test that instructor list is 0 before adding any instructor
		
		assertEquals("Test that instructor list is 0 before adding any instructor",0,InstructorDB.Instructorlist.size());
		// Test that the size of instructor list is 1 after adding a instructor 
		InstructorDB.addinstructor(int1);
		assertEquals(" Test that the size of instructor list is 1 after adding a instructor ",1,InstructorDB.Instructorlist.size());
		//Test that the first element in instructor list is the same as instructor object added 
       assertSame("Test that the first element in instructor list is the same as instructor object added",int1,InstructorDB.Instructorlist.get(0));
	}

}
