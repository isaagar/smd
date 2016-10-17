package board;
import java.util.HashSet;
import java.util.Set;
import shape.Shape;

public class DrawingBoard {

	private Set<Shape> shapes=new HashSet<Shape>();
	public void add(Shape shape)
	{shapes.add(shape);}
	
	public double totalArea()
	{
		double totalArea=0;
		for(Shape shape: shapes)
		{
			totalArea+=shape.area();
		}
		return totalArea;
	}
}
