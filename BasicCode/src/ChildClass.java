
class ChildClass extends HelloConstructor{
	ChildClass(){
		super();
		System.out.println("This is childclass constructor");
	
	}
	public static void main(String []args) {
 	   HelloConstructor obj=new HelloConstructor();
		new ChildClass();
 	   //System.out.println(obj.name);
    }
	
}