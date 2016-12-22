import java.util.*;

public class Salary
{
	public static void main(String[] args)
	{
		double basic = 0.0, da = 0.35, hra = 0.12, pf = 0.0, net = 0.0; 
		System.out.println("Please enter the name of the employee.");
		Scanner name = new Scanner(System.in);
        String emp_name = name.nextLine();
		System.out.println("Please enter the basic of the salary in INR.");
		Scanner input = new Scanner(System.in);
		basic = input.nextDouble();
		if((0.08 * basic) < 30000.00)
		{
			pf = 0.08 * basic;
		}
		else
		{
			pf = 30000.00;
		}
		net = basic + (da * basic) + (hra * basic) - pf;
		System.out.println("The employee details are as follows: ");
		System.out.println("Name: " + emp_name);
		System.out.println("Basic: " + basic);
		System.out.println("DA: " + (da * basic));
		System.out.println("HRA: " + (hra * basic));
		System.out.println("PF: " + pf);
		System.out.println("Net: " + net);
		System.out.println("Thank you!");
	}
}	
	 

