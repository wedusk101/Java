import java.util.Scanner;
class FibGen
{
	public static void main(String args[])
	{
		int range = 0, i = 0;
		System.out.println("Please enter the number of terms of the Fibonacci sequence to display.");
		Scanner input = new Scanner(System.in);
		range = input.nextInt();
		System.out.print("The terms are 0 1 ");
		FibGen ob = new FibGen();
		for(i = 0; i < range - 2; i++)
		{
			System.out.print(ob.printFib(i) + " ");
		}
		System.out.print(".");
		input.close();
	}

	int printFib(int term)
	{
		int result = 1;
		if(term > 0)
		{
			result = printFib(term - 1) + printFib(term - 2);
		}
		return result;
	}
}


