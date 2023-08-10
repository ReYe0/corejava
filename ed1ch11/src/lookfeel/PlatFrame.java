package lookfeel;

import javax.swing.*;

/**
 * @author xuy
 */
public class PlatFrame extends JFrame {
    private JPanel buttonPanel;
    public PlatFrame(){
        buttonPanel = new JPanel();
        UIManager.LookAndFeelInfo[] infos = UIManager.getInstalledLookAndFeels();
        for (UIManager.LookAndFeelInfo info : infos) {
            makeButton(info.getName(),info.getClassName());
            add(buttonPanel);
            pack();
        }
    }
    /**
     * Makes a button to change the pluggable look-and-feel
     */
    private void makeButton(String name,String className){
        JButton button = new JButton();
        buttonPanel.add(button);
        button.addActionListener(event -> {
            try{
                UIManager.setLookAndFeel(className);
                SwingUtilities.updateComponentTreeUI(this);
                pack();
            }catch (Exception e){
                e.printStackTrace();
            }
        });
    }
}
