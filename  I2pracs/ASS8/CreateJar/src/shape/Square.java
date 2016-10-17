package shape;

public class Square extends Shape {

	private int side;

	public Square(Point center, int side) {
		super(center);
		this.side = side;
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return side*side;
	}

	@Override
	public double perimeter() {
		// TODO Auto-generated method stub
		return 4*side;
	}
	
}
