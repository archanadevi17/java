package junit;

// to create the test class ryt click on pkg > other> java>junit>junit testcase
public class test {
	sum s;
	int[]a= {12,58,78,2};

	
	public void testsum() {
		s=new sum();
		System.out.println("in test:");
		int m=s.getsum(a);
		assertEquals(m,150);
	}

	private void assertEquals(int m, int i) {
		// TODO Auto-generated method stub
		
	}

}
                     