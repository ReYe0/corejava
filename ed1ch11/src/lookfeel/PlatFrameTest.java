package lookfeel;

import javax.swing.*;
import java.awt.*;

/**
 * @author windit
 */
public class PlatFrameTest {
    public static void main(String[] args)
    {
        EventQueue.invokeLater(() ->
        {
            PlatFrame frame = new PlatFrame();
            frame.setTitle("PlatFrame");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
        });
    }
}
