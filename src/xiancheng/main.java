package xiancheng;
class xc extends Thread 
{
public void run()
{
System.out.println("This is a thread");	
}
}

public class main {
	public static void main(String[] args)
	{
	xc win=new xc();
		win.start();
		System.out.println("this is zzz");	
		
	}
}
