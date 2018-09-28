package cisc181q2;

import static org.junit.Assert.*;

import org.junit.Test;

public class q2Test {

	@Test
	public void test() {
	
	carclass carTests = new carclass (.0083, 35000, 0, 60);
	assertEquals (carTests.getMonthlyCarPayment(), 742.96, 0.01);
	assertEquals (carTests.getTotalInterest(), 9618.79, 0.01);				
	}

}
