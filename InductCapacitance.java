/*

The formula below is used to calculate the damped natural frequency of 
an inductance capacitance circuit where L is the inductance, C is the capacitance
and R is the resistance.

		F = sqrt[(1/LC) - (R^2/4C^2)]
*/

import java.util.Scanner;
class InductCapacitance
{
	public static void main(String args[])
	{
		System.out.println("F = sqrt[(1/LC) - (R^2/4C^2)]");
		System.out.println("F is the damped natural frequency.");
		System.out.println("L is the inductance, C is the capacitance and R is the resistance.");
		double l = 0.0, c = 0.01, r = 0.0, rsq = 0.0, csq = 0.0, f = 0.0;
		System.out.println("Please enter the inductance in Henrys.");
		Scanner input = new Scanner(System.in);
		l = input.nextDouble();
		System.out.println("Please enter the capacitance in Farads.");
		c = input.nextDouble();
		System.out.println("Please enter the resitance in Ohms.");
		r = input.nextDouble();
		System.out.println("The table of frequencies in Hertz with the capacitance varying from 0.01 Farad through 0.1 Farad in steps of 0.01 Farad are:");
		for(c = 0.01; c <= 0.1; c += 0.01)
		{
			rsq = Math.pow(r, 2);
			csq = Math.pow(c, 2);
			f = (1 / l * c) - Math.pow(r, 2)/(4 * Math.pow(c, 2));
			if( f < 0)
				f = f * -1;
			System.out.println(Math.sqrt(f));
		}
		input.close();
	}
}

	

 