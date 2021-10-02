import java.io.*;
import java.util.List;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

class ProdCon
{
    int nProd;
    int nCon;
    int maxSize;

    private AtomicInteger resource;

    List<Thread> prodList;
    List<Thread> conList;

    ProdCon(int nP, int nC, int size)
    {
        nProd = nP;
        nCon = nC;
        maxSize = size;

        prodList = new ArrayList<Thread>();
        conList = new ArrayList<Thread>();
        resource = new AtomicInteger(1);
    }

    private class Producer implements Runnable 
    {
        public void run()
        {
            while (true)
            {
                int units = (int)(Math.random() * maxSize);
                int newAmount = 0;
                synchronized(this)
                {
                    newAmount = resource.get() + units;
                }

                if (newAmount <= maxSize)
                {
                    System.out.println("Producing...");                    
                    resource.set(newAmount);
                    try
                    {
                        Thread.sleep(1000);
                    }
                    catch (Exception e)
                    {
                        System.out.println("caught...");
                    }
                }
                else
                {
                    System.out.println("Sleeping...");
                    try
                    {
                        Thread.sleep(1000);
                    }
                    catch (Exception e)
                    {
                        System.out.println("caught...");
                    }
                }
            }
        }
    }

    private class Consumer implements Runnable 
    {
        public void run()
        {
            while (true)
            {
                int units = (int)(Math.random() * maxSize);
                int newAmount = 0;
                synchronized (this)
                {
                    newAmount = resource.get() - units;
                }

                if (newAmount >= 0)
                {
                    System.out.println("Consuming...");
                    resource.set(newAmount);
                    try
                    {
                        Thread.sleep(1000);
                    }
                    catch (Exception e)
                    {
                        System.out.println("caught...");
                    }
                }
                else
                {
                    System.out.println("Sleeping...");
                    try
                    {
                        Thread.sleep(1000);
                    }
                    catch (Exception e)
                    {
                        System.out.println("caught...");
                    }
                } 
            }          
        }
    }

    void execute() throws Exception
    {
        // create the threads
        for (int i = 0; i < nProd; ++i)
            prodList.add(new Thread(new Producer()));

        for (int i = 0; i < nProd; ++i)
            conList.add(new Thread(new Consumer()));

        // start the threads
        for (int i = 0; i < nProd; ++i)
            prodList.get(i).start();

        for (int i = 0; i < nProd; ++i)
            conList.get(i).start();

        // join the threads
        for (int i = 0; i < nProd; ++i)
            prodList.get(i).join();

        for (int i = 0; i < nProd; ++i)
            conList.get(i).join();
    }    
}

class Runner
{
    public static void main(String[] args) throws Exception
    {
        int nProd = 5, nCon = 6, max = 20;
        System.out.println("Creating producer and consumer...");
        ProdCon pc = new ProdCon(nProd, nCon, max);
        pc.execute();
    }
}