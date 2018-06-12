
public class SimpleString {
  public static void main(String[]args) {
	  String s1=new String("YES");
	  String s="Y";
	  //String s1=s+"ES";
	  String s2=new String("YES");
	  s1=s2;
	  if(s1==s2)
	  {
		  System.out.println("== operator checks object reference");
	  }
	  else {
		  System.out.println("S1 and S2 are not same object");
	  }
	  
	  System.out.println();
	  if(s1.equals(s2))
	  {
		  System.out.println("equal() method check value");
	  }
	  else {
		  System.out.println("S1 and S2 are different value");
	  }
	  
  }
}
