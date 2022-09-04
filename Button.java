/*Wap to make a button using event handling */
import java.awt.*;
import javax.swing.*;

public class Button {
    Button(){
        JFrame a = new JFrame("button");
        JPanel p = new JPanel();
        p.setBounds(60,50,80,40);
        JButton b = new JButton("Click me");
        b.setBounds(60,50,80,40);
        p.add(b);
        a.add(p);
        a.setSize(400,400);
        a.setLayout(null);
        a.setVisible(true);

    }
    public static void main(String args[]){
        new Button();
    }
}
