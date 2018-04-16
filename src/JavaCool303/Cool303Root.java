package JavaCool303;

import java.awt.Component;
import java.awt.Dimension;
import java.util.ArrayList;
import javax.swing.JFrame;

public class Cool303Root extends JFrame implements ThemeComponent {

    private ArrayList<ThemeComponent> components = new ArrayList<ThemeComponent>();
    Cool303Theme theme;
    
    public Cool303Root(int width, int height, boolean visible) {
        this.setPreferredSize(new Dimension(width, height));
        this.setVisible(visible);
    }

    @Override
    public void setTheme(Cool303Theme theme) {
        this.setBackground(theme.getContainerColor());
        this.setFont(theme.getContainerTextFont());
    }

    public void put(ThemeComponent c) {
        components.add(c);
    }

    public void render(Cool303Theme theme) {
        this.theme = theme;
        this.setTheme(theme);
        for (int i = 0; i < components.size(); i++) {
            ThemeComponent c = components.get(i);
            applyTheme(c);
            this.add((Component) c);
        }
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void applyTheme(ThemeComponent c) {
        c.setTheme(this.theme);
        for (int i = 0; i < c.getSubComponents().size(); i++) {
            ThemeComponent comp = c.getSubComponents().get(i);
            applyTheme(comp);
        }
    }

    @Override
    public ArrayList<ThemeComponent> getSubComponents() {
        return components;
    }

}
