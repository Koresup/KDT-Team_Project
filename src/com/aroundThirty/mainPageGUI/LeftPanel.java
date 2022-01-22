package com.aroundThirty.mainPageGUI;

import javax.swing.*;
import java.awt.*;

import static com.aroundThirty.Resource.Resource.*;


public class LeftPanel extends JPanel {
    JPanel centerPan = new JPanel();
    JLabel label = null;

    public LeftPanel() {
        add(BorderLayout.WEST, centerPan);
        JPanel mainPan = new JPanel();
        mainPan.setBorder(BorderFactory.createEmptyBorder(30, 30, 30, 30));
        mainPan.setBackground(color01);
        label = new JLabel("메인메뉴");
        label.setFont(font);
        mainPan.add(label);
        JPanel noticePan = new JPanel();
        noticePan.setBorder(BorderFactory.createEmptyBorder(30, 30, 30, 30));
        noticePan.setBackground(color01);
        label = new JLabel("공지사항");
        label.setFont(font);
        noticePan.add(label);
        JPanel discoveryPan = new JPanel();
        discoveryPan.setBorder(BorderFactory.createEmptyBorder(30, 30, 30, 30));
        discoveryPan.setBackground(color01);
        label = new JLabel("발견했어요");
        label.setFont(font);
        discoveryPan.add(label);
        JPanel missingPan = new JPanel();
        missingPan.setBorder(BorderFactory.createEmptyBorder(30, 30, 30, 30));
        missingPan.setBackground(color01);
        label = new JLabel("잃어버렸어요");
        label.setFont(font);
        missingPan.add(label);
        JPanel protectPan = new JPanel();
        protectPan.setBorder(BorderFactory.createEmptyBorder(30, 30, 30, 30));
        protectPan.setBackground(color01);
        label = new JLabel("보호중이에요");
        label.setFont(font);
        protectPan.add(label);
        JPanel findPan = new JPanel();
        findPan.setBorder(BorderFactory.createEmptyBorder(30, 30, 30, 30));
        findPan.setBackground(color01);
        label = new JLabel("새가족을 찾아요");
        label.setFont(font);
        findPan.add(label);

        JPanel gridPan = new JPanel(new GridLayout(6, 1));
        gridPan.add(mainPan);
        gridPan.add(noticePan);
        gridPan.add(discoveryPan);
        gridPan.add(missingPan);
        gridPan.add(protectPan);
        gridPan.add(findPan);
        gridPan.setBackground(color01);

        centerPan.add(gridPan);
        centerPan.setBackground(color01);

        this.setBackground(color01);
    }

    public static void main(String[] args) {
        new LeftPanel().setVisible(true);
    }
}
