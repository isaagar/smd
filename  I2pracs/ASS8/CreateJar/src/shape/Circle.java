package shape;

public class Circle extends Shape {
	
	private int radius;
	public Circle(Point center,int radius) {
		super(center);
		this.radius=radius;
		// TODO Auto-generated constructor stub
	}


	@Override
	public double area() {
		// TODO Auto-generated method stub
		return Math.PI*radius*radius;
	}

	@Override
	public double perimeter() {
		// TODO Auto-generated method stub
		return Math.PI*2.0*radius;
	}

}
