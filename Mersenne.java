// The following code checks if a prime number is a Mersenne prime or not. A Mersenne prime is of the form M = (2^N) - 1 where M is a prime number and N is a positive integer.

import java.util.*;

class PrimeCheck

{
	int m, t=0, p=1, flag=0;
	
        public void input()
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter a prime number.");
		m=in.nextInt();
	}

	public void isMersenne()
	{
		while( p <= m)
		{
			t=(int)Math.pow(2,p);
			if(t==(m+1))
			{
				System.out.println("Number is a Mersenne Prime.");
				flag=1;
				break;
			}
			p++;
		}
		if(flag!=1)
		{
			System.out.println("Number is not a Mersenne Prime.");

		}
	}
}
	
		

class Mersenne

{
	public static void main(String[] args)
	{
		PrimeCheck prime=new PrimeCheck();
		prime.input();
		prime.isMersenne();
				
	}
}
