package CCOEW;

public class People {
	private String name;
	private Address address ;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "[name=" + name + ", address=" + address + "]";
	}
	public void display(){
		System.out.println("People");
		System.out.println("Name="+getName());
		System.out.println("Address="+getAddress());
	}
}
