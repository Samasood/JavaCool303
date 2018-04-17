package JavaCool303;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;

public class Cool303Button extends JButton implements ThemeComponent {

    private ArrayList<ThemeComponent> components = new ArrayList<>();

    public Cool303Button(String label) {
        this.setText(label);
        this.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println(label);
            }
        });
    }

    public Cool303Button(String label, int x, int y) {
        this.setOpaque(true);
        this.setText(label);
        this.setPreferredSize(new Dimension(x, y));
        this.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println(label);
            }
        });
    }

    @Override
    public void setTheme(Cool303Theme theme) {
        this.setBackground(theme.getButtonBgColor());
        this.setForeground(theme.getButtonFgColor());
        this.setFont(theme.getButtonTextFont());
        this.setBorder(theme.getButtonBorder());
    }

    @Override
    public ArrayList<ThemeComponent> getSubComponents() {
        return components;
    }

}
