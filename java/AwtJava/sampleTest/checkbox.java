import java.awt.*;
import java.awt.event.*;

class myApp extends Frame implements ActionListener {

    Button btn;
    Label lb1, lb2, lb3;
    Checkbox cb1, cb2, cb3;

    public myApp() {
        super("CheckBox Testing");
        
        setSize(960, 540);
        
        setLayout(null);
        
        cb1 = new Checkbox("Java programming");
        cb1.setBounds(10,50,250,30);
        lb1 = new Label("Not selected");
        lb1.setBounds(300, 50, 600, 30);

        cb1.addItemListener(new ItemListener() {

            @Override
            public void itemStateChanged(ItemEvent e) {
                lb1.setText((e.getStateChange() == 1 ? "Selected" : "Not Selected"));
            }
            
        });

        add(cb1);
        add(lb1);
        
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

public class checkbox {
    public static void main(String[] args) {
        myApp app = new myApp();
    }
}