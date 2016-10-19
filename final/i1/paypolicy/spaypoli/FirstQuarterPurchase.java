package strategyDesignPattern;

public class FirstQuarterPurchase extends PaybackPolicy {
	
	
	public int calculatePaybackPoints(int amount)
	{
		int points = 0;
		while(amount != 0 && amount >= 300)
		{
			points++;
			//System.out.println("Amount:"+amount);
			amount = amount - 300;
		}
		return points;
	}
}
