import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

public class ManagementTest {

	public Management Subbi;
	Management Edward;
	Management Amelia;
	Management Ben;
	Management John;
	Management Jay;
	Management Gita;
	
	@Before
	public void setUp() {
		Subbi = new Management(3123456,"Subbi");
		Edward = new Management(3123457,"Edward");
		Amelia = new Management(3123455,"Amelia");
		Ben = new Management(3123454,"Ben");
		John = new Management(3123453,"John");
        Gita = new Management(3123421,"Gita");
	}
	
	@Test
	public void test1() {
		fail();
	}
	
	
	@Test
	public void test2() {
		fail("Not yet implemented");
	}

	@Test
	public void test3() {
		assertNull(Jay);
	}
    
	@Test
	public void test4() {
		assertNotNull(Subbi);
		assertNotNull(Gita);
	}
   
	@Test
	public void test5() {
		assertNotNull(Jay);
		assertNotNull(Ben);
	}
   
	@Test
	public void test6() {
		
		ArrayList<Integer> childlist= new ArrayList<Integer>();
		   childlist.add(1234);
		   childlist.add(5671);
		   childlist.add(6754);
		   assertFalse(childlist.isEmpty());
	}

	 @Test
		public void test7() {
			
			ArrayList<Integer> parentlist = new ArrayList<Integer>();
			parentlist.add(5044);
			parentlist.add(8171);
			parentlist.add(9091);
	        assertEquals(3, parentlist.size());
			assertTrue(parentlist.contains(9091));
			assertFalse(parentlist.isEmpty());
		}
	 @Test
	   public void test8(){
		   
		   ArrayList<Integer> listId= new ArrayList<Integer>();
		   listId.add(1234);
		   listId.add(9000);
		   listId.add(7629);
		   assertEquals(1234,(int)listId.get(0));   
	   }

	 @Test
	   public void test9(){
		   assertEquals("3132456",addParent());
	   }

	
	 
	 
	 
	 
	 
	 
	 
	 
	 private Object addParent() {
		// TODO Auto-generated method stub
		return ("3132456");
	}
	 
}
