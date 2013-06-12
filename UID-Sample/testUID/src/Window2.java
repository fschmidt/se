
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

public final class Window2 extends JFrame {
private JPanel navPanel = new JPanel();

private JPanel mainContainer = new JPanel();
private JPanel firstCont = new JPanel();
private JButton mainButton = new JButton("Button1");

private JButton subButton = new JButton("Button2");


private JPanel subCont = new JPanel();
private JLabel checkLabel = new JLabel("My Box");

private JCheckBox checkme = new JCheckBox("Check Me!");




public  Window2 () {
	this.setSize(400, 300);
	navPanel.setLayout(new GridBagLayout());
	this.setContentPane(navPanel);
	this.setTitle("Window2");
	BoxLayout bl;
	navPanel.add(mainContainer);
	bl = new BoxLayout(mainContainer, BoxLayout.X_AXIS);
	mainContainer.setLayout(bl);
	
	bl = new BoxLayout(firstCont, BoxLayout.Y_AXIS);
	firstCont.setLayout(bl);
	
	
	firstCont.add(mainButton);
	
	firstCont.add(subButton);
	
	mainContainer.add(firstCont);
	bl = new BoxLayout(subCont, BoxLayout.Y_AXIS);
	subCont.setLayout(bl);
	
	
	subCont.add(checkLabel);
	
	subCont.add(checkme);
	
	mainContainer.add(subCont);
	

	}	
}
