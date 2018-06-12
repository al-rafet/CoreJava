
public class ConChaining {
	int age;
	String name;
    public ConChaining() {
    	this("Al_Rahat");
    }
    public ConChaining(String s) {
    	this(s,6);
    }
    public ConChaining(String s,int age) {
    	this.name=s;
    	this.age=age;
    }
    
    
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
            ConChaining obj=new ConChaining();
            System.out.println("Name: "+obj.name+"\nAge: "+obj.age);
	}

}
