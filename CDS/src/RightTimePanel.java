
/***
 * Brian Carducci, Troy Ingel
 * Insulin Administration Clinical Decision Support System
 * SER360
***/
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class RightTimePanel extends JPanel {
	// Variables
	private JLabel check1, check2, check3, check4, check5;
	private JPanel checkPanel;

	// Constructor
	public RightTimePanel() {
		// Set the layout of the panel
		this.setLayout(new BorderLayout());
		// Create a sub panel for steps to check patient rights
		checkPanel = new JPanel();
		checkPanel.setLayout(new GridLayout(5, 0));
		// First check
		check1 = new JLabel(
				"1. Administer the drug at the correct time(s). Medications can be given 1/2 hour before or after the time prescribed.");
		check1.setFont(new Font("Serif", Font.PLAIN, 50));
		// Second check
		check2 = new JLabel(
				"2. There are specific cirecumstances that may cause a delay or ommission of a medication such as: labortory or diagnostic tests. ");
		check2.setFont(new Font("Serif", Font.PLAIN, 50));
		check2.setSize(new Dimension(MyApp.FRAME_WIDTH, MyApp.FRAME_HEIGHT));
		// Third check
		check3 = new JLabel(
				"3. Administer drugs that are affected by foods either 1 hours before or 2 hours after meals.");
		check3.setFont(new Font("Serif", Font.PLAIN, 50));
		// Fourth check
		check4 = new JLabel("4. Know the medications half-life.");
		check4.setFont(new Font("Serif", Font.PLAIN, 50));
		// Fifth check
		check5 = new JLabel("5. Anitbiotics should be administered at regular intervals.");
		check5.setFont(new Font("Serif", Font.PLAIN, 50));
		// add components to checkPanel
		checkPanel.add(check1);
		checkPanel.add(check2);
		checkPanel.add(check3);
		checkPanel.add(check4);
		checkPanel.add(check5);

		this.add(checkPanel, BorderLayout.CENTER);

	}

}