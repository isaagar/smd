package ccoew.it.i2.BusinessLogic;

public class InProgress extends State{

	public void findSolution(Defect D){

		System.out.println("\n Current State is INPROGESS");
		System.out.println(" Defect is Fixed, solution found");
		D.setState(new ReadyForReview());
		System.out.println(" INPROGESS state changed into READYFORREVIEW state");
	}
}
