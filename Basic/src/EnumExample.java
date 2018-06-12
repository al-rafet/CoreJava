
public class EnumExample {
           public enum day{
	                 sat,sun,mon,tues,wed,thurs,fri;
               }
           public  static void main(String[]args) {
        	   for(day s:day.values()) {
        		   System.out.println(s);
        	   }
           }

}
