import java.util.*;
abstract class Shape {
	abstract void rectarea(int l, int b);
	abstract void squarearea(int s);
	abstract void circlearea(int r);
}
class Area extends Shape
{
	void rectarea(int l, int b)
	{
		System.out.println("Area of rectangle - " + (l*b));
	}
	void squarearea(int s)
	{
		System.out.println("Area of square - " + (s*s));
	}
	void circlearea(int r)
	{
		System.out.println("Area of circle - " + (3.14)*r*r);
	}
}
public class Abclass {

	public static void main(String[] args) 
	{
		Shape ob = new Area();
		ob.rectarea(5, 4);
		ob.squarearea(3);
		ob.circlearea(4);
	}

}
