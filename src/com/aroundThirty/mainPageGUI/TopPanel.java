package com.aroundThirty.mainPageGUI;

import javax.swing.*;
import java.awt.*;

import static com.aroundThirty.Resource.Resource.*;

public class TopPanel extends JPanel {
    JPanel centerPan = new JPanel();


    public TopPanel() {
        JPanel LoPanel = new JPanel();
        LoPanel.add(locationCombo);
        LoPanel.setBackground(color);
        JPanel GePanel = new JPanel();
        GePanel.add(genderCombo);
        GePanel.setBackground(color);
        JPanel kindPanel = new JPanel();
        kindPanel.add(kindCombo);
        kindPanel.setBackground(color);
        JPanel gridPan = new JPanel(new GridBagLayout());
        gridPan.add(LoPanel);
        gridPan.add(kindPanel);
        gridPan.add(GePanel);
        gridPan.setBackground(color);
        locationCombo.setPreferredSize(new Dimension(100, 30));
        genderCombo.setPreferredSize(new Dimension(100, 30));
        JButton switchPet = new JButton("Switch Pet");
        switchPet.getPreferredSize();
        gridPan.add(switchPet);
        JButton login = new JButton("LOGIN");
        login.getPreferredSize();
        gridPan.add(login);

        centerPan.add(gridPan);
        centerPan.setBackground(color);

        this.setBackground(color);
        this.add(BorderLayout.CENTER, centerPan);
    }

    public static void main(String[] args) {
        new TopPanel().setVisible(true);
    }

}
