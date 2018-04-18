package JavaCool303;

import java.awt.Component;
import java.awt.LayoutManager;
import java.util.ArrayList;
import javax.swing.JPanel;

public class Cool303Root extends JPanel implements ThemeComponent {

    private ArrayList<ThemeComponent> components = new ArrayList<ThemeComponent>();

    public Cool303Root(LayoutManager layout) {
        this.setLayout(layout);
    }

    @Override
    public void setTheme(Cool303Theme theme) {
        this.setBackground(theme.getContainerColor());
        this.setFont(theme.getContainerTextFont());
        this.setBorder(theme.getContainerBorder());
    }

    public void put(ThemeComponent c) {
        components.add(c);
        this.add((Component) c);
    }

    @Override
    public ArrayList<ThemeComponent> getSubComponents() {
        return components;
    }

}
