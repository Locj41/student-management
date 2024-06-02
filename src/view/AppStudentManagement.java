package view;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JFrame;


public class AppStudentManagement extends JFrame {
    private FilterPane filterPane;
    private ListPane listPane;
    private InputPane inputPane;
    private FuncPane funcPane;

    public AppStudentManagement(){
        setSize(600, 600);  
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        
        filterPane = new FilterPane();
        gbc.fill = GridBagConstraints.BOTH;
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.weighty = 0.5;
        gbc.weightx = 1.0;
        add(filterPane, gbc);   
        
        listPane = new ListPane();
        gbc.gridy++;
        gbc.weighty=1.5;
        add(listPane, gbc);
        
        inputPane = new InputPane();
        gbc.gridy++;
        gbc.weighty = 2.0;
        add(inputPane, gbc);
        
        funcPane = new FuncPane();
        gbc.gridy++;
        gbc.weighty = 0.5;
        add(funcPane, gbc);
    }
 
}



