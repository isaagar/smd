package ccoew.it.i2.BusinessLogic;

public class ReadyForReview extends State{

	public void reviewDefect(Defect D){

		Long count; 
		System.out.println("\n Current State is READYFORREVIEW");
		D.setReviewer(new Person("Mahesh"));
		System.out.println(" Reviewer " +D.getReviewer()+ " reviews the solution of defect");
		
		D.setLines(Math.round(50*Math.random()));
		count = D.getLines();
		System.out.println("\n Count is = "+count);

		if (count< 30)
		{
			D.setState(new Available());
			System.out.println(" READYFORREVIEW state changed into AVAILABLE state");
		}
		else
		{
			D.setState(new Resolved());
			System.out.println(" READYFORREVIEW state changed into RESOLVED state");
		}
	}
}
