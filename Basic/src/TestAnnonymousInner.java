
public class TestAnnonymousInner {
	public static void main(String[]args) {
         Eatable e=new Eatable() {

			@Override
			public void eat() {
				// TODO Auto-generated method stub
				System.out.println("Eating");
				
			}
        	 
         };
         e.eat();
	}
        
}
