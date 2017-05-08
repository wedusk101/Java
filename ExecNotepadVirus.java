/*The following program mimics a malicious program by invoking the notepad application
in Windows continuously as long as it runs.*/

import java.io.*;

class ExecNotepadVirus
{
	public static void main(String[] args)throws InterruptedException, IOException
	{
		while(true)
		{
			try{
				Process p = Runtime.getRuntime().exec("notepad.exe");
				p.waitFor(); // this line makes sure a new process is spawned only after the previous one is closed
				Thread.sleep(2000); // commenting out or removing the p.waitfor() function call can / will cause the system to hang
			}
			catch(Exception e)
			{
				e.printStackTrace();
				System.exit(1);
			}
		}
	}
}