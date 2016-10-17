package ccoew.it.i2.business;

public class Defect {

	private Person tester;
	private Person developer;
	private Person reviewer;
	private State state;
	private Long Lines;

	public Person getTester() {
		return tester;
	}

	public void setTester(Person tester) {
		this.tester = tester;
	}

	public Person getDeveloper() {
		return developer;
	}

	public void setDeveloper(Person developer) {
		this.developer = developer;
	}

	public Person getReviewer() {
		return reviewer;
	}

	public void setReviewer(Person reviewer) {
		this.reviewer = reviewer;
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}

	public Long getLines() {
		return Lines;
	}

	public void setLines(Long lines) {
		Lines = lines;
	}

	public Defect() {
		this.state = null;

	}

	public void enter_defect() {
		this.setTester(new Person("Suresh"));
		System.out.println("\nSoftware Tester "+ this.getTester()+" enters a Defect Tracking System");
		this.setState(state.Avaiable);
		System.out.println("State changed to AVAILABLE");
	}

	public void acquire_defect() {

		if (getState().equals(state.Avaiable)) {
			System.out.println("\nCurrent State is AVAILABLE");
			this.setDeveloper(new Person("Ramesh"));
			System.out.println("Developer "+this.getDeveloper()+ " called as owner of the Defect.");
			this.setState(state.InProgress);

			System.out.println("State changed to INPROGRESS");
		} else {
			System.out.println("This behavour is only applicable if the current state of the defect is AVAILABLE");
		}
	}

	public void find_solution() {
		
		if (getState().equals(state.InProgress)) {
			System.out.println("\nCurrent State is INPROGRESS");
			System.out.println("Defect is fixed , solution is found ");
			this.setState(state.ReadyForReview);
			System.out.println("State changed to READY FOR REVIEW");
		}
	}

	public void review_defect() {
		Long count;
		if (getState().equals(state.ReadyForReview)) {
			this.setReviewer(new Person("Mahesh"));
			System.out.println("\nCurrent State is READY FOR REVIEW");
			System.out.println( "Reviewer " +this.getReviewer().toString() + " reviews the solution of defect");

			this.setLines(Math.round(50 * Math.random()));
			count = this.getLines();
			System.out.println("\nCount is = " + count);

			if (count < 30) {

				this.setState(state.Avaiable);
				System.out
						.println("READY FOR REVIEW state changed into AVAILABLE state");
			} else {
				this.setState(state.Resolved);
				System.out
						.println("READY FOR REVIEW state changed into RESOLVED state");
			}

		}
	}

}
