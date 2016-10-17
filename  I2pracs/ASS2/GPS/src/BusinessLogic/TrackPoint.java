package BusinessLogic;



public class TrackPoint {
	private double x;
	private double y;
	private double z;
	private double time;
	
	public TrackPoint(double x, double y, double z, double time) {
		super();
		this.x = x;
		this.y = y;
		this.z = z;
		this.time = time;
	}
	

	public TrackPoint() {
		super();
	}


	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public double getZ() {
		return z;
	}

	public void setZ(double z) {
		this.z = z;
	}

	public double getTime() {
		return time;
	}

	public void setTime(double time) {
		this.time = time;
	}
	
	

}