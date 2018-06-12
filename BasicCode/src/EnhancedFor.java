
public class EnhancedFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
             int [] list= {10,2,3,4};
             printList(list);
             int sum=printSum(list);
             System.out.println("Sum is "+sum);
	}
	
	public static int printSum(int[] list) {
		int total=0;
		for(int val:list) {
			total+=val;
		}
		//System.out.print(total);
		return total;
		
	}
	
	public static void printList(int[] list) {
		System.out.println("index value");
		for(int i=0;i<list.length;i++) {
		
			System.out.println(i +"       "+list[i]);
		}
	}

}
