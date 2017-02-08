import java.util.Scanner;
class Palindrome
{
	public static void main(String args[])
	{
		int number = 0;
		System.out.println("Please enter a number to check if it is a palindrome.");
		Scanner in = new Scanner(System.in);
		number = in.nextInt();
		Palindrome pal = new Palindrome();
		pal.checkPal(number);
		in.close();
	}
	
	void checkPal(int input)
	{
		int rev = 0, digit = 0, bak = 0;
		bak = input;
		while(input > 0)
		{
			digit = input % 10;
			rev = rev * 10 + digit;
			input = input / 10;
		}
		if(rev == bak)
			System.out.println("Number is a palindrome.");
		else
			System.out.println("Number is not a palindrome.");
	}
}