/* The following code implements multiple inheritance using the interface feature in Java.
Over here, a class "Osprey" is created that models the behavior of the real life V-22 Osprey aircraft
which is a hybrid of a plane and a helicopter.The "chopper" interface declares two methods that
describe two properties of a helicopter; its ability to take off vertically and the presence of rotors.
The "airplane" class describes an airplane with its two data members, "wingspan" and "maxRange" and
the method usesRunway().The derived class "Osprey" integrates all these features just like its
real life counterpart. */

import java.util.Scanner;
interface Chopper
{
	void hasRotors();
	void doesVtol();
}

class Airplane
{
	int wingspan;
	int maxRange;
	
	public Airplane(int wingspan, int maxRange)
	{
		this.wingspan = wingspan;
		this.maxRange = maxRange;
	}
	
	void usesRunway()
	{
		System.out.println("This airplane uses a runway.");
	}
	
	void showDetails()
	{
		System.out.println("The wingspan of this aircraft is " + wingspan + " meters.");
		System.out.println("The range of this aircraft is " + maxRange + " kilometers.");
	}
}

class Osprey extends Airplane implements Chopper
{
	int rotorDiameter;
	
	public Osprey(int wingspan, int maxRange, int rotorDiameter)
	{
		super(wingspan, maxRange); // calls the Airplane constructor
		this.rotorDiameter = rotorDiameter;		
	}
	
	public void hasRotors() // defines the abstract method from the Chopper interface
	{
		System.out.println("This aircraft has rotors like a helicopter.");
	}
	
	public void doesVtol() // defines the abstract method from the Chopper interface 
	{
		System.out.println("This aircraft can also perform vertical take-off and landing.");
	}
	
	void showDetails()
	{
		hasRotors();
		doesVtol();
		usesRunway();
		System.out.println("The wingspan of this plane is " + wingspan + " meters.");
		System.out.println("The range of this aircraft is " + maxRange + " kilometers.");
	}	
}

class Hybrid // drives the program
{
	public static void main(String args[])
	{
		int wingspan = 0, maxRange = 0, rotorDiameter = 0;
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter the wingspan of a V-22 Osprey aircraft in meters.");
		wingspan = in.nextInt();
		System.out.println("Please enter the rotor diameter of a V-22 Osprey aircraft in meters.");
		rotorDiameter = in.nextInt();
		System.out.println("Please enter the maximum operational range in kilometers.");
		maxRange = in.nextInt();
		System.out.println("Here are your details.");
		Osprey os = new Osprey(wingspan, maxRange, rotorDiameter); // creates an object of the derived class
		os.showDetails();
		in.close();
	}
} // end