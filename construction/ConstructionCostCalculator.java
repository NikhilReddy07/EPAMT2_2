package construction;

public class ConstructionCostCalculator {
	
	// Area is in sq.ft
	public int calculateCost(String materialStandard, double area, boolean fullyAutomated) {
		if(materialStandard.equals("high standard materials") && fullyAutomated)
		{
			return (int) (2500*area);// Cost per sq.ft * area
		}
	   else if(materialStandard.equals("standard materials"))
		{
			return (int) (1200*area);// Cost per sq.ft * area
		}
		else if(materialStandard.equals("above standard materials"))
		{
			return (int) (1500*area);// Cost per sq.ft * area
		}
		else if(materialStandard.equals("high standard materials"))
		{
			return (int) (1800*area);// Cost per sq.ft * area
		}
		return 0;
		
	}
}
