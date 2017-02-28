import java.util.Scanner;
class StrStats
{
	public static void main(String args[])
	{
		int i = 0, upper = 0, lower = 0, digit = 0, spc = 0;
		String input = "";
		System.out.println("Please enter a string.");
		Scanner in = new Scanner(System.in);
		input = in.nextLine();
		for(i = 0; i < input.length(); i++)
		{
			if(Character.isUpperCase(input.charAt(i)))
				upper++;
			else if(Character.isLowerCase(input.charAt(i)))
				lower++;
			else if(Character.isDigit(input.charAt(i)))
				digit++;
			else if(input.charAt(i) == ' ')
				spc++;
		}
		System.out.println("The number of uppercase characters is " + upper +".");
		System.out.println("The number of lowercase characters is " + lower +".");
		System.out.println("The number of digits is " + digit +".");
		System.out.println("The number of whitespaces is " + spc +".");
		in.close();	
	}
}