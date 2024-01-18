import java.awt.*;
import java.awt.event.*;

public class AwtDemo {
    Frame frame;
    Label l1,l2;
    TextField t1,t2;
    Button b;
    AwtDemo(){
        frame = new Frame("Java Label Demo");
        frame.setVisible(true);
        frame.setBackground(Color.blue);
        frame.setSize(700,300);
        frame.setLayout(null);
        l1=new Label("Text 1");
        l2= new Label("Text 2");
        t1=new TextField("Java");
        t2=new TextField("Programming");
        b= new Button("Swap");
        l1.setBounds(250,50,100,50);
        l2.setBounds(250,120,100,50);
        t1.setBounds(400,50,100,40);
        t1.setBackground(Color.CYAN);
        t2.setBounds(400,120,100,40);
        t2.setBackground(Color.CYAN);
        b.setBounds(300,200,70,50);
        b.setFont(new Font("Serif",Font.BOLD,20));
        b.setForeground(Color.black);
        b.setBackground(Color.cyan);
        frame.add(l1);
        frame.add(l2);
        frame.add(t1);
        frame.add(t2);
        frame.add(b);
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                frame.dispose();
            }
        });
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String temp;
                temp= t1.getText();
                t1.setText(t2.getText());
                t2.setText(temp);
            }
        });
    }
    public static void main(String[] args) {
        new AwtDemo();
    }
}
