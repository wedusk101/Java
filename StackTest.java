import java.util.*;

class StackTest
{
	static void showpush(Stack s, int x)
	{
		s.push(x);
	}	
	
	static void showpop(Stack s)
	{
		s.pop();
	}
	
	public static void main(String[] args)
	{
		int val = 0, i = 0;
		Stack s = new Stack(5);
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter five elements one by one, to push into the stack.");
		for(i = 0; i < 5; i++)
		{
			val = in.nextInt();
			showpush(s, val);
		}
		System.out.println("Popping...");
		for(i = 0; i < 5; i++)
		{
			showpop(s);
		}
		in.close();		
	}
}