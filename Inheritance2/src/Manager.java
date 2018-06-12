
public class Manager extends Employee {
	
	String dept;
	public Manager(int id, String name, String dept) {
		super(name,id);
		this.dept=dept;
	}
	
	@Override
	 public String empdetails() {
    	  return "subdetail";
    	}
	
	
	public static void main(String[]args) {
		Manager mng=new Manager(1,"Mr. Rafet","ICT");
		System.out.println(mng.empdetails());
	}

}
