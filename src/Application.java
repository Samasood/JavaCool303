
import JavaCool303.*;
import java.awt.GridLayout;

public class Application {

    public static void main(String[] args) {
        Cool303Root coolFrame = new Cool303Root(600, 400, true);
        Cool303Container coolContainer = new Cool303Container(new GridLayout(5, 4));
        for (int i = 0; i < 20; i++) {
            coolContainer.put(new Cool303Button(""+i));
        }
        coolFrame.put(coolContainer);
        coolFrame.render(new Cool303WinterTheme());
    }
}
