class Quadrilateral
{
	double x1, y1, x2, y2, x3, y3, x4, y4;
	double side1, side2, diag, side3, side4;
	double semiperi1, semiperi2;
	
	public Quadrilateral(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4)
	{
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
		this.x3 = x3;
		this.y3 = y3;
		this.x4 = x4;
		this.y4 = y4;
	}
	
	void calcSide()
	{
		side1 = Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2));
		side2 = Math.sqrt(Math.pow((x2 - x3), 2) + Math.pow((y2 - y3), 2));
		side3 = Math.sqrt(Math.pow((x3 - x4), 2) + Math.pow((y3 - y4), 2));
		side4 = Math.sqrt(Math.pow((x4 - x1), 2) + Math.pow((y4 - y1), 2));
		diag = Math.sqrt(Math.pow((x1 - x3), 2) + Math.pow((y1 - y3), 2));
	}
	
	double calcArea() // calculates the area for a generic quadrilateral using Heron's formula
	{
		calcSide();
		semiperi1 = (side1 + side2 + diag) / 2;
		semiperi2 = (side3 + side4 + diag) / 2;
		return Math.sqrt(semiperi1 * (semiperi1 - side1) * (semiperi1 - side2) * (semiperi2 - diag)) + Math.sqrt(semiperi2 * (semiperi2 - side3) * (semiperi2 - side4) * (semiperi2 - diag));
	}
	
	void displayArea()
	{
		System.out.println("This is a dummy quadrilateral.");
	}
}

class Trapezoid extends Quadrilateral
{
	public Trapezoid(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4)
	{
		super(x1, y1, x2, y2, x3, y3, x4, y4);
	}
			
	void displayArea()
	{
		System.out.println("The area of the trapezoid is " + calcArea() + " square units.");
	}
}

class Parallelogram extends Quadrilateral
{
	public Parallelogram(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4)
	{
		super(x1, y1, x2, y2, x3, y3, x4, y4);
	}
	
	void calcSide() // overrides the calcSide() method from the base class
	{
		side1 = Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2));
		side2 = Math.sqrt(Math.pow((x2 - x3), 2) + Math.pow((y2 - y3), 2));
		side3 = Math.sqrt(Math.pow((x3 - x4), 2) + Math.pow((y3 - y4), 2));
		side4 = Math.sqrt(Math.pow((x4 - x1), 2) + Math.pow((y4 - y1), 2));
		diag = Math.sqrt(Math.pow((x1 - x3), 2) + Math.pow((y1 - y3), 2));
	}
	
	double calcArea() // overrides the calcArea() method from the base class
	{
		calcSide();
		semiperi1 = (side1 + side2 + diag) / 2;
		semiperi2 = (side3 + side4 + diag) / 2;
		return Math.sqrt(semiperi1 * (semiperi1 - side1) * (semiperi1 - side2) * (semiperi2 - diag)) + Math.sqrt(semiperi2 * (semiperi2 - side3) * (semiperi2 - side4) * (semiperi2 - diag));
	}
	
	void displayArea()
	{
		System.out.println("The area of the parallelogram is " + calcArea() + " square units.");
	}
	
}

class Rectangle extends Quadrilateral
{
	public Rectangle(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4)
	{
		super(x1, y1, x2, y2, x3, y3, x4, y4);
	}
	
	void calcSide() // overrides the calcSide() method from the base class
	{
		side1 = Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2));
		side2 = Math.sqrt(Math.pow((x2 - x3), 2) + Math.pow((y2 - y3), 2));
	}
	
	double calcArea() // overrides the calcArea() method from the base class
	{
		calcSide();
		return side1 * side2;
	}
	
	void displayArea()
	{
		System.out.println("The area of the rectangle is " + calcArea() + " square units.");
	}
}

class Square extends Rectangle
{
	public Square(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4)
	{
		super(x1, y1, x2, y2, x3, y3, x4, y4);
	}
	
	double calcArea() // overrides the calcArea() method from the base class
	{
		calcSide();
		return side1 * side2;
	}
	
	void displayArea()
	{
		System.out.println("The area of the square is " + calcArea() + " square units.");
	}	
}


public class QuadGen
{
	public static void main(String args[])// The values for the functions could also be taken as user input
	{
		//double xc1 = 0.0, yc1 = 0.0, xc2 = 0.0, yc2 = 0.0, xc3 = 0.0, yc3 = 0.0, xc4 = 0.0, yc4 = 0.0;
		Quadrilateral quad = new Quadrilateral(2, 2 , 4, 2, 4, 4, 2, 4);
		Trapezoid trap = new Trapezoid(2, 2 , 4, 2, 4, 4, 2, 4);
		Parallelogram para = new Parallelogram(2, 2 , 4, 2, 4, 4, 2, 4);
		Rectangle rect = new Rectangle(2, 2 , 4, 2, 4, 4, 2, 4);
		Square sq = new Square(2, 2 , 4, 2, 4, 4, 2, 4);
		quad.displayArea();
		trap.displayArea();
		para.displayArea();
		rect.displayArea();
		sq.displayArea();
		System.out.println("Thank You.");
	}
} // end
