import java.util.Scanner;
class TriCheck
{
	public static void main(String args[])
	{
		double first_side = 0.0, second_side = 0.0, third_side = 0.0;	
		System.out.println("Please enter three positive integers.");
        	Scanner input = new Scanner(System.in);
		first_side = input.nextDouble();
		second_side = input.nextDouble();
		third_side = input.nextDouble();
		if(first_side + second_side >= third_side && second_side + third_side >= first_side && first_side + third_side >= second_side)
		{
			System.out.println("The three integers make up a triangle.");
			if(first_side == second_side || second_side == third_side || third_side == first_side)
			{
				System.out.println("The triangle is an isosceles triangle.");
			}
			else if(first_side == second_side && second_side == third_side)
			{
				System.out.println("The triangle is an equilateral triangle.");
			}
			else if(Math.pow(first_side, 2) + Math.pow(second_side, 2) == Math.pow(third_side, 2) || Math.pow(second_side, 2) + Math.pow(third_side, 2) == Math.pow(first_side, 2) || Math.pow(first_side, 2) + Math.pow(third_side, 2) == Math.pow(second_side, 2))
			{
				System.out.println("The triangle is a right-angled triangle.");
			}
		}
		else
			System.out.println("The three integers do not form a triangle.");
		input.close();
	}
}
		
		
		
	
