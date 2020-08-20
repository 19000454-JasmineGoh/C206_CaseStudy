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
		pat2 = new Parent ("Jennifer Loo", "Jennifer@gmail.com", "Stefan", "20079055", "P1", "1E", "Lia Chong");
	}//before

	@After
	public void tearDown() throws Exception {
		pat1 = null;
		pat2 = null;
	}//after

	@Test
	public void addParentAccTest() {
		// Test that the list is not null
		assertNotNull("Test that the list is not null", ParentDB.parentList);
		
		// Test that Parent list = 0, before add parent
		assertEquals("Test that Parent list = 0, before add parent", 0, ParentDB.parentList.size());
		
		// Test that size is parent list +1 after adding parent
		ParentDB.addParent(pat1);
		assertEquals("Test that size is parent list +1 after adding parent", 1, ParentDB.parentList.size());
		
		// Test that first element is same as parent object added
		assertSame("Test that size is parent list +1 after adding parent", pat1, ParentDB.parentList.get(0));
		
		// Test that null values cannot be added to the category list
		
		
	}//addParentAccTest

}
