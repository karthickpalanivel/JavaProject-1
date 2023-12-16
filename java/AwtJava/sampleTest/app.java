import java.awt.*;
import java.awt.event.*;

class myApp extends Frame implements ActionListener {
    
    public myApp() {
        super("Java Application");
        setSize(960, 540);
        setLayout(null);

        setVisible(true);

        this.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
       
    }
}

public class app extends Frame {
    public static void main(String[] args) {
        myApp App = new myApp(); 
    }
}