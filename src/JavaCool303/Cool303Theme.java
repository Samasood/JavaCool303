package JavaCool303;

import java.awt.*;
import javax.swing.border.Border;

public abstract class Cool303Theme {

    protected Color buttonBgColor;
    protected Color buttonFgColor;
    protected Font buttonTextFont;
    protected Border buttonBorder;

    protected Color containerColor;
    protected Font containerTextFont;
    protected Border containerBorder;

    protected Color rootColor;
    protected Font rootTextFont;

    public Color getButtonBgColor() {
        return this.buttonBgColor;
    }

    public Color getButtonFgColor() {
        return this.buttonFgColor;
    }

    public Font getButtonTextFont() {
        return this.buttonTextFont;
    }

    public Border getButtonBorder() {
        return this.buttonBorder;
    }

    public Color getContainerColor() {
        return this.containerColor;
    }

    public Font getContainerTextFont() {
        return this.containerTextFont;
    }

    public Border getContainerBorder() {
        return this.containerBorder;
    }

    public Color getRootColor() {
        return this.rootColor;
    }

    public Font getRootTextFont() {
        return this.rootTextFont;
    }

}
