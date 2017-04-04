import java.util.Scanner;
class ReportCard
{
	public static void main(String args[])
	{
		int report[][] = new int[3][5];
		int i = 0, j = 0, highest = 0, pos = 0;
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter the roll numbers of the students");
		for( i = 0; i < 3; i++)
		{
			report[i][0] = in.nextInt();
		}
		System.out.println("Please enter the marks for the first subject.");
		for( i = 0; i < 3; i++)
		{
			report[i][1] = in.nextInt();
		}
		System.out.println("Please enter the marks for the second subject.");
		for( i = 0; i < 3; i++)
		{
			report[i][2] = in.nextInt();
		}
		System.out.println("Please enter the marks for the third subject.");
		for( i = 0; i < 3; i++)
		{
			report[i][3] = in.nextInt();
		}
		for(i = 0; i < 3; i++)
		{
			report[i][4] = report[i][1] + report[i][2] + report[i][3];
			System.out.println("The total marks obtained by Roll No. " + report[i][0]+" is "+report[i][4]+".");
		}
		System.out.println("The data entered is as follows:");
		System.out.println("Roll No.  " +"Subject 1  "+"Subject 2  "+"Subject 3  "+"       Total"); 
		for(i = 0; i < 3; i++)
		{
			for(j = 0; j < 5; j++)
			{
				System.out.print(report[i][j]+"           ");
			}
			System.out.println("");
		}
		for(j = 1; j < 4; j++)
		{
			pos = 0;
			highest = report[0][j];
			for(i = 0; i < 3; i++)
			{
				if(report[i][j] > highest)
				{
					highest = report[i][j];
					pos = i;
				}
				else
					continue;
			}
			System.out.println("The highest marks in Subject " + j + " is " +highest+ " secured by Roll No. "+report[pos][0]+".");				
		}
		pos = 0;
		highest = report[0][4];
		for(i = 0; i < 3; i++)
		{
			if(report[i][4] > highest)
			{
				highest = report[i][4];
				pos = i;
			}
			else
				continue;
		}
		System.out.println("Roll No. "+report[pos][0]+" secured the highest total marks of "+highest+".");
		in.close();
	}
}
				