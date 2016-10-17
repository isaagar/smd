package shape;

public abstract class Shape {

	private Point center;
	
	public Shape (Point center)
	{
		
	}
	public abstract double area();
	public abstract double perimeter();
	public Point getCenter() {
		return center;
	}
	public void setCenter(Point center) {
		this.center = center;
	}
	
	
}
