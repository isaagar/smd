package ccoew.it.i2.Client;
import ccoew.it.i2.BusinessLogic.Employee;
import ccoew.it.i2.BusinessLogic.Permanant;
import ccoew.it.i2.BusinessLogic.Temporary;
import ccoew.it.i2.BusinessLogic.Trainee;

public class TestClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Employee first = new Employee(1, "Suresh", 40000.00, new Trainee());
		Employee second = new Employee(2, "Ramesh", 50000.00, new Trainee());
		Employee third = new Employee(3, "Mahesh", 60000.00, new Trainee());

		double mySalary = first.calculateGrosspay();
		System.out.println("\n\tEmployee ID : "+first.getEmp_id());
		System.out.println("\tEmployee Name : "+first.getEmp_name());
		System.out.println("\tEmployee Basic Pay : "+first.getEmp_basicpay());
		System.out.println("\tGross salary : "+mySalary);

		second.setPayPolicy(new Temporary());
		mySalary= second.calculateGrosspay();

		System.out.println("\n\tEmployee ID : "+second.getEmp_id());
		System.out.println("\tEmployee Name : "+second.getEmp_name());
		System.out.println("\tEmployee Basic Pay : "+second.getEmp_basicpay());
		System.out.println("\tGross salary : "+mySalary);

		third.setPayPolicy(new Permanant());
		mySalary = third.calculateGrosspay();

		System.out.println("\n\tEmployee ID : "+third.getEmp_id());
		System.out.println("\tEmployee Name : "+third.getEmp_name());
		System.out.println("\tEmployee Basic Pay : "+third.getEmp_basicpay());
		System.out.println("\tGross salary : "+mySalary);
	}	
}
