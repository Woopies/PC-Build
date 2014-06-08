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
        this.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
