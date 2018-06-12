
import java.awt.*;
import java.awt.TrayIcon.MessageType;
import javax.swing.ImageIcon;
 
public class TrayIconDemo {
 
    public static void main(String[] args) throws AWTException  {
         
        TrayIconDemo td = new TrayIconDemo();
        td.displayTray();
 
    }
 
    public void displayTray() throws AWTException{
        //Obtain only one instance of the SystemTray object
        SystemTray tray = SystemTray.getSystemTray();
        //Creating a tray icon
        ImageIcon icon = new ImageIcon(getClass().getResource("keyboard.jpg"));
        Image image = icon.getImage();
        //System.out.println(image);
        TrayIcon trayIcon = new TrayIcon(image, "Tray Demo");
        //Let the system resizes the image if needed
        trayIcon.setImageAutoSize(true);
        //Set tooltip text for the tray icon
        trayIcon.setToolTip("System tray icon demo");
        tray.add(trayIcon);
        trayIcon.displayMessage("Hello, World", "notification demo", MessageType.INFO);
    }
}