package strategyDesignPattern;

public abstract class PaybackPolicy {
	Purchase purchase;


	public PaybackPolicy() {
		super();
	}
	
	

	public PaybackPolicy(Purchase purchase) {
		super();
		this.purchase = purchase;
	}



	public Purchase getPurchase() {
		return purchase;
	}

	public void setPurchase(Purchase purchase) {
		this.purchase = purchase;
	}

	public abstract int calculatePaybackPoints(int pAmount);
		// TODO Auto-generated method stub
		
}
