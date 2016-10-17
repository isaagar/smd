package ccoew.it.i2.client;

import ccoew.it.i2.business.Defect;
import ccoew.it.i2.business.State;

public class Test {

	public static void main(String[] args) {
		
		Defect defect = new Defect();
		defect.setState(State.InProgress);
		
		defect.enter_defect();
		defect.acquire_defect();
		defect.find_solution();
		defect.review_defect();
	}

}