package waseda;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

class university extends JFrame{
  public static void main(String args[]){
    university frame = new university("imichataddon-waseda");
    frame.setVisible(true);
  }
  university(String title){
    setBounds(100, 100, 300, 250);

    JPanel p = new JPanel();
    ImageIcon icon = new ImageIcon("./quit.png");
    JButton button1 = new JButton(icon);
  
    p.add(button1);
}
}
