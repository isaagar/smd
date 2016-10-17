package test;

import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;

import strategyDesignPattern.*;

public class test1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		GregorianCalendar cal = new GregorianCalendar(2016, 1, 23); //23 feb
		Date firstDate = cal.getTime();
		
		cal = new GregorianCalendar(2016, 6, 1); //2 july
		Date secondDate = cal.getTime();
		
		cal = new GregorianCalendar(2016, 9, 14); //14 oct
		Date thirdDate = cal.getTime();
		
		cal = new GregorianCalendar(2016, 9, 14); //25 dec
		Date fourthDate = cal.getTime();
		
		System.out.println("Purchases made:");
		Purchase p1 = new Purchase(firstDate, 20000);	
		p1.display();
		Purchase p2 = new Purchase(secondDate, 30000);
		p2.display();
		Purchase p3 = new Purchase(thirdDate, 15000);
		p3.display();
		Purchase p4 = new Purchase(fourthDate, 10000);
		p4.display();
		
		//list of purchases
		ArrayList<Purchase> listOfPurchases = new ArrayList<Purchase>(); 
		listOfPurchases.add(p1);
		listOfPurchases.add(p2);
		listOfPurchases.add(p3);
		listOfPurchases.add(p4);
		
		CreditCard card = new CreditCard("123456789000", listOfPurchases);
		
		int points1 = p1.computePaybackPoints(); //compute points for 1st purchase
		p1.setPaybackPoints(points1);
		//System.out.println(points1);
		
		int points2 = p2.computePaybackPoints(); //compute points for 2nd purchase
		p2.setPaybackPoints(points2);
		//System.out.println(points2);
		
		int points3 = p3.computePaybackPoints(); //compute points for 3rd purchase
		p3.setPaybackPoints(points3);
		//System.out.println(points3);
		
		int points4 = p4.computePaybackPoints(); //compute points for 4th purchase
		p4.setPaybackPoints(points4);
		//System.out.println(points4);
		
		System.out.println("Points:");
		card.display(); //displays total payback points
	}
}
