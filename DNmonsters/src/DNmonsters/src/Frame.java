package DNmonsters.src;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by kevinschroeder on 08.06.14.
 */
public class Frame extends JFrame implements ActionListener {
    public Frame(){
        this.setSize(1280,720);
        this.setDefaultCloseOperation(3);
        this.setLocationRelativeTo(null);
        this.setResizable(true);
        this.setTitle("Pugnatores Naturarum");
        JPanel panel=new JPanel();

        JButton b1 = new JButton("2.Schnellkampf");
        b1.addActionListener(this);
        b1.setActionCommand("Fight");
        panel.add(b1);
        this.add(panel);
        this.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if("Fight".equals(e.getActionCommand())){

        }

    }
}
