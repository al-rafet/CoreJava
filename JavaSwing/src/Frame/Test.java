package Frame;
import javax.swing.JFrame;
public class Test extends JFrame {
	Test(){
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		setLocation(100,50);
//        setSize(200,100);
		setBounds(500,500,400,500);
        setTitle("Frame");
        // setResizable(false);
	}
	
	public static void main(String[]args) {
		Test fr=new Test();
		
	}

}
