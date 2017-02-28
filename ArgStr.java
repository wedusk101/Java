/*The following code takes a string as a command line argument, reverses it 
and prints it.*/

class ArgStr
{
	public static void main(String args[])
	{
		int i = 0;
		String result = "";
		for(i = args[0].length() - 1; i >= 0; i--)
		{
			result = result + args[0].charAt(i);
		}
		System.out.println(result);		
	}
}