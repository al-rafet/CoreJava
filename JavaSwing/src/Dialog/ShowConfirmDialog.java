package Dialog;

import javax.swing.JOptionPane;

public class ShowConfirmDialog {
       public static void main(String[] args) {
    	   int choice=JOptionPane.showConfirmDialog(null,"Do you want to quit","title",JOptionPane.YES_NO_CANCEL_OPTION);
         
    	   if(choice==JOptionPane.YES_OPTION)
    	   {
    		   System.out.println("You have clicked Yes");
    	   }
    	   else
    	   {
    		   //System.out.println("You have clicked No option");
    		   System.exit(110);
    	   }
    	   
       }
}
