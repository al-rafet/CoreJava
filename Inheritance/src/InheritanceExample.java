
public class InheritanceExample {
          public static void main(String[]args) {
        	  Parent p=new Parent();
        	  Child c=new Child();
        	  p.pi=10;
        	  p.pj=100;
        	  System.out.println("Content of parent class-");
        	  p.showpipj();
        	  c.pi=200;
        	  c.pj=300;
        	  //c.pk=89;
        	  
        	 System.out.println("Content of parent class-");
        	  c.showpipj();
        	  c.showpk();
        	  System.out.println("Sum = "+c.sum(c.pi, c.pj, c.pk));
        	  
        	  
          }
}
