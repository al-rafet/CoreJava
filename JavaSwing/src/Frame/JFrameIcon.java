package Frame;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class JFrameIcon extends JFrame {
	private ImageIcon icon;
         JFrameIcon(){
        	 initcomponents();
        	 setVisible(true);
     		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//     		setLocation(100,50);
//             setSize(200,100);
     		setBounds(500,500,400,500);
             setTitle("Frame");
             // setResizable(false);
         }
         
         void initcomponents() {
        	 icon=new ImageIcon(getClass().getResource("Keyboard.jpg"));
        	 this.setIconImage(icon.getImage());
         }
	
	
	public static void main(String[]args) {
		
		JFrameIcon fr=new JFrameIcon();
		
	}
}
