
public class ValuOf {
           public static void main(String[]args) {
        	   //Integer intwrapper=new Integer("1122");
        	   Integer intwrapper1=Integer.valueOf("1122");
        	   Integer intwrapper2=Integer.valueOf("10111",2);
        	   Integer intwrapper3=Integer.valueOf("1D",16);
        	   
        	   System.out.println("value of intwrapper="+intwrapper1);
        	   System.out.println("value of intwrapper2="+intwrapper2);
        	   System.out.println("value of intwrapper="+intwrapper3);
        	   
        	   System.out.println("valu of intwrapper="+Integer.toHexString(intwrapper1));
        	   
        	   
        	   
        	   
           }
}
