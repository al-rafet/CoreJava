
public class InstanceCounter {

	static {
		System.out.println("InstanceCounter Loading....");
	}
	static final long one_daY_in_mill=24*60*60*1000; 
	
	 int counter;
	
	static {
		System.out.println("One day in millisecond="+one_daY_in_mill+" InstanceCounter="+new InstanceCounter().counter);
	}
	
	{
		counter++;
		System.out.println("InstanceCounter="+counter);
	}
	public static void main(String[]args) {
		
		new InstanceCounter();
		new InstanceCounter();
		new InstanceCounter();
		
		System.out.println("Instance counter in main="+new InstanceCounter().counter);
		
	}
	
}
