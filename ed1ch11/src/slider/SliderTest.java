package slider;

import javax.swing.*;
import java.awt.*;

/**
 * @version 1.16 2018-04-10
 * @author Cay Horstmann
 */
public class SliderTest
{
   public static void main(String[] args)
   {
      EventQueue.invokeLater(() -> {
         SliderFrame frame = new SliderFrame();
         frame.setTitle("SliderTest");
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         frame.setVisible(true);
      });
   }
}
