
public class TheRefEx {
	int i;
	String ss;
	
	/*public TheRefEx(int i,String ss) {
		this.i=i;
		this.ss=ss;
	}*/
 
  public static void main(String[]args) {
	 new TheRefEx().doYY();
	  
  }
  void doYY() {
	  RecRef rr=new RecRef();
	  rr.doXX(this);
  }
  void sum(int a,int b) {
	  System.out.println("Sum oof two integer is "+(a+b));
  }
}

class RecRef{
	
	void doXX(TheRefEx xx) {
		xx.sum(109, 207);
		
	}
}
