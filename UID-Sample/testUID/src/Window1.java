
import java.awt.event.KeyEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Event;
import java.awt.GridBagLayout;
import javax.swing.BoxLayout;

import javax.swing.JCheckBox;
import javax.swing.JTextField;
import javax.swing.JLabel;
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

public final class Window1 extends JFrame {
private JPanel navPanel = new JPanel();

private JPanel container1 = new JPanel();
private JPanel mainContainer = new JPanel();
private JButton mainButton = new JButton("Button1");

private JButton subButton = new JButton("Button2");


private JPanel subCont = new JPanel();
private JLabel checkLabel = new JLabel("My Box");

private JCheckBox checkme = new JCheckBox("Check Me!");




public  Window1 () {
	this.setSize(400, 300);
	navPanel.setLayout(new GridBagLayout());
	this.setContentPane(navPanel);
	this.setTitle("Window1");
	BoxLayout bl;
	navPanel.add(container1);
	bl = new BoxLayout(container1, BoxLayout.Y_AXIS);
	container1.setLayout(bl);
	
	bl = new BoxLayout(mainContainer, BoxLayout.X_AXIS);
	mainContainer.setLayout(bl);
	
	mainButton.addActionListener(new ActionListener() {
	  public void actionPerformed(ActionEvent e) {
			Window2 window2 = new Window2();
			window2.setVisible(true);
	    }
	  }
	);
	
	mainContainer.add(mainButton);
	
	mainContainer.add(subButton);
	
	container1.add(mainContainer);
	bl = new BoxLayout(subCont, BoxLayout.X_AXIS);
	subCont.setLayout(bl);
	
	
	subCont.add(checkLabel);
	
	subCont.add(checkme);
	
	container1.add(subCont);
	

	}	
}
