
import JavaCool303.*;
import java.awt.GridLayout;

public class Application {

    public static void main(String[] args) {
        Cool303Root coolFrame = new Cool303Root(true);
        Cool303Container coolContainer = new Cool303Container(new GridLayout(4,4));
        coolFrame.setBounds(500, 500 , 900, 900);

        for (int i = 1; i <= 20; i++) {
            coolContainer.put(new Cool303Button("" + i, 30, 30));
        }
        coolFrame.put(coolContainer);
        coolFrame.render(new Cool303WinterTheme());
    }
}
