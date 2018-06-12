import java.util.Scanner;

public class Bitwise {
	static int l=10;
	public int And(int a,int b) {
		return a^b;
	}
	public static void main(String[]args) {
		Bitwise bw=new Bitwise();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two integer-");
		int x=sc.nextInt();
		int y=sc.nextInt();
		
		System.out.print(bw.And(x, y));
		
		System.out.print(l);
	}

}
