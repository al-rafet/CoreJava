package Dialog;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class ShowInputDialog {
	public static void main(String[]args) {
  	  String f_name=JOptionPane.showInputDialog(null,"Your first name-","Tittle",
  			  JOptionPane.QUESTION_MESSAGE);
  	 String l_name=JOptionPane.showInputDialog(null,"Your last name-","Tittle",
 			  JOptionPane.QUESTION_MESSAGE);
  	 String name=f_name+" "+l_name;
  	 JOptionPane.showMessageDialog(null, "Your full name is "+name);
  	  
  	  
	}
	
}
