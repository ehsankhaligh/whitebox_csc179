package whitebox_csc179;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class NextDateCondtionCovJunit {


	//T1
	@Test
	public void condCovg1() {
		
	   assertEquals(NextDate.run(0, 1, 2000), "invalid Input Date");
	}
	
	//T1a
	@Test
	public void condCovg1a() {
		
	   assertEquals(NextDate.run(1, 0, 2000), "invalid Input Date");
	}
	
	//T1b
	@Test
	public void condCovg1b() {
		
	   assertEquals(NextDate.run(1, 1, 1800), "invalid Input Date");
	}
	
	//T1c
	@Test
	public void condCovg1c() {
		
	   assertEquals(NextDate.run(16, 1, 2000), "invalid Input Date");
	}
	
	//T1d
	@Test
	public void condCovg1d() {
		
	   assertEquals(NextDate.run(10, 1, 2022), "invalid Input Date");
	}

	//T1e
	@Test
	public void condCov1e() {
		
	   assertEquals(NextDate.run(0, 0, 1800), "invalid Input Date");
	}
	
	//T1f
	@Test
	public void condCov1f() {
		
	   assertEquals(NextDate.run(15, 0, 2022), "invalid Input Date");
	}
	
	//T2a
	@Test
	public void condCov2a() {
		
	   assertEquals(NextDate.run(1, 10, 2000), "1/11/2000");
	}
	
	//T2b
	@Test
	public void condCov2b() {
		
	   assertEquals(NextDate.run(3, 10, 2000), "3/11/2000");
	}
	
	//T2c
	@Test
	public void condCov2c() {
		
	   assertEquals(NextDate.run(5, 10, 2000), "5/11/2000");
	}
	
	//T2d
	@Test
	public void condCov2d() {
		
	   assertEquals(NextDate.run(8, 10, 2000), "8/11/2000");
	}
	
	//T2e
	@Test
	public void condCov2e() {
		
	   assertEquals(NextDate.run(10, 10, 2000), "10/11/2000");
	}
	
	//T3
	@Test
	public void condCov3() {
		
	   assertEquals(NextDate.run(5, 31, 2000), "6/1/2000");
	}
	
	//T4a
	@Test
	public void condCov4a() {
		
	   assertEquals(NextDate.run(4, 10, 2000), "4/11/2000");
	} 
	
	//T4b
	@Test
	public void condCov4b() {
		
	   assertEquals(NextDate.run(6, 10, 2000), "6/11/2000");
	}
	
	//T4c
	@Test
	public void condCov4c() {
		
	   assertEquals(NextDate.run(9, 10, 2000), "9/11/2000");
	}
	
    //T4d
	@Test
	public void condCov4d() {
		
	   assertEquals(NextDate.run(11, 10, 2000), "11/11/2000");
	}
	
	//T5
	@Test
	public void condCov5() {
		
	   assertEquals(NextDate.run(12, 10, 2000), "12/11/2000");
	}
	
	//T5
	@Test
	public void condCov6() {
		
	   assertEquals(NextDate.run(2, 10, 2000), "2/11/2000");
	}

    //T7
	@Test
	public void condCov7() {
		
	   assertEquals(NextDate.run(4, 31, 2000), "Invalid Input Date");
	}
	
	//T8
	@Test
	public void condCov8() {
		
	   assertEquals(NextDate.run(4, 30, 2000), "5/1/2000");
	}
	
	//T9
	@Test
	public void condCov9() {
		
	   assertEquals(NextDate.run(12, 32, 2000), "1/1/2001");
	}
	
	//T10
	@Test
	public void condCov10() {
		
	   assertEquals(NextDate.run(12, 32, 2021), "Invalid Next Year");
	}
	
	//T11
	@Test
	public void condCov11() {
		
	   assertEquals(NextDate.run(2, 29, 2000), "3/1/2000");
	}
	
	//T12
	@Test
	public void condCov12() {
		
	   assertEquals(NextDate.run(2, 28, 2000), "2/29/2000");
	}
	
	//T13
	@Test
	public void condCov13() {
		
	   assertEquals(NextDate.run(2, 28, 2001), "3/1/2001");
	}
	
	//T14
	@Test
	public void condCov14() {
		
	   assertEquals(NextDate.run(2, 30, 2000), "Invalid Input Date");
	}
	
	//T15
	@Test
	public void condCov15() {
		
	   assertEquals(NextDate.run(2, 29, 2003), "Invalid Input Date");
	}
	
  
	//T16
	@Test
	public void condCov16() {
		
	   //assertEquals(NextDate.run(2, 31, 2001), "Invalid Input Date");
	   assertEquals(NextDate.run(2, 20, 2000), "2/21/2000");
	}

}
