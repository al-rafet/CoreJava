import java.util.Arrays;
import java.util.Scanner;
class Testarray{  
public static void main(String args[]){  
 Scanner sc=new Scanner(System.in); 
int a[]=new int[3];//declaration and instantiation  

for(int i=0;i<a.length;i++)
{
	a[i]=sc.nextInt();
}
 
System.out.println(a);
 //sorting
  Arrays.sort(a);
//printing array  

  for(int i=0;i<a.length;i++)//length is the property of array  
System.out.println(a[i]); 
  
  //int arr[][]=new int[3][];
  
  int arr[][]= {{1,2,3},{4,5},{2,4,5,6,8}};
  
  for(int i=0;i<arr.length;i++) {
	  
  }
  
}}  
