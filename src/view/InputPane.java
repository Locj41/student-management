package view;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.util.ArrayList;

import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import model.Province;
import utils.TinhUtils;

public class InputPane extends JPanel{
    private JLabel lb_Id;
    private JLabel lb_Name;
    private JLabel lb_Place;
    private JLabel lb_birthDate;
    private JLabel lb_Gender;
    private JLabel lb_Math;
    private JLabel lb_Physic;
    private JLabel lb_Chemistry;
    private JTextField txt_Id;
    private JTextField txt_Name;
    private JComboBox<Province> box_Place;
    private JTextField txt_birthDate;
    private JRadioButton btn_Male;
    private JRadioButton btn_Female;
    private JTextField txt_Math;
    private JTextField txt_Physic;
    private JTextField txt_Chemistry;

    
    public InputPane(){
        init();
    }
    private void init(){
        //set border
        setBorder(new CustomBorder("Information Student", 5, 5, 5, 5));
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        //locate label
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.weighty = 0.25;
        gbc.anchor = GridBagConstraints.EAST;
        gbc.insets = new Insets(0, 10, 0, 0);
        lb_Id = new JLabel("ID: ");
        add(lb_Id, gbc);

        gbc.gridy++;
        lb_Name = new JLabel("Name: ");
        lb_Name.setAlignmentX(RIGHT_ALIGNMENT);
        add(lb_Name, gbc);

        gbc.gridy++;
        lb_Place = new JLabel("Place: ");
        add(lb_Place, gbc);

        gbc.gridy++;
        lb_birthDate = new JLabel("Birthdate: ");
        add(lb_birthDate, gbc);

        gbc.gridy++;
        lb_Gender = new JLabel("Gender: ");
        add(lb_Gender, gbc);

        gbc.gridx = 2;
        gbc.gridy = 0;
        lb_Math = new JLabel("Math: ");
        add(lb_Math, gbc);

        gbc.gridy++;
        lb_Physic = new JLabel("Physic: ");
        add(lb_Physic, gbc);

        gbc.gridy++;
        lb_Chemistry = new JLabel("Chemistry: ");
        add(lb_Chemistry, gbc);

        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(0, 0, 0, 0);
        txt_Id = new JTextField(20);
        add(txt_Id, gbc);

        gbc.gridy++;
        txt_Name = new JTextField();
        add(txt_Name, gbc);

        gbc.gridy++;
        ArrayList<Province> lst_Provinces = TinhUtils.getListProvince();
        box_Place = new JComboBox<>(lst_Provinces.toArray(new Province[0]));
        add(box_Place, gbc);

        gbc.gridy++;
        txt_birthDate = new JTextField();
        add(txt_birthDate,gbc);

        gbc.gridy++;
        btn_Male = new JRadioButton("Male");
        btn_Female = new JRadioButton("Female");
        ButtonGroup grp_Gender = new ButtonGroup();
        grp_Gender.add(btn_Male);
        grp_Gender.add(btn_Female);
        JPanel genderPane = new JPanel();
        genderPane.add(btn_Male);
        genderPane.add(btn_Female);
        add(genderPane, gbc);

        gbc.gridx = 3;
        gbc.gridy = 0;
        txt_Math = new JTextField(20);
        add(txt_Math, gbc);

        gbc.gridy++;
        txt_Physic = new JTextField(20);
        add(txt_Physic, gbc);

        gbc.gridy++;
        txt_Chemistry = new JTextField(20);
        add(txt_Chemistry, gbc);

    }
}

