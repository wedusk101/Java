import java.util.Scanner;
class IllegalArgumentException extends Exception
{
	private static final long serialVersionUID = 1L; // IDE generated unified identifier

	public void printOverflowError()
	{
		System.out.println("Result will overflow!");
	}
	
	public void printInvalidArgumentError()
	{
		System.out.println("Value of x must be positive!");
	}
}

public class FactException
{
	public static void main(String[] args)
	{
		long fact[] = new long[10];
		int i = 1, x = 0, fct = 1;
		System.out.println("Please enter an integer.");
		Scanner in = new Scanner(System.in);
		x = in.nextInt();
		if(x < 0)
		{
			try
			{
				IllegalArgumentException iae = new IllegalArgumentException();
				throw iae;				
			}
			catch(IllegalArgumentException iae)
			{
				System.out.println(iae);
				iae.printInvalidArgumentError();
			}
		}
		else if(x > 20)
		{
			try
			{
				IllegalArgumentException iae = new IllegalArgumentException();
				throw iae;				
			}
			catch(IllegalArgumentException iae)
			{
				System.out.println(iae);
				iae.printOverflowError();
			}
		}
		else
		{
			for(i = 1; i <= x; i++)
			{
				fct = fct * i;
			}
			fact[0] = fct;
			System.out.println("Result is " + fact[0] + ".");
		}
		in.close();
	}
}
		
		
		

