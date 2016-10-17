package ccoew.it.i2.BusinessLogic;

public class Defect {

	private Person tester;
	private Person developer;
	private Person reviewer;
	private State state;
	private Long lines;

	public void enterDefectToDTS(Defect D) {

		setTester(new Person("Suresh"));
		System.out.println("\n A software Tester "+this.getTester()+" enters a defect in defect tracking system");
		System.out.println(" State changed to AVAILABLE");
	}

	public Long getLines() {
		return lines;
	}

	public void setLines(Long lines) {
		this.lines = lines;
	}
	public Person getTester() {
		return tester;
	}

	public void setTester(Person tester) {
		this.tester = tester;
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
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
}
