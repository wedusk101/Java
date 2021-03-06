/* The following code takes as input a string and displays those words which have
odd number of letters in them.*/

import java.util.Scanner;
class OddString 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a string.");
		String input = sc.nextLine();
		String word = "";
		char ch = ' ';
		int len = input.length(), i = 0, word_len = 0;
		System.out.println("The word(s) with odd number of letters:");
		for(i = 0; i < len; i++)
		{
			ch = input.charAt(i);
			if(ch != ' ' && ch != '.') // whitespace or periods are used as delimiters
			{
				word = word + ch;
			}
			else
			{
				word_len = word.length();
				if(word_len % 2 != 0)
				{
					System.out.println(word);
				}
				word = ""; // the temporary string is reset for the next word
			}
		}
		sc.close();
	}		
}