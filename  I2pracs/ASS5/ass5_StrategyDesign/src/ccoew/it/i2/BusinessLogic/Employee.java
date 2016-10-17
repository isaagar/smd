package ccoew.it.i2.BusinessLogic;

public class Employee {
	
	private int emp_id;
	private String emp_name;
	private double emp_basicpay;
	private PayPolicy payPolicy;
	
	
	public Employee(int emp_id, String emp_name, double emp_basicpay,
			PayPolicy payPolicy) {
		super();
		this.emp_id = emp_id;
		this.emp_name = emp_name;
		this.emp_basicpay = emp_basicpay;
		this.payPolicy = payPolicy;
	}
	public int getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}
	public String getEmp_name() {
		return emp_name;
	}
	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}
	public double getEmp_basicpay() {
		return emp_basicpay;
	}
	public void setEmp_basicpay(double emp_basicpay) {
		this.emp_basicpay = emp_basicpay;
	}
	public PayPolicy getPayPolicy() {
		return payPolicy;
	}
	public void setPayPolicy(PayPolicy payPolicy) {
		this.payPolicy = payPolicy;
	}
	public double calculateGrosspay(){
		double pay;
		pay = this.getPayPolicy().calculate_salary(getEmp_basicpay());
		return pay;
	}
}
