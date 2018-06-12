
public class CovariantReturn extends Base {
	SuperA getObject() {
		System.out.println("covariantreturn");
		return new SupB();
	}
	
	public static void main(String[]args) {
		CovariantReturn tst=new CovariantReturn();
		System.out.println(tst.getObject() instanceof SupB);
		System.out.println(tst.getObject().x);
	}

}
