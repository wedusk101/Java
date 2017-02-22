/*The following code solves a set of two linear equations with two unknowns x1 and x2.
The equations are:
			ax1 + bx2 = m
			cx1 + dx2 = n

a, b ,c, d, m & n are constants. x1 and x2 have unique solutions iff (ad - bc) is not equal to zero.*/ 

import java.util.Scanner;
class EqSolver
{
	public static void main(String args[])
	{
		System.out.println("Equations are: ");
		System.out.println("ax1 + bx2 = m");
		System.out.println("cx1 + dx2 = n");
		System.out.println("a, b, c, d, m and n are constants.");
		System.out.println("Please enter the values of the constants in the order given above.");
		double a = 0, b = 0, c = 0, d = 0, m = 0, n = 0;
		Scanner input = new Scanner(System.in);
		a = input.nextDouble();
		b = input.nextDouble();
		c = input.nextDouble();
		d = input.nextDouble();
		m = input.nextDouble();
		n = input.nextDouble();
		if((a * d - b * c) == 0)
			System.out.println("Determinant is zero.No unique solution.");
		else
		{
			System.out.println("x1 = " + ((m * d - b * n)/(a * d - b * c)));
			System.out.println("x2 = " + ((n * a - m * c)/(a * d - b * c)));
		}
		input.close();
	}
}

