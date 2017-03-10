class TestString
{
	public static void main(String args[])
	{
		StringBuffer buffer = new StringBuffer("Hello,");
		System.out.println(buffer + " World!");
		StringBuilder firstname = new StringBuilder("John ");
		String lastname = "Smith";
		String result = firstname.append(lastname).toString();
		System.out.println(result);
	}
}