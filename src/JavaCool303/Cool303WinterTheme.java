package JavaCool303;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

public class Cool303WinterTheme extends Cool303Theme {

    public Cool303WinterTheme() {
        buttonBgColor = Color.CYAN;
        buttonFgColor = new Color(0,0,0);
        buttonTextFont = new Font("Courier New", Font.ITALIC, 20);
        buttonBorder = new LineBorder(Color.BLACK);

        rootColor = Color.BLUE;
        rootTextFont = new Font("Courier New", Font.ITALIC, 8);

        frameColor = Color.BLACK;
        frameTextFont = new Font("Courier New", Font.ITALIC, 10);
    }
}
