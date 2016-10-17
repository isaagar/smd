package ccoew.it.i2.BusinessLogic;

public class Available extends State{

	public void acquireDefect(Defect D){

		System.out.println("\n Current State is AVAILABLE");
		D.setDeveloper(new Person("Ramesh"));
	
		System.out.println(" Developer "+D.getDeveloper()+ " acquire this defect");

		D.setState(new InProgress());
		System.out.println(" AVAILABLE state changed into INPROGESS state");
	}

}
