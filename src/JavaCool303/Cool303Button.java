package JavaCool303;

import javax.swing.JButton;

public class Cool303Button extends JButton implements ThemeComponent{
    String Label;
    
    public Cool303Button(String label){
        this.Label = label;
    }
    
    public Cool303Button(String label, int x, int y){
        this.Label = label;
        this.setSize(x, y);
    }

    @Override
    public void setTheme(Cool303Theme theme) {
       this.setBackground(theme.getButtonColor());
       this.setFont(theme.getButtonTextFont());
       this.setBorder(theme.getButtonBorder());
    }  
    
}
