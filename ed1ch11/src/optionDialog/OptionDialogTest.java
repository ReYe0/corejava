package optionDialog;

import javax.swing.*;
import java.awt.*;

/**
 * @version 1.35 2018-04-10
 * @author Cay Horstmann
 */
public class OptionDialogTest
{
   public static void main(String[] args)
   {
      EventQueue.invokeLater(() -> {
         OptionDialogFrame frame = new OptionDialogFrame();
         frame.setTitle("OptionDialogTest");
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         frame.setVisible(true);
      });
   }
}
