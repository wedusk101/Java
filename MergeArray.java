/*The following code takes as input two integer arrays sorted in ascending order and merges them into
a third sorted array.*/ 

import java.util.Scanner;
class MergeArray
{
	public static void main(String args[])
	{
		int first_size = 0, second_size = 0, i = 0, j = 0, k = 0, pos = 0; // the value of entry is either 1 or 2
		System.out.println("How many elements would you like on your first array?");
		Scanner in = new Scanner(System.in);
		first_size = in.nextInt();
		System.out.println("How many elements would you like on your second array?");
		second_size = in.nextInt();
		int first_array[] = new int[first_size];
		int second_array[] = new int[second_size];
		int result_array[] = new int[first_size + second_size];
		System.out.println("Please enter " + first_size +" elements for the first array in ascending order.");
		for( i = 0; i < first_size; i++)
		{
			first_array[i] = in.nextInt();
		}
		System.out.println("Please enter " + second_size +" elements for the second array in ascending order.");
		for( i = 0; i < second_size; i++)
		{
			second_array[i] = in.nextInt();
		}
		i = 0;
		while( i < first_size && j < second_size)
		{
			if(first_array[i] < second_array[j])
			{
				result_array[k] = first_array[i];
				i++;
			}
			else 
			{
				result_array[k] = second_array[j];
				j++;
			}
			k++;			
		}
		if(i < first_size)
		{
			for(pos = i; pos < first_size; pos++)
			{
				result_array[k] = first_array[pos];
				k++;
			}
		}
		else
		{
			for(pos = j; pos < second_size; pos++)
			{
				result_array[k] = second_array[pos];
				k++;
			}
		}
		System.out.print("The merged array in ascending order is");
		for(i = 0; i < result_array.length; i++)
		{
			System.out.print(" " + result_array[i]);
		}
		System.out.println(".");
		in.close();
	}
}