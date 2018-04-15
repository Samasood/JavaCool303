package JavaCool303;

import java.awt.*;
import javax.swing.border.Border;

public abstract class Cool303Theme {

    protected Color buttonColor;
    protected Font buttonTextFont;
    //protected Dimension buttonDimension;
    protected Border buttonBorder;

    protected Color containerColor;
    protected Font containerTextFont;
    //protected Dimension containerDimension;
    protected Border containerBorder;

    protected Color rootColor;
    protected Font rootTextFont;
    //protected Dimension rootDimension;
    protected Border rootBorder;

    public Color getButtonColor() {
        return this.buttonColor;
    }

    public Font getButtonTextFont() {
        return this.buttonTextFont;
    }

//    public Dimension getButtonDimension() {
//        return this.buttonDimension;
//    }

    public Border getButtonBorder() {
        return this.buttonBorder;
    }

    public Color getContainerColor() {
        return this.containerColor;
    }

    public Font getContainerTextFont() {
        return this.containerTextFont;
    }

//    public Dimension getContainerDimension() {
//        return this.containerDimension;
//    }

    public Border getContainerBorder() {
        return this.containerBorder;
    }

    public Color getRootColor() {
        return this.rootColor;
    }

    public Font getRootTextFont() {
        return this.rootTextFont;
    }
    
//    public Dimension getRootDimension() {
//        return this.rootDimension;
//    }

    public Border getRootBorder() {
        return this.rootBorder;
    }
}
