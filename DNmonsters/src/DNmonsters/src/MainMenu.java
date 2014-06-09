package DNmonsters.src;

import javax.swing.*;
import java.awt.event.ActionListener;

/**
 * Created by nicspeed on 09.06.2014.
 */
public class MainMenu extends JPanel {
    private JButton multiplayerButton;
    private JButton fastbattleButton;
    private JButton campaignButton;
    private JButton optionsButton;
    private JButton exitButton;
    private JLabel image;

    public MainMenu(int width,int height,ActionListener a){
        this.setBounds(0,0,width,height);
        multiplayerButton=new JButton("Multiplayer");
        fastbattleButton=new JButton("Quick Battle");
        campaignButton=new JButton("Campaign");
        optionsButton=new JButton("Options");
        exitButton=new JButton("Beenden");
        exitButton.addActionListener(a);
        exitButton.setActionCommand("beenden");

        image=new JLabel(new ImageIcon("./img/PugnatoresNaturarumSymbol"));
        this.add(campaignButton);
        this.add(fastbattleButton);
        this.add(image);
        this.add(multiplayerButton);
        this.add(optionsButton);
        this.add(exitButton);
        this.setVisible(true);
    }
}
