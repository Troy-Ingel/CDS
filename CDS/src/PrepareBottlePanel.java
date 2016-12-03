
/***
 * Brian Carducci, Troy Ingel
 * Insulin Administration Clinical Decision Support System
 * SER360
 * This class creates a panel that instructs the user on how to properly prepare the insulin bottle
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

public class PrepareBottlePanel extends JPanel {
	// Variables
	JLabel stepOneLabel, stepTwoLabel, stepThreeLabel;
	private JPanel textPanel;

	// Constructor
	public PrepareBottlePanel() {
		// Set the layout of the panel
		this.setLayout(new GridLayout(3, 0));
		// Create a sub panel for steps to check patient rights
		textPanel = new JPanel();
		stepOneLabel = new JLabel("1. Wash Hands");
		stepTwoLabel = new JLabel("2. roll the bottle between your hands until it is uniformly cloudy");
		stepThreeLabel = new JLabel("3. Wipe the top of the insulin bottle with an Alcohol Swab");

		stepOneLabel.setFont(new Font("Serif", Font.PLAIN, 50));
		stepTwoLabel.setFont(new Font("Serif", Font.PLAIN, 50));
		stepThreeLabel.setFont(new Font("Serif", Font.PLAIN, 50));

		// add all components to main panel
		add(stepOneLabel);
		add(stepTwoLabel);
		add(stepThreeLabel);

	}

}