package controller;

import javax.swing.JDialog;
import javax.swing.JLabel;



import view.AppStudentManagement;

    public class StudentManagementController {
        public void showAboutDialog(AppStudentManagement app){
            JDialog aboutDialog = new JDialog(app,"About",true);
            JLabel label = new JLabel("This is the About dialog!");
            aboutDialog.add(label);

        // Thiết lập kích thước của JDialog và hiển thị nó
            aboutDialog.setSize(200, 150);
            aboutDialog.setLocationRelativeTo(app);
            aboutDialog.setVisible(true);
        }
    }


