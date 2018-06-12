
public class ExceptionBasic {
     public static void main(String[]args) {
    	 int d=10;
    	 int x=0;
    	 try
    	 {//int q=d/x;
    	 int a[]=new int[10];
    	 System.out.println("Accessing elemtn here--"+a[11]);
    	 }
    	 catch(ArithmeticException e) {
    		 System.out.println("Exception thrown"+e);
    		 //e.printStackTrace();
    	 }
    	 catch(ArrayIndexOutOfBoundsException e) {
    		 e.printStackTrace();
    	 }finally {
    		 System.out.println("Out of block");
    	 }
    	 
     }
}
