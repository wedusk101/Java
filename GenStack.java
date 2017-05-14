import java.util.Stack;
import java.util.Scanner;

class CreateStack
{
	Stack<Integer> s = new Stack<>();
	
	void showPush(int x)
	{
		s.push(x);
		System.out.println("Element has been pushed succesfully.");
	}
	
	void showPop()
	{
		int x = s.pop();
		System.out.println("The popped element is " + x + ".");
	}
	
	void showPeek()
	{
		int x = s.peek();
		System.out.println("The top element is " + x + ".");
	}
	
}

public class GenStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int val = 0;
		Scanner in = new Scanner(System.in);
		CreateStack st = new CreateStack();
		System.out.println("Please enter four numbers.");
		for(int i = 0; i < 4; i++)
		{
			val = in.nextInt();
			st.showPush(val);
		}
		st.showPeek();
		System.out.println("Popping...");
		for(int i = 0; i < 4; i++)
		{
			st.showPop();
		}
		in.close();
	}
}
		
		
		

