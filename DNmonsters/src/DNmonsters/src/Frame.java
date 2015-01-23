package DNmonsters.src;

import javax.swing.*;
import javax.swing.plaf.synth.SynthButtonUI;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by kevinschroeder on 08.06.14.
 */
public class Frame extends JFrame implements ActionListener {
    private MainMenu mainMenu;
    public Frame(){

        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e1) {
            System.err.println("Cannot set System LookAndFeel! Using Crossplatform LookAndFeel instead!");
            e1.printStackTrace();
            try {
                UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
            } catch (Exception e2) {
                System.err.println("Error setting Crossplatform LookAndFeel!");
                e2.printStackTrace();
            }
        }

        this.setSize(1280, 720);
        this.setDefaultCloseOperation(3);
        this.setLocationRelativeTo(null);
        this.setResizable(true);
        this.setTitle("Pugnatores Naturarum");
        mainMenu =new MainMenu();
        this.add(mainMenu);
        this.setVisible(true);
    }



    @Override
    public void actionPerformed(ActionEvent e) {
        if("beenden".equals(e.getActionCommand())){
            System.exit(0);
        }

    }
}
