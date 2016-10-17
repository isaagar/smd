package ccoew.it.i2.BusinessLogic;
import ccoew.it.i2.BusinessLogic.PayPolicy;

public class Permanant extends PayPolicy{
	
	public double calculate_salary(double basicpay)
	{
		double temp;
		
		if(basicpay > 40000)
		{
			temp = (basicpay * 70) / 100;
			temp = basicpay + temp + 5000;
		}
		else
		{
			temp = (basicpay * 70) / 100;
			temp = basicpay + temp;
		}		
		return temp;
	}
}
