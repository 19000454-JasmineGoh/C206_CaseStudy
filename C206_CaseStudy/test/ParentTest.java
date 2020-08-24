import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ParentTest {
	
	private Parent pat1;
	private Parent pat2;

	@Before
	public void setUp() throws Exception {
		pat1 = new Parent ("Lawrence Chia", "Lawrence@gmail.com", "Damien", "18046011", "P3", "3A", "James Chia");
		pat2 = new Parent ("Jennifer", "Jennifer@gmail.com", "Stefan", "20079055", "P1", "1E", "Matilda");
	}//before

	@After
	public void tearDown() throws Exception {
		pat1 = null;
		pat2 = null;
	}//after

	@Test
	public void addParentAccTest() {
		// Test that the list is not null, to add parents
		assertNotNull("Test that the list is not null, to add parents", ParentDB.parentList);
		
		// Test that Parent list = 0, before add parent
		assertEquals("Test that Parent list = 0, before add parent", 0, ParentDB.parentList.size());
		
		// Test that size is parentList = 1 after adding parent
		ParentDB.addParent(pat1);
		assertEquals("Test that size is parentList = 1 after adding parent", 1, ParentDB.parentList.size());
		
		// Test that parentList = 2, after adding another parent
		ParentDB.addParent(pat2);
		assertEquals("Test that parentList = 2, after adding another parent", 2, ParentDB.parentList.size());		 
		
		// Test that first element is same as parent object added
		assertSame("Test that size is parent list +1 after adding parent", pat1, ParentDB.parentList.get(0));
		
		// *Test that null values cannot be added to the category list*
				
	}//addParentAccTest
	
	public void viewParentTest() {
		// Test that the list is not null
		assertNotNull("Test that the list is not null", ParentDB.parentList);
		
		// Test if the list for parents is empty
		ParentDB.viewAllParents();
		String testOutPut = "";
		assertEquals("Test if the list for parents is empty", testOutPut, ParentDB.viewAllParents());
		
		// Test if got 2 parents, test is size = 2
		ParentDB.addParent(pat1);
		ParentDB.addParent(pat2);
		assertEquals("Test if got 2 parents, test is size = 2", 2, ParentDB.parentList.size());
		
		// Test is to check if output matches
		ParentDB.viewAllParents();
		testOutPut = String.format("%-20s %-20s %-20s %-20s %-20s %-20s %-20s", "Lawrence Chia", "Lawrence@gmail.com", "Damien", "18046011", "P3", "3A", "James Chia");
		testOutPut += String.format("%-20s %-20s %-20s %-20s %-20s %-20s %-20s", "Jennifer", "Jennifer@gmail.com", "Stefan", "20079055", "P1", "1E", "Matilda");
		assertEquals("Test is to check if output matches", testOutPut, ParentDB.viewAllParents());
	
	}//viewParentTest
	
	public void delParentTest() {
		// Test that the list is not null
		assertNotNull("Test that the list is not null", ParentDB.parentList);
		
		// Test if the list for parents is empty
		ParentDB.viewAllParents();
		assertEquals("Test if the list for parents is empty", 0, ParentDB.parentList.size());
		
		// Test if got 2 parents, test is size = 2
		ParentDB.addParent(pat1);
		ParentDB.addParent(pat2);
		assertEquals("Test if got 2 parents, test is size = 2", 2, ParentDB.parentList.size());
		
		// Test that parentList = 1, after deleting one
		ParentDB.delParent(pat2);
		assertEquals("Test that parentList = 1, after deleting one", 1, ParentDB.parentList.size());
		
	}//delParentTest
	
}
