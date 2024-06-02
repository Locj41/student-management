package view;


import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.util.ArrayList;

import javax.swing.DefaultListCellRenderer;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;

import model.Province;
import utils.TinhUtils;

public class FilterPane extends JPanel{
    private JLabel lb_Place;
    private JLabel lb_Name;
    private JTextField txt_Name;
    private JComboBox<Province> box_Place;
    private JButton btn_Filter;
    public FilterPane(){
        init();
    }
    private void init(){
        setBorder(new CustomBorder("List Student", 5, 5, 5, 5));
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        gbc.gridx = 0;
        gbc.gridy = 0;
        // gbc.ipadx = 20;
        gbc.weightx = 0.0;
        gbc.insets = new Insets(0, 15, 0, 0);
        gbc.anchor = GridBagConstraints.EAST;
        gbc.fill = GridBagConstraints.BOTH;
        lb_Place = new JLabel("Place: ");
        add(lb_Place, gbc);

        gbc.gridx++;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.insets = new Insets(0, 0, 0, 0);
        ArrayList<Province> list_Provinces = TinhUtils.getListProvince();
        box_Place = new JComboBox<>(list_Provinces.toArray(new Province[0]));
        box_Place.setBorder(new BevelBorder(BevelBorder.RAISED));
        //align center content of Jcombobox item
        DefaultListCellRenderer listRenderer = new DefaultListCellRenderer();
        listRenderer.setHorizontalAlignment(DefaultListCellRenderer.CENTER);
        box_Place.setRenderer(listRenderer);
        add(box_Place, gbc);

        gbc.gridx++;
        gbc.anchor = GridBagConstraints.EAST;
        gbc.insets = new Insets(0, 15, 0, 0);
        lb_Name = new JLabel("Name: ");
        add(lb_Name, gbc);

        gbc.gridx++;
        gbc.weightx = 0.5;
        gbc.insets = new Insets(0, 0, 0, 0);
        gbc.anchor = GridBagConstraints.WEST;
        txt_Name = new JTextField(10);
        add(txt_Name, gbc);

        gbc.gridx++;
        gbc.weightx = 0.25;
        gbc.insets = new Insets(0, 10, 0, 0);
        gbc.anchor = GridBagConstraints.CENTER;
        btn_Filter = new JButton("Filter");
        btn_Filter.setBorder(new BevelBorder(BevelBorder.RAISED));
        add(btn_Filter, gbc);

    }
}
