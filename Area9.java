

abstract class Shape
{
	double d1,d2,b;
	Shape(double a,double b)
	{
		d1=a;
		d2=b;
	}
	Shape(double a)
	{
		b=a;
	}
	abstract void printArea();
	
}
class Rectangle extends Shape
{
	Rectangle(double x,double y)
	{
		super(x,y);
	}
	void printArea()
	{
		System.out.println("Area of rectangle is:"+d1*d2);
	}
}
class Triangle extends Shape
{
	Triangle(double x,double y)
	{
		super(x,y);
	}
	void printArea()
	{
		System.out.println("Area of triangle is:"+(0.5*d1*d2));

	}
}
class Circle extends Shape
{
	Circle(double p)
	{
		super(p);
	}
	void printArea()
	{
		System.out.println("Area of circle is:"+(3.14*b*b));

	}
}
public class Area9 {

	public static void main(String[] args) {
		Rectangle r=new Rectangle(2,3);
		r.printArea();
		Triangle t=new Triangle(5,6);
		t.printArea();
		Circle c=new Circle(6);
		c.printArea();
		
	}
}

		

	


