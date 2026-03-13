class Alien implements Runnable
{

	@Override
	public void run()
	{
		System.out.println("Task for new thread");
		
	}
	
}
public class LaunchThread9
{
	public static void main(String[] args)
	{
//		Alien al=new Alien();
//		
//		Thread t1=new Thread(al);
		
//		Thread t1=new Thread(new Alien());
//		Runnable run=new Runnable() {
//			public void run()
//			{
//				System.out.println("Task for new Thread");
//			}
//		};
//		Thread t=new Thread(run);
		
//		Runnable run=()-> System.out.println("task for my new thread");
//		Thread t=new Thread(run);
//		t.start();
//		Thread t=new Thread(()->System.out.println("Task for my new thread"));
//		t.start();
		
	 new Thread(()->System.out.println("Task for my new thread 1")).start();
		
		new Thread(()->
		{
			System.out.println("Task for my new thread 2");
			//many statements
		}
		).start();// class obj interface lambda FI multithreading
		

	}

}
