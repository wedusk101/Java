/*The following program uses multithreading in Java to print the words "Ping" and "Pong" in the console 
at random distances every second.*/
import java.util.Random;

class RandPrintPing implements Runnable
{
	Random r = new Random();
	
	public void run()
	{
		ping();		
	}
	
	public void ping()
	{
		try
		{
			System.out.print("Ping");
			for(int i = 0; i <= r.nextInt(50); i++)
			{
				System.out.print(" ");
			}
			Thread.sleep(1000);
		}
		catch(InterruptedException ex)
		{
			ex.printStackTrace();
		}
	}
}

class RandPrintPong implements Runnable
{
	Random r = new Random();
	
	public void run()
	{
		pong();		
	}
	
	public void pong()
	{
		try
		{
			System.out.print("Pong");
			for(int i = 0; i <= r.nextInt(30); i++)
			{
				System.out.print(" ");
			}
			Thread.sleep(1000);
		}
		catch(InterruptedException ex)
		{
			ex.printStackTrace();
		}
	}
}

class PingPong
{
	public static void main(String[] args)
	{
		Runnable r1 = new RandPrintPing();
		Runnable r2 = new RandPrintPong();
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		while(true)
		{
			t1.run();
			t2.run();
		}
	}
}