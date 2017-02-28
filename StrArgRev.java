/*The following code takes a string as a command line argument, reverses it 
and prints it.*/

class StrArgRev
{
	public static void main(String args[])
	{
		StringBuilder str = new StringBuilder(args[0]); // creates StringBuilder object
		System.out.println(str.reverse()); // calls the reverse() method on the created object
	}
}