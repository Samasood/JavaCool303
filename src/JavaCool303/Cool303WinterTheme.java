package JavaCool303;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

public class Cool303WinterTheme extends Cool303Theme {

    public Cool303WinterTheme() {
        buttonBgColor = new Color(255,255,153);
        buttonFgColor = new Color(0,0,0);
        buttonTextFont = new Font("Courier New", Font.ITALIC, 20);
        //buttonDimension = new Dimension(10, 5);
        buttonBorder = new LineBorder(Color.BLACK);

        containerColor = Color.BLUE;
        containerTextFont = new Font("Courier New", Font.ITALIC, 8);
        //containerDimension = new Dimension(200, 100);
        //buttonBorder = new Border()

        rootColor = Color.BLACK;
        rootTextFont = new Font("Courier New", Font.ITALIC, 10);
        //rootDimension = new Dimension(300, 200);
        //buttonBorder = new Border()
    }
}
