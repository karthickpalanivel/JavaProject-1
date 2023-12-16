import java.awt.*;
import java.awt.event.*;

class myApp extends Frame implements ActionListener {

    Label l1, l2;
    Checkbox c1, c2;
    CheckboxGroup cbg;
    public myApp() {
        super("Radio Button Test");
        setSize(960, 540);
        setLayout(null);
        setVisible(true);

        cbg = new CheckboxGroup();

        c1 = new Checkbox("Verified user", cbg,false);
        c1.setBounds(10, 50, 250, 30);
       
        c2 = new Checkbox("Non - verified user", cbg, false);
        c2.setBounds(10, 100, 250, 30);
        
        l1 = new Label("Selet AnyOne");
        l1.setBounds(10, 150, 600, 30);

        add(c1);
        add(l1);
        add(c2);

        c1.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                if(e.getStateChange()==1){
                    l1.setText("You can have unlimited access");
                }
            }
        });

        c2.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                if(e.getStateChange()==1){
                    l1.setText("You can't have unlimited access");
                }
            }
        });


        
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

public class radioButton  extends Frame {
    public static void main(String[] args) {
        myApp App = new myApp();
    }
}