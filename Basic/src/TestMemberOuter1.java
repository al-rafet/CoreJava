
public class TestMemberOuter1 {

	int data=10;
	
	static class Inner{
		void innerMethod() {
			System.out.println("Data is "+data);
		}
	}
	
//	void display() {
//		Inner in=new Inner();
//		in.innerMethod();
//		
//	}
	
	public static void main(String[]args) {
//		TestMemberOuter1 test=new TestMemberOuter1();
//		test.display();
		Inner in=new Inner();
	
	}
}
