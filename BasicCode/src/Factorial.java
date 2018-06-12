
public class Factorial {
	public static void main(String[]args) {
    	final int max=100;
    	for(int i=1;i<max;i++)
    	{
    		System.out.println("Factorial of "+i+" is="+factorial(i));
    	}
    }
	private static int factorial(int n) {
		int result=1;
		for(int i=1;i<=n;i++) {
			result *=i;
		}
		return result;
	}
}
