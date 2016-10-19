package strategyDesignPattern;

import java.util.Date;
import java.util.GregorianCalendar;

public class Purchase {
		private Date pDate;
		private int pAmount;
		private int paybackPoints;
		private PaybackPolicy policy;
		
		
		public Purchase(Date pDate, int pAmount) {
			super();
			this.pDate = pDate;
			this.pAmount = pAmount;
			this.calculatePolicy();
		}


		public Date getpDate() {
			return pDate;
		}

		public void setpDate(Date pDate) {
			this.pDate = pDate;
		}

		public long getpAmount() {
			return pAmount;
		}

		public void setpAmount(int pAmount) {
			this.pAmount = pAmount;
		}

		public int getPaybackPoints() {
			return paybackPoints;
		}

		public void setPaybackPoints(int paybackPoints) {
			this.paybackPoints = paybackPoints;
		}

		public PaybackPolicy getPolicy() {
			return policy;
		}

		public void setPolicy(PaybackPolicy policy) {
			this.policy = policy;
		}
		
		
		public void calculatePolicy()
		{			
			GregorianCalendar cal = new GregorianCalendar(2016, 0, 1); //1 jan
			Date fqp_firstDate = cal.getTime();
			
			cal = new GregorianCalendar(2016, 2, 31); //31 march
			Date fqp_lastDate = cal.getTime();
			
			cal = new GregorianCalendar(2016, 3, 1); //1st april
			Date sqp_firstDate = cal.getTime();
			
			cal = new GregorianCalendar(2016, 5, 30); //30 june
			Date sqp_lastDate = cal.getTime();
			
			cal = new GregorianCalendar(2016, 6, 1); //1st july
			Date tqp_firstDate = cal.getTime();
			
			cal = new GregorianCalendar(2016, 8, 30); //30 sept
			Date tqp_lastDate = cal.getTime();
			
			cal = new GregorianCalendar(2016, 9, 1); //1st oct
			Date foqp_firstDate = cal.getTime();
			
			cal = new GregorianCalendar(2016, 11, 31); //31 dec
			Date foqp_lastDate = cal.getTime();
								
			if((this.pDate.after(fqp_firstDate) && this.pDate.before(fqp_lastDate)) || this.pDate.equals(fqp_firstDate) || this.pDate.equals(fqp_lastDate))
			{
				//System.out.println("First quarter");
				this.setPolicy(new FirstQuarterPurchase());
			}
			else if((this.pDate.after(sqp_firstDate) && this.pDate.before(sqp_lastDate) ) || this.pDate.equals(sqp_firstDate) || this.pDate.equals(sqp_lastDate))
			{
				//System.out.println("Second quarter");
				this.setPolicy(new SecondQuarterPurchase());
			}
			else if(((this.pDate.after(tqp_firstDate) && this.pDate.before(tqp_lastDate))) || this.pDate.equals(tqp_firstDate) || this.pDate.equals(tqp_lastDate))
			{
				//System.out.println("Third quarter");
				this.setPolicy(new ThirdQuarterPurchase());
			}
			else if((this.pDate.after(foqp_firstDate) && this.pDate.before(foqp_lastDate) ) || this.pDate.equals(foqp_firstDate) || this.pDate.equals(foqp_lastDate))
			{
				//System.out.println("Fourth quarter");
				this.setPolicy(new FourthQuarterPurchase());
			}
		}
		
		public int computePaybackPoints()
		{
			int points = this.getPolicy().calculatePaybackPoints(this.pAmount);
			return points;
		}
		
		public void display()
		{
			System.out.println("The purchase amount is Rs. " + pAmount + " on " + pDate);
		}
}
