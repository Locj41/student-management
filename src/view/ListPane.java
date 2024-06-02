package view;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class ListPane extends JPanel{
    private JTable listStudent;
    private JScrollPane scrollPane;
    public ListPane(){
        init();
    }
    
    private void init(){
        this.setLayout(new GridBagLayout());
        setBorder(new CustomBorder("List Student", 5, 5, 5, 5));
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;

        //table
        String[] columnName = new String[]{
            "Id", "Name", "Place", "Gender", "Birth Date", "Score1", "Score2", "Score3"};
            Object[][] data = {
            };
        listStudent = new JTable(data,columnName);
        //set column width
        listStudent.getColumnModel()
            .getColumn(0).setPreferredWidth(15);
        int numColumns = listStudent.getColumnCount();
        for(int i = numColumns - 1; i >= listStudent.getColumnCount() - 3; i--){
            listStudent.getColumnModel().getColumn(i).setPreferredWidth(30);
        }
        listStudent.getColumnModel().getColumn(3)
            .setPreferredWidth(30);

        listStudent.setFillsViewportHeight(true);
        scrollPane = new JScrollPane(listStudent);
        scrollPane.setPreferredSize(new Dimension(this.getWidth(), this.getHeight() - 200));
        this.add(scrollPane,gbc);
    }

}
