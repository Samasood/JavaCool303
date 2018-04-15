package JavaCool303;

import java.awt.LayoutManager;
import javax.swing.JPanel;

public class Cool303Container extends JPanel implements ThemeComponent{
    
    public Cool303Container(LayoutManager layout){
        
    }

    @Override
    public void setTheme(Cool303Theme theme) {
       this.setBackground(theme.getContainerColor());
       this.setFont(theme.getContainerTextFont());
       this.setBorder(theme.getContainerBorder());
    }
    
}
