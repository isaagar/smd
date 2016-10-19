package paypolicy;

public class Temporary extends PayPolicy{
public double calculate_salary(double basicpay)
{
	double temp = (basicpay * 40) / 100;
	temp = basicpay + temp;
	return temp;
}
}