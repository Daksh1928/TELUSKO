
public class LaunchThread8 extends Thread
{
	
	public LaunchThread8(String name)
	{
		super(name);
	}
	
	
	public static void main(String[] args) 
	{
		System.out.println("Main Thread started");
		
		LaunchThread8 t1=new LaunchThread8("MyThread1");//new Thread
		LaunchThread8 t2=new LaunchThread8("MyThread2");// new Thread
//		t1.setName("MyThread1");
//		t2.setName("MyThread2");
		
		t1.start();
		t2.start();
		
		System.out.println("Main Thread completed");
	}
	public void run()
	{
		System.out.println("Task for my new Threads");
	}

}
