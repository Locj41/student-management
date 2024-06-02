package view;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.SwingConstants;


public class FuncPane extends JPanel{
    private JButton btn_New;
    private JButton btn_Update;
    private JButton btn_Delete;
    private JButton btn_Save;

    public FuncPane(){
        init();
    }
    private void init(){
        setBorder(new CustomBorder("Function", 5, 5, 5, 5));
        GridLayout grid = new GridLayout(1,4);
        grid.setHgap(10);
        setLayout(grid);        

        btn_New = new JButton("New");
        btn_New.setHorizontalTextPosition(SwingConstants.LEFT);
        btn_Update = new JButton("Update");
        btn_Delete = new JButton("Delete");
        btn_Save = new JButton("Save");

        add(btn_New);
        add(btn_Update);
        add(btn_Delete);
        add(btn_Save);
    }
}
