package strategyDesignPattern;

import java.util.ArrayList;

public class CreditCard {
	private String id;
	private int totalPaybackPoints;
	private ArrayList<Purchase> listOfPurchases;
		
	
	public CreditCard(String id,
			ArrayList<Purchase> listOfPurchases) {
		super();
		this.id = id;
		this.listOfPurchases = listOfPurchases;
	}
		
	public int getTotalPaybackPoints() {
		return totalPaybackPoints;
	}
	public void setTotalPaybackPoints(int totalPaybackPoints) {
		this.totalPaybackPoints = totalPaybackPoints;
	}
	
	public void calculateTotalPaybackPoints()
	{
		for(Purchase p : listOfPurchases)
		{
			this.totalPaybackPoints += p.getPaybackPoints();
		}	
	}
	
	public void display()
	{
		this.calculateTotalPaybackPoints();
		System.out.println("The total payback points calculated for the credit card no. "+ id + " are: " + this.getTotalPaybackPoints());		

	}

	@Override
	public String toString() {
		return "CreditCard [id=" + id + ", totalPaybackPoints="
				+ totalPaybackPoints + ", listOfPurchases=" + listOfPurchases
				+ "]";
	}	
}
