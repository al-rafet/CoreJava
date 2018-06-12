import java.util.Scanner;

public class PrimitiveCastExample {
	public static void main(String []args) {
		/*  //any type to string
             String s;
             System.out.println("Enter something--");
             Scanner sc=new Scanner(System.in);
             s=sc.nextLine();
             System.out.println(s);
         //int to string
             int i;
             sc=new Scanner(System.in);
             i=sc.nextInt();
             String st=Integer.toString(i);
             System.out.println("Int to String--"+st);
             */
           //String to Double
          String st2="100";
          Double db=Double.valueOf(st2);
          System.out.println("String to double--"+db);
	}
}
