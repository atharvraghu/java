package second;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Myframe extends JFrame implements ActionListener {
    JButton Button;
    Myframe(){

        this.setTitle("trial");
        this.setVisible(true);
        this.setSize(640,640);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.getContentPane().setBackground(new Color(149, 132, 182));
        this.setLayout(new FlowLayout());

        ImageIcon image=new ImageIcon("C:\\Users\\hp\\Downloads\\icons8-logo-48.png");
        this.setIconImage(image.getImage());

        Button=new JButton();
        Button.setIcon(image);
        Button.setFocusable(false);
        Button.setBackground(Color.lightGray);
        Button.addActionListener(this);
        this.add(Button);

        JLabel label=new JLabel();
        label.setText("peach/peace is what i want");
        this.add(label);
        this.pack();
        label.setIcon(image);
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.BOTTOM);
        label.setHorizontalAlignment(SwingConstants.CENTER);
        label.setVerticalAlignment(SwingConstants.CENTER);
        label.setBackground(Color.getHSBColor(123,53,250));
        label.setOpaque(true);
        label.setBorder(BorderFactory.createLineBorder(Color.black,10));
        label.setBounds(0,100,250,250);




    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==Button){
            Button.setEnabled(false);

        }
    }
}
