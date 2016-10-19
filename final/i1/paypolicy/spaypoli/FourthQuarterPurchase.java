package strategyDesignPattern;

public class FourthQuarterPurchase extends PaybackPolicy{

	public int calculatePaybackPoints(int amount)
	{
		int points = 0;
		
		while(amount != 0 && amount >= 100)
		{
			points++;
			amount = amount - 100;
		}
		
		return points;
	}
}
