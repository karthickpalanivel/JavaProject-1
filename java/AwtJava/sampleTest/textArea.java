import java.awt.*;
import java.awt.event.*;

class myApp extends Frame implements ActionListener {
    TextField input1, input2;
    Button addBtn, subBtn, mulBtn, divBtn;
    Label lbl1, lbl2, answer;
    public myApp() {
        super("Your Title");
        setSize(960, 540);
        setLayout(null);
        setVisible(true);

        lbl1 = new Label("Enter the 1st Number");
        lbl1.setBounds(10, 50, 50,20);
        input1 = new TextField();
        input1.setBounds(200, 50, 100, 40);

        lbl2 = new Label("Enter the 2nd Number");
        lbl2.setBounds(10, 100, 50, 20);
        input2 = new TextField();
        input2.setBounds(200, 100, 100, 40);
        
        addBtn = new Button("add");
        addBtn.setBounds(350, 50, 40, 20);

        subBtn = new Button("sub");
        subBtn.setBounds(350, 80, 40, 20);

        mulBtn = new Button("mul");
        mulBtn.setBounds(350, 110, 40, 20);

        divBtn = new Button("div");
        divBtn.setBounds(350, 140, 40, 20);

        answer = new Label("The Answer");
        answer.setBounds(10, 150, 50, 20);


        add(lbl1);
        add(lbl2);
        add(input1);
        add(input2);
        add(addBtn);
        add(subBtn);
        add(mulBtn);
        add(divBtn);
        add(answer);


        this.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        String str1 = input1.getText().toString();
        String str2 = input2.getText().toString();

        if (str1.isEmpty() || str2.isEmpty()) {
            answer.setText("Enter the data");
        } else {
            int a = Integer.parseInt(str1);
            int b = Integer.parseInt(str2);

            // switch()
        }
    }
}

public class textArea extends Frame {
    public static void main(String[] args) {
        myApp App = new myApp();
    }
}