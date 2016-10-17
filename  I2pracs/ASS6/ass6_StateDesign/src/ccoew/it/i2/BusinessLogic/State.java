package ccoew.it.i2.BusinessLogic;

public class State {

	public void aquireDefect(Defect defect) {
		System.out.println("the dected is not yet aquired");
	}

	public void findSolution(Defect defect) {
		System.out.println("The solution is not yet found");
	}

	public void reviewDefect(Defect defect) {
		System.out.println("The defect is not yet reviewed");
	}
}
