package JavaCool303;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.border.LineBorder;

public class Cool303PastelTheme extends Cool303Theme{
        public Cool303PastelTheme() {
        buttonBgColor = new Color(100,90,80);
        buttonFgColor = new Color(255,255,203);
        buttonTextFont = new Font("Courier New", Font.BOLD, 20);
        buttonBorder = new LineBorder(Color.BLACK);

        rootColor = Color.GREEN;
        rootTextFont = new Font("Courier New", Font.BOLD, 8);

        frameColor = Color.RED;
        frameTextFont = new Font("Courier New", Font.BOLD, 10);
    }

}
