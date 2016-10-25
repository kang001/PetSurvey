package com.Kara;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

/**
 * Created by stiri on 10/25/2016.
 */
public class PetSurvey extends JFrame{
    private JCheckBox blackCatCheckBox;
    private JCheckBox brownCatCheckBox;
    private JCheckBox dogCheckBox;
    private JButton quitButton;
    private JLabel resultsLabel;
    private JPanel rootPanel;

    private boolean brownCat;
    private boolean blackCat;
    private boolean dog;

    public PetSurvey() {
        setContentPane(rootPanel);
        pack();
        setSize(500, 500);
        setVisible(true);

        brownCatCheckBox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
            brownCat = brownCatCheckBox.isSelected();
            updateResults();
            }
        });
        blackCatCheckBox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
            blackCat = blackCatCheckBox.isSelected();
            updateResults();
            }
        });
        dogCheckBox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
            dog = dogCheckBox.isSelected();
                updateResults();
            }
        });}

        private void updateResults(){
        String hasBrownCat = brownCat ? " one brown cat " : " no brown cat ";
        String hasBlackCat = blackCat ? " one black cat " : " no black cat ";
        String hasDog = dog ? " one dog " : " no dog ";

        String results = "You have " +hasDog + " and " + hasBlackCat + " and " + hasBrownCat;
        resultsLabel.setText(results);

        quitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });


    }
}
