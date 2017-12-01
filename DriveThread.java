class ThreadOne extends Thread
{
	public void run()
	{
		for(int i = 1; ; i++)
		System.out.println("Thread 1: " + i + "\n");
	}
}

class ThreadTwo extends Thread
{
	public void run()
	{
		for(int i = 1;; i++)
		System.out.println("Thread 2: " + i + "\n");
	}	
}

class ThreadThree extends Thread
{
	public void run()
	{
		for(int i = 1; ; i++)
		System.out.println("Thread 3: " + i + "\n");
	}
}

class ThreadFour extends Thread
{
	public void run()
	{
		for(int i = 1;; i++)
		System.out.println("Thread 4: " + i + "\n");
	}	
}

class DriveThread
{
	public static void main(String args[])
	{
		ThreadOne t1 = new ThreadOne();
		ThreadTwo t2 = new ThreadTwo();
		ThreadThree t3 = new ThreadThree();
		ThreadFour t4 = new ThreadFour();
		t1.start();
		timeDelay(2000);
		t2.start();
		timeDelay(2000);
		t3.start();
		timeDelay(2000);
		t4.start();
		timeDelay(2000);
	}

	public static void timeDelay(long t)
	{
		try
		{
			Thread.sleep(t);
		}
		catch(InterruptedException e){}
	}
}

