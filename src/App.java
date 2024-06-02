
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import view.AppStudentManagement;

public class App {
    public static void main(String[] args) throws Exception {
        try {
            // Set System L&F
            UIManager.setLookAndFeel(
                    UIManager.getSystemLookAndFeelClassName());
        } catch (UnsupportedLookAndFeelException e) {
            System.out.println("The Look and Feel is not supported");
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (InstantiationException e) {
            System.out.println(e.getMessage());
        } catch (IllegalAccessException e) {
            System.out.println(e.getMessage());
        }
        SwingUtilities.invokeLater(() -> {
            AppStudentManagement app = new AppStudentManagement();
    
            app.setVisible(true);
        });
    
    }
}


