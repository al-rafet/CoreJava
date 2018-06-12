import java.util.Date;

public class ConstructureExample {
	double d;
	Date date=new Date();
   String s="rafet is a programmer";
  
  
  public ConstructureExample(String s ) {
	//super();
	//this.d = d;
	//this.date = date;
	  this.s=s;
}


public static void main(String[]args) {
	  ConstructureExample obj=new ConstructureExample("I should");
	  System.out.println(obj.d);
	  System.out.println(obj.date);
	  System.out.println(obj.s);
	  
  }
  
}
