import java.util.Scanner;
class MiddleName 
{
	public static void main(String args[])
	{
		System.out.println("Please enter a first name and a last name.");
		Scanner in = new Scanner(System.in);
		String name = in.nextLine();
		int len = name.length();
		System.out.println("Please enter a middle name.");
		String middle = in.nextLine();
		String result = "";
		String first = name.substring(0, name.indexOf(' '));
		String last = name.substring((name.indexOf(' ') + 1), len);
		result = first + " " + middle + " " + last;
		System.out.println(result); // displays the name in the format <first name> <middle name> <last name>
		in.close();
	}
}