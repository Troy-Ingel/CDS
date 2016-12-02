
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

public class RightPatientPanel extends JPanel {
	// Variables
	private JLabel check1, check2, check3;
	private JPanel checkPanel;

	// Constructor
	public RightPatientPanel() {
		// Set the layout of the panel
		this.setLayout(new BorderLayout());
		// Create a sub panel for steps to check patient rights
		checkPanel = new JPanel();
		checkPanel.setLayout(new GridLayout(3, 0));
		// First check
		check1 = new JLabel("1. Verify patient by checking his or her identification bracelet/armband");
		check1.setFont(new Font("Serif", Font.PLAIN, 50));
		// Second check
		check2 = new JLabel(
				"<html>2. Ask the patient his or her name. Do not call the patient by name. Some clients will answer<br> to any name. Ask for his or her date of birth (not always required)</html>");
		check2.setFont(new Font("Serif", Font.PLAIN, 50));
		check2.setSize(new Dimension(MyApp.FRAME_WIDTH, MyApp.FRAME_HEIGHT));
		// Third check
		check3 = new JLabel("3. Check the name on the patient's medication label or profile in the EMAR");
		check3.setFont(new Font("Serif", Font.PLAIN, 50));
		// add components to checkPanel
		checkPanel.add(check1);
		checkPanel.add(check2);
		checkPanel.add(check3);

		this.add(checkPanel, BorderLayout.CENTER);
	}

}
