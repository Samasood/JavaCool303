package JavaCool303;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.border.LineBorder;

public class Cool303PastelTheme extends Cool303Theme{
        public Cool303PastelTheme() {
        buttonBgColor = new Color(0,0,0);
        buttonFgColor = new Color(255,255,203);
        buttonTextFont = new Font("Courier New", Font.BOLD, 20);
        buttonBorder = new LineBorder(Color.BLACK);

        containerColor = Color.GREEN;
        containerTextFont = new Font("Courier New", Font.BOLD, 8);

        rootColor = Color.RED;
        rootTextFont = new Font("Courier New", Font.BOLD, 10);
    }

}
