package strategyDesignPattern;

public class SecondQuarterPurchase extends PaybackPolicy{

	public int calculatePaybackPoints(int amount)
	{
		int points = 0;
		
		while(amount != 0 && amount >= 200)
		{
			points++;
			//System.out.println("Amount:"+amount);
			amount = amount - 200;
		}
		
		return points;
	}
}
