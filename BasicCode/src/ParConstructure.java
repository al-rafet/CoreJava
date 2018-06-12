
public class ParConstructure {
	int id;
	String name;
    public ParConstructure() {
    	
    }
    public ParConstructure(int id,String name) {
    	this.id=id;
    	this.name=name;
    }
    public int getId() {
    	return id;
    }
    public String getName() {
    	return name;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
            ParConstructure obj1=new ParConstructure();			
            ParConstructure obj2=new ParConstructure(13016,"Al-Rafet");	
            System.out.println("id: "+obj1.id+" Name: "+obj1.name);
            System.out.println("id: "+obj2.id+" Name: "+obj2.name);
            
            
	}

}
