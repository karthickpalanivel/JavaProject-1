import java.awt.*;
import java.awt.event.*;

class myApp extends Frame implements ActionListener {
    Button btn;
    Label lbl;
    public myApp() {
        super("Java Application");
        setSize(960, 540);//width, height
        setLayout(null);

        btn = new Button("Click me!");
        btn.setBounds(100, 100, 200, 50);//x,y,width (in pixels), height (in pixels)
        btn.addActionListener(this);
        add(btn);

        lbl = new Label("---------");
        lbl.setBounds(100, 200, 200, 50);//x,y,width (in pixels), height (in pixels)
    
        add(lbl);
        
        setVisible(true);

        this.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        lbl.setText("This label is changed");
    }
}

public class basic extends Frame {
    public static void main(String[] args) {
        myApp App = new myApp();
    }
}