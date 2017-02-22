import java.util.Scanner;
class CalCircle
{
	public static void main(String args[])
	{
		double radius = 0.0, area = 0.0, circum = 0.0;
		System.out.println("Please enter the radius of the circle");
		Scanner input = new Scanner(System.in);
		radius = input.nextDouble();
		area = 3.14159 * Math.pow(radius, 2);
		circum = 2 * 3.14159 * radius;
		System.out.println("The area of the circle is " + area + " square units.");
		System.out.println("The circumference is " + circum + " units.");
		input.close();
	}
}