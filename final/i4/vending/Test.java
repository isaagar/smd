package smd3.vending;

public class Test {

	public static void main(String[] args) {
		Vending_machine vm=new Vending_machine();
		vm.at_start();
		vm.coin_insert();
		vm.before_selecting();
		vm.after_selecting();
		vm.after_dispensing();
		vm.return_coin();
		

	}

}
