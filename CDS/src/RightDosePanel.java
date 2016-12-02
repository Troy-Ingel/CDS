
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

public class RightDosePanel extends JPanel {
	// Variables
	private JLabel check1, check2, check3, check4, check5;
	private JPanel checkPanel;

	// Constructor
	public RightDosePanel() {
		// Set the layout of the panel
		this.setLayout(new BorderLayout());
		// Create a sub panel for steps to check patient rights
		checkPanel = new JPanel();
		checkPanel.setLayout(new GridLayout(5, 0));
		// First check
		check1 = new JLabel(
				"<html>1. Be able to calculate the medication doses using the ration and proportion, basic formula<br> fractional equation.</html>");
		check1.setFont(new Font("Serif", Font.PLAIN, 50));
		// Second check
		check2 = new JLabel("2. Know how to calculate drug dose by body weight (kg) or by body surface area.");
		check2.setFont(new Font("Serif", Font.PLAIN, 50));
		check2.setSize(new Dimension(MyApp.FRAME_WIDTH, MyApp.FRAME_HEIGHT));
		// Third check
		check3 = new JLabel(
				"<html>3. Know the recommended dosage range for the drug. If the nurse believes the dose is<br> incorrect or not within the therapeutic range, a supervisor, pharmacist or the ordering physician should be contacted and all communication should be documented.</html>");
		check3.setFont(new Font("Serif", Font.PLAIN, 50));
		// Fourth check
		check4 = new JLabel("4. Recalculate drug dose and have a colleague recheck the dose.");
		check4.setFont(new Font("Serif", Font.PLAIN, 50));
		// Fifth check
		check5 = new JLabel("5. Some facilities require the following drugs to be checked by a colleague:");
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