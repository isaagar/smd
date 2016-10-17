package test;
import paypolicy.*;

public class Test {

	public static void main(String[] args) {
		Employee first=new Employee(1, "Madhavi", 70000.00,new Trainee());
		first.display();
		double mysalary1=first.calculateGrosspay();
		first.setEmp_basicpay(mysalary1);
		System.out.println("Changed Salary="+mysalary1);
		
		Employee second = new Employee(2, "Yogita", 70000.00, new Temporary());
		second.display();
		double mysalary2=second.calculateGrosspay();
		second.setEmp_basicpay(mysalary2);
		System.out.println("Changed Salary="+mysalary2);
		
		Employee third = new Employee(3, "Ankita", 70000.00, new Permanant());
		third.display();
		third.calculateGrosspay();
		double mysalary3=third.calculateGrosspay();
		third.setEmp_basicpay(mysalary3);
		System.out.println("Changed Salary="+mysalary3);
	}
}
