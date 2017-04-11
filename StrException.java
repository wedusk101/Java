import java.util.Scanner;

class NoMatchFoundException extends Exception
{
	private static final long serialVersionUID = 1L;

	public void inputMismatchFailure()
	{
		System.out.println("Matching string not found!");
	}
}

public class StrException
{
	public static void main(String[] args)
	{
		String db = "University";
		String key;
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a string.");
		key = input.nextLine();
		try
		{
			if(!key.equals(db))
				throw new NoMatchFoundException();
			else
				System.out.println("Match Found!");
		}
		catch(NoMatchFoundException nmfe)
		{
			System.out.println(nmfe);
			nmfe.inputMismatchFailure();
		}
		finally // Scanner closed after try/catch block
		{
			input.close();
		}
	}

}
