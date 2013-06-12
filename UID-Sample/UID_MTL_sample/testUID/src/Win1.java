
import java.awt.event.KeyEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Event;
import java.awt.GridBagLayout;

import javax.swing.KeyStroke;
import javax.swing.JPanel;
import javax.swing.JMenuItem;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JButton;

import java.awt.Toolkit;
import java.util.ArrayList;

public final class Win1 extends JFrame {

private JPanel contentPanel = new JPanel();
private JPanel navPanel = new JPanel();

private JButton win2_1;


public  Win1 () {

this.setSize(400, 300);
navPanel.setLayout(new GridBagLayout());
this.setContentPane(navPanel);

        setTitle("Win1");
    win2_1 = new JButton();
    win2_1.setText("Win2");

    win2_1.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
			Win2 win2 = new Win2();
 win2.setVisible (true);
        }
      }
    );

     navPanel.add(win2_1);




}
}
