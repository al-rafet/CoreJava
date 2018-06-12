
public class CopyCons {
      String web;
      
      CopyCons(String w){
    	  web=w;
      }
      CopyCons(CopyCons c){
    	  web=c.web;
      }
      void Display() {
    	  System.out.println("Name is : "+web);
      }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          CopyCons obj1=new CopyCons("Al-Sathi");
          CopyCons obj2=new CopyCons(obj1);
          obj1.Display();
          obj2.Display();
	}

}
