/*This program implements two stacks and allows performing basic 
push and pop operations on them.*/

import java.util.Scanner;
class Stack
{
	private int size;
	private int top;
	private int stk[];
	
	public Stack(int size)
	{
		this.size = size;
		top = -1;
		stk = new int[size];
	}
		
	void push(int item)
	{
		if(top == size - 1)
		{
			System.out.println("Stack Overflow! Cannot push into a full stack.");
			return;
		}
		else
		{
			top += 1;
			stk[top] = item;
			System.out.println("Element has been pushed into the stack successfully.");
		}
	}
	
	void pop()
	{
		int pop = 0;
		if(top == -1)
		{
			System.out.println("Stack Underflow! Cannot pop from an empty stack.");
			return;
		}
		else
		{
			pop = stk[top];
			top -= 1;	
			System.out.println("Popped element is " + pop + ".");
		}		
	}
}

class RunStack
{
	public static void main(String args[])
	{
		int len1 = 0, len2 = 0, ch = 0, val = 0;
		System.out.println("How many elements would you like to have on your first stack?");
		Scanner in = new Scanner(System.in);
		len1 = in.nextInt();
		Stack s1 = new Stack(len1);
		System.out.println("How many elements would you like to have on your second stack?");
		len2 = in.nextInt();
		Stack s2 = new Stack(len2);
		do
		{
			System.out.println("Please enter your choice.");
			System.out.println("1.Push into first stack.");
			System.out.println("2.Pop from first stack.");
			System.out.println("3.Push into second stack.");
			System.out.println("4.Pop from second stack.");
			System.out.println("5.Exit");
			ch = in.nextInt();
			switch(ch)
			{
				case 1:
						System.out.println("Please enter the element to push.");
						val = in.nextInt();
						s1.push(val);
						break;
				
				case 2:
						s1.pop();
						break;
						
				case 3:
						System.out.println("Please enter the element to push.");
						val = in.nextInt();
						s2.push(val);
						break;
						
				case 4:				
						s2.pop();
						break;						
						
				case 5:	
						System.out.println("Thank you.");
						break;
				
				default:
						System.out.println("Invalid choice! Try again.");
			}
		}while(ch != 5);
		in.close();
	}
}