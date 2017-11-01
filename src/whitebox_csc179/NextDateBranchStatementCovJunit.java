/*package whitebox_csc179;

import static org.junit.Assert.*;
import org.junit.Test;

public class NextDateBranchStatementCovJunit {
	NextDate nd; 
	

	//T1
	@Test
	public void branchCov1() {
		
	   assertEquals(NextDate.run(5, 10, 2222), "invalid Input Date");
	}
	
	//T2
	@Test
	public void branchCov2() {
		
	   assertEquals(NextDate.run(5, 10, 2000), "5/11/2000");
	}
	
	//T3
	@Test
	public void branchCov3() {
		
	   assertEquals(NextDate.run(5, 31, 2000), "6/1/2000");
	}
	
	//T4
	@Test
	public void branchCov4() {
		
	   assertEquals(NextDate.run(4, 10, 2000), "4/11/2000");
	}
	
	//T5
	@Test
	public void branchCov5() {
		
	   assertEquals(NextDate.run(12, 10, 2000), "12/11/2000");
	}
	
	//T6
	@Test
	public void branchCov6() {
		
	   assertEquals(NextDate.run(2, 10, 2000), "2/11/2000");
	}

	//T7
	@Test
	public void branchCov7() {
		
	   assertEquals(NextDate.run(4, 31, 2000), "Invalid Input Date");
	}
	
	
	//T8
	@Test
	public void branchCov8() {
		
	   assertEquals(NextDate.run(4, 30, 2000), "5/1/2000");
	}
	
	//T9
	@Test
	public void branchCov9() {
		
	   assertEquals(NextDate.run(12, 32, 2000), "1/1/2001");
	}
	
	//T10
	@Test
	public void branchCov10() {
		
	   assertEquals(NextDate.run(12, 32, 2021), "Invalid Next Year");
	}
	
	//T11
	@Test
	public void branchCov11() {
		
	   assertEquals(NextDate.run(2, 29, 2000), "3/1/2000");
	}
	
	//T12
	@Test
	public void branchCov12() {
		
	   assertEquals(NextDate.run(2, 28, 2000), "2/29/2000");
	}
	
	//T13
	@Test
	public void branchCov13() {
		
	   assertEquals(NextDate.run(2, 28, 2001), "3/1/2001");
	}
	
	//T14
	@Test
	public void branchCov14() {
		
	   assertEquals(NextDate.run(2, 30, 2000), "Invalid Input Date");
	}
	
	//T15
	@Test
	public void branchCov15() {
		
	   assertEquals(NextDate.run(2, 29, 2003), "Invalid Input Date");
	}
	
	//T16
	@Test
	public void branchCov16() {
		
	   //assertEquals(NextDate.run(2, 31, 2001), "Invalid Input Date");
	   assertEquals(NextDate.run(2, 20, 2000), "2/21/2000");
	}
	
    
	
}
*/