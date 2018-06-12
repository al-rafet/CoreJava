
public class Employee {
    public String name;
    public int empid;
    
    public Employee() {
    	this.name="khalid";
    	this.empid=1;
    }
    
    public Employee(String name,int id) {
    	this.name=name;
    	this.empid=id;
    }
    
    protected String empdetails() {
    	return "Id is "+empid+"\nName is "+name ;  
    	}
}
