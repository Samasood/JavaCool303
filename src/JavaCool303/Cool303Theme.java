package JavaCool303;

import java.awt.*;
import javax.swing.border.Border;

public abstract class Cool303Theme {

    protected Color buttonBgColor;
    protected Color buttonFgColor;
    protected Font buttonTextFont;
    protected Border buttonBorder;

    protected Color rootColor;
    protected Font rootTextFont;
    protected Border rootBorder;

    protected Color frameColor;
    protected Font frameTextFont;

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
        return this.rootColor;
    }

    public Font getContainerTextFont() {
        return this.rootTextFont;
    }

    public Border getContainerBorder() {
        return this.rootBorder;
    }

    public Color getFrameColor() {
        return this.frameColor;
    }

    public Font getFrameTextFont() {
        return this.frameTextFont;
    }

}
