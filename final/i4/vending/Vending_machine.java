package smd3.vending;

public class Vending_machine {
	private State current_state;
	
	
	public Vending_machine(State current_state) {
		super();
		this.current_state =current_state ;
		
	}

	public State getCurrent_state() {
		return current_state;
	}

	public void setCurrent_state(State current_state) {
		this.current_state = current_state;
	}


	public Vending_machine()
	{
		this.current_state =State.idle;
		
	}
	
	public void at_start()
	{
		if(this.getCurrent_state().equals(State.idle))
		{
			System.out.println("Current State="+getCurrent_state());
			System.out.println("/n vending machine is in IDLE state");
		}
	}
	
	public void coin_insert()
	{	if(this.getCurrent_state().equals(State.idle))
	{
		System.out.println("Current State="+getCurrent_state());
		System.out.println("\nvending machine is in IDLE state,coins are inserted into insertion slit");
		System.out.println("\n changing from IDLE to ACCEPTING COIN state");
		this.setCurrent_state(State.accept_coin);
		System.out.println("Current state="+getCurrent_state());
	}
		
	}
	
	public void before_selecting()
	{
		if(this.getCurrent_state().equals(State.accept_coin))
		{
			System.out.println("Checking if amount entered is equal to price of drink");
			System.out.println("\n Amount is equal");
			System.out.println("\nChanging from ACCEPT_COIN TO SELECT_DRINK state");
			this.setCurrent_state(State.select_drink);
			System.out.println("Current state="+getCurrent_state());

		}
		else
		{
			System.out.println("Amount entered is not equal,changing to Return state");
			this.setCurrent_state(State.return_coins);
			System.out.println("Current state="+getCurrent_state());

		}
	}
	
	public void  after_selecting()
	{
		if(this.getCurrent_state().equals(State.select_drink))
	{
			System.out.println("\n asks for selection of drink");
			System.out.println("\n changing from SELECT to DISPENSING");
			this.setCurrent_state(State.dispenesing );
			
			System.out.println("Current state="+getCurrent_state());
	}
		
		
	}
	
	public void  after_dispensing()
	{
		if(this.getCurrent_state().equals(State.dispenesing))
		{
			System.out.println("\n Dispensing Drink cans into dispensing tray");
			System.out.println("\n drinks dispensed");
			System.out.println("Changing from Dispensing to IDLE");
			this.setCurrent_state(State.idle);
			System.out.println("Current state="+getCurrent_state());

		}

	}
	
	public void return_coin()
	{
		if(this.getCurrent_state().equals(State.return_coins))
		{	
			System.out.println("  returns the coins through the dispensing tray, and goes to IDLE state. ");
			System.out.println("Changing from return to idle");
			this.setCurrent_state(State.idle);
			System.out.println("Current state="+getCurrent_state());

		}
	
	}
}
