/*This program implements the inheritance feature of Java.*/

class Vehicle // Generic Vehicle Class
{
	protected int regNumber, speed;
	protected String color, ownerName;
	
	public Vehicle(int regNumber, int speed, String color, String ownerName)
	{
		this.regNumber = regNumber;
		this.speed = speed;
		this.color = color;
		this.ownerName = ownerName;		
	}
	
	void showData()
	{
		System.out.println("This is a vehicle class.");
	}
}

class Bus extends Vehicle 
{
	private String routeNumber;
	
	public Bus(int regNumber, int speed, String color, String ownerName, String routeNumber)
	{
		super(regNumber, speed, color, ownerName); // calls the constructor of the super class
		this.routeNumber = routeNumber; // specific derived class data member
	}

	void showData()
	{
		System.out.println("The registration number is " + regNumber + ".");
		System.out.println("The top speed of the vehicle is " + speed + ".");
		System.out.println("The color is " + color + ".");
		System.out.println("The owner is " + ownerName + ".");
		System.out.println("The route number is " + routeNumber + ".");
	}
}

class Car extends Vehicle
{
	private String manufacturerName;
	
	public Car(int regNumber, int speed, String color, String ownerName, String manufacturerName)
	{
		super(regNumber, speed, color, ownerName); // calls the constuctor of the super class
		this.manufacturerName = manufacturerName; // specific derived class data member
	}

	void showData()
	{
		System.out.println("The registration number is " + regNumber + ".");
		System.out.println("The top speed of the vehicle is " + speed + ".");
		System.out.println("The color is " + color + ".");
		System.out.println("The owner is " + ownerName + ".");
		System.out.println("The manufacturer is " + manufacturerName + ".");
	}
}
	
class Automobile // driver class
{
	public static void main(String args[])
	{
		Vehicle v = new Vehicle(1024, 140, "Red", "John Smith"); // object for the generic vehicle class
		Bus b = new Bus(4096, 120, "White", "Thomas Parsons", "3020B"); // object for the inherited bus class 
		Car c = new Car(8192, 180, "Black", "David Williams", "Honda" ); // object for the inherited car class
		System.out.println("Generic Vehicle Class ------>\n");
		v.showData();
		System.out.println("\nBus Class ------>\n");
		b.showData();
		System.out.println("\nCar Class ------>\n");
		c.showData();
	}	
}// end