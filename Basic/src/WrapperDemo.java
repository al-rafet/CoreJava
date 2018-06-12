
public class WrapperDemo {
       public static void main(String[]args) {
    	   Integer intObj1=new Integer("55");
    	   Integer intObj2=new Integer("25");
    	   Integer intObj3=new Integer(34);
    	   boolean i=intObj1.equals(intObj2);
    	   System.out.println("i="+i);
    	   
    	   
    	   Float f1=new Float(2.2f);
    	   Float f2=new Float("4.2f");
    	   
    	   int ij=Float.compare(f1, f2);
    	   System.out.println("ij="+ij);
    	   
    	   Float f=intObj1.floatValue()+f2;
    	   System.out.println("f="+f);
    	   
    	   
       }
}
