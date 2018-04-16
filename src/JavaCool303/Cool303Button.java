package JavaCool303;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;

public class Cool303Button extends JButton implements ThemeComponent {

    private ArrayList<ThemeComponent> components = new ArrayList<ThemeComponent>();

    public Cool303Button(String label) {
        this.setText(label);
        this.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println(label);
            }
        });
    }

    public Cool303Button(String label, int x, int y) {
        this.setText(label);
        this.setSize(x, y);
        this.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println(label);
            }
        });
    }

    @Override
    public void setTheme(Cool303Theme theme) {
        this.setBackground(theme.getButtonColor());
        this.setFont(theme.getButtonTextFont());
        this.setBorder(theme.getButtonBorder());
    }

    @Override
    public ArrayList<ThemeComponent> getSubComponents() {
        return components;
    }

}
