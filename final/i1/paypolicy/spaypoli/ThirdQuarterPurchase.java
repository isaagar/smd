package strategyDesignPattern;

public class ThirdQuarterPurchase extends PaybackPolicy {

	public int calculatePaybackPoints(int amount)
	{
		int points = 0;
		
		while(amount != 0 && amount >= 150)
		{
			points++;
			//System.out.println("Amount:"+amount);
			amount = amount - 150;
		}
		
		return points;
	}
}
