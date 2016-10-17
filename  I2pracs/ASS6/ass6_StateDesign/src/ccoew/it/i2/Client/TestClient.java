package ccoew.it.i2.Client;
import ccoew.it.i2.BusinessLogic.Available;
import ccoew.it.i2.BusinessLogic.Defect;
import ccoew.it.i2.BusinessLogic.InProgress;
import ccoew.it.i2.BusinessLogic.ReadyForReview;

public class TestClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Defect Dobj = new Defect();
		Available Aobj = new Available();
		InProgress Iobj = new InProgress();
		ReadyForReview Robj = new ReadyForReview();

		Dobj.enterDefectToDTS(Dobj);
		Aobj.acquireDefect(Dobj);
		Iobj.findSolution(Dobj);
		Robj.reviewDefect(Dobj);	
	}
}
