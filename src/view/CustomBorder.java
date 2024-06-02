package view;

import java.awt.Insets;

import javax.swing.border.BevelBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

public class CustomBorder extends CompoundBorder{
    private EmptyBorder emptyBorder;
    private TitledBorder titledBorder;
    private Insets insets;

    public CustomBorder(String title, int top, int bot, int left, int right) {
        insets = new Insets(top, left, bot, right);
        emptyBorder = new EmptyBorder(insets);
        titledBorder = new TitledBorder(
                new CompoundBorder(
                        new BevelBorder(BevelBorder.RAISED),
                        new BevelBorder(BevelBorder.LOWERED)),
                title);
        super.insideBorder = titledBorder;
        super.outsideBorder = emptyBorder;
    }
}
