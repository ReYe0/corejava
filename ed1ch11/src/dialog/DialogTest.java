package dialog;

import javax.swing.*;
import java.awt.*;

/**
 * @version 1.35 2018-04-10
 * @author Cay Horstmann
 */
public class DialogTest
{
   public static void main(String[] args)
   {
      EventQueue.invokeLater(() -> {
         DialogFrame frame = new DialogFrame();
         frame.setTitle("DialogTest");
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         frame.setVisible(true);
      });
   }
}
