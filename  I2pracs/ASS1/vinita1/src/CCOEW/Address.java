package CCOEW;

public class Address {
	private int buildignNo;
	private String buildingName;
	private String streetName;
	private int pincode;

	public int getBuildignNo() {
		return buildignNo;
	}

	public void setBuildignNo(int buildignNo) {
		this.buildignNo = buildignNo;
	}

	public String getBuildingName() {
		return buildingName;
	}

	public void setBuildingName(String buildingName) {
		this.buildingName = buildingName;
	}

	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	@Override
	public String toString() {
		return "Address [buildignNo=" + buildignNo + ", buildingName="
				+ buildingName + ", streetName=" + streetName + ", pincode="
				+ pincode + "]";
	}
	

}
