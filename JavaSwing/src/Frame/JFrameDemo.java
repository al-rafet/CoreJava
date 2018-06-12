package Frame;
import javax.swing.JFrame;
public class JFrameDemo {
         public static void main(String[]args) {
        	 JFrame frame=new JFrame();
        	 frame.setVisible(true);
	         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	         frame.setLocation(100,50);
	         frame.setSize(200,100);
	         frame.setTitle("My Frame");
	         frame.setResizable(false);
	          
         }
}
