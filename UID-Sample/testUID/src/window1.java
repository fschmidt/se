
import java.awt.event.KeyEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.ComponentOrientation;
import java.awt.Event;
import java.awt.GridBagLayout;

import javax.swing.GroupLayout.Alignment;
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

import sun.awt.HorizBagLayout;
import sun.awt.VerticalBagLayout;

import java.awt.Toolkit;
import java.util.ArrayList;

public final class window1 extends JFrame {
private JPanel navPanel = new JPanel();

private JPanel mainContainer = new JPanel();
private JButton mainButton = new JButton("Button1");

private JButton subButton = new JButton("Button2");


private JPanel subCont = new JPanel();
private JLabel checkLabel = new JLabel("My Box");

private JCheckBox checkme = new JCheckBox("Check Me!");




public  window1 () {
	this.setSize(400, 300);
	navPanel.setLayout(new GridBagLayout());
	this.setContentPane(navPanel);
	this.setTitle("window1");
	navPanel.add(mainContainer);
	// mainContainer.setLayout(new HorizBagLayout());
	mainContainer.add(mainButton);
	mainContainer.add(subButton);
	
	navPanel.add(subCont);
	// subCont.setLayout(new VerticalBagLayout());
	subCont.add(checkLabel);
	subCont.add(checkme);
	
	





}
}
