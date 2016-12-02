
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

public class RightDrugPanel extends JPanel {
	// Variables
	private JLabel check1, check2, check3, check4, check5;
	private JPanel checkPanel;

	// Constructor
	public RightDrugPanel() {
		// Set the layout of the panel
		this.setLayout(new BorderLayout());
		// Create a sub panel for steps to check patient rights
		checkPanel = new JPanel();
		checkPanel.setLayout(new GridLayout(5, 0));
		// First check
		check1 = new JLabel(
				"<html>1. Check the drug label three times: a) at the first contact the the medication bottle. <br>b) before pouring the medication . c) after pouring the medication</html>");
		check1.setFont(new Font("Serif", Font.PLAIN, 50));
		// Second check
		check2 = new JLabel(
				"<html>2. Check that the drug order is complete and legible. If it the order is incomplete or not<br> legible, contact the physician or charge nurse.</html>");
		check2.setFont(new Font("Serif", Font.PLAIN, 50));
		check2.setSize(new Dimension(MyApp.FRAME_WIDTH, MyApp.FRAME_HEIGHT));
		// Third check
		check3 = new JLabel("3. Know the medication action.");
		check3.setFont(new Font("Serif", Font.PLAIN, 50));
		// Fourth check
		check4 = new JLabel(
				"<html>4. Check the expiration date. All outdated drugs should be thrown away or sent back to the<br> pharmacy, whichever is the policy of the facility.</html>");
		check4.setFont(new Font("Serif", Font.PLAIN, 50));
		// Fifth check
		check5 = new JLabel(
				"<html>5. Patient Questions: If the patient questions the drug, recheck and check again the<br> medication and the doseage. If you are in doubt see assistance from another health care provider.</html>");
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