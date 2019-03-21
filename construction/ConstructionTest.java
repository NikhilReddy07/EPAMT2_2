package construction;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ConstructionTest {

	@Test
	void test() {
		
		ConstructionCostCalculator testObj=new ConstructionCostCalculator();
		
		assertEquals(1800000, testObj.calculateCost("standard materials", 1500, true));
		assertEquals(1800000, testObj.calculateCost("standard materials", 1500, false));
		assertEquals(2250000, testObj.calculateCost("above standard materials", 1500, true));
		assertEquals(2250000, testObj.calculateCost("above standard materials", 1500, false));
		assertEquals(3750000, testObj.calculateCost("high standard materials", 1500, true));
		assertEquals(2700000, testObj.calculateCost("high standard materials", 1500, false));
		assertEquals(0, testObj.calculateCost("Something Else!", 1500, false));
		
	}

}
