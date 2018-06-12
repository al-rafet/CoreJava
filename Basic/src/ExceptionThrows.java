import java.util.Scanner;

public class ExceptionThrows {
	
	static void validate(int age) throws ClassNotFoundException {
		if(age<18)
			//throw new ArithmeticException("not allowed");
			throw new ClassNotFoundException("not allowed");
		else
			System.out.println("You are welcome");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter your age--");
		Scanner sc=new Scanner(System.in);
		int age=sc.nextInt();
		try {
			validate(age);
			
			
         }catch(ClassNotFoundException e) {
        	 System.out.println(e);
         }
		//catch(ArithmeticException e){
//			e.printStackTrace();
//		}

	}

}
