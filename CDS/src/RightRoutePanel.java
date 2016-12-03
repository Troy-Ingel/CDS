
/***
 * Brian Carducci, Troy Ingel
 * Insulin Administration Clinical Decision Support System
 * SER360
 * This class creates a panel that instructs the user on how to identify the proper route for injection
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

public class RightRoutePanel extends JPanel {
	// Variables
	private JLabel check1, check2, check3;
	private JPanel checkPanel;

	// Constructor
	public RightRoutePanel() {
		// Set the layout of the panel
		this.setLayout(new BorderLayout());
		// Create a sub panel for steps to check patient rights
		checkPanel = new JPanel();
		checkPanel.setLayout(new GridLayout(3, 0));
		// First check
		check1 = new JLabel("1. Know the appropriate land marks for the injectable medications.");
		check1.setFont(new Font("Serif", Font.PLAIN, 50));
		// Second check
		check2 = new JLabel("2. Know the appropriate size of needles for the land mark chosen.");
		check2.setFont(new Font("Serif", Font.PLAIN, 50));
		check2.setSize(new Dimension(MyApp.FRAME_WIDTH, MyApp.FRAME_HEIGHT));
		// Third check
		check3 = new JLabel("3. Know how to use appropriate sterile technique.");
		check3.setFont(new Font("Serif", Font.PLAIN, 50));
		// add components to checkPanel
		checkPanel.add(check1);
		checkPanel.add(check2);
		checkPanel.add(check3);

		this.add(checkPanel, BorderLayout.CENTER);

	}

}
