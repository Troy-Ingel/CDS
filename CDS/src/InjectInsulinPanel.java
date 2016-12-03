
/***
 * Brian Carducci, Troy Ingel
 * Insulin Administration Clinical Decision Support System
 * SER360
 * This class creates a panel that instructs the user on how to properly inject a patient with a needle
 * containing insulin
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

public class InjectInsulinPanel extends JPanel {
	// Variables
	JLabel stepOneLabel, stepTwoLabel, stepThreeLabel, stepFourLabel, stepFiveLabel, stepSixLabel, stepSevenLabel;

	// Constructor
	public InjectInsulinPanel() {
		// Set the layout of the panel
		this.setLayout(new GridLayout(7,0));
		//create the labels
		stepOneLabel = new JLabel("<html>1. Clean a small area of skin  with an ALCOHOL SWAB. Let the alcohol dry completely<br> before you inject</html>");
		stepOneLabel.setFont(new Font("Serif",Font.PLAIN, 50));
		stepTwoLabel = new JLabel("2. Do not let the needle touch anything");
		stepTwoLabel.setFont(new Font("Serif",Font.PLAIN, 50));
		stepThreeLabel = new JLabel("3. Pinch up the skin");
		stepThreeLabel.setFont(new Font("Serif",Font.PLAIN, 50));
		stepFourLabel = new JLabel("4.Push the needle through the skin");
		stepFourLabel.setFont(new Font("Serif",Font.PLAIN, 50));
		stepFiveLabel = new JLabel("5. Push the insulin in with the plunger");
		stepFiveLabel.setFont(new Font("Serif",Font.PLAIN, 50));
		stepSixLabel = new JLabel("6. Pull the needle out of the skin");
		stepSixLabel.setFont(new Font("Serif",Font.PLAIN, 50));
		stepSevenLabel = new JLabel("7. Press your finger or an alcohol swab over the spot you gave the injection");
		stepSevenLabel.setFont(new Font("Serif",Font.PLAIN, 50));
		//add all components to panel
		add(stepOneLabel);
		add(stepTwoLabel);
		add(stepThreeLabel);
		add(stepFourLabel);
		add(stepFiveLabel);
		add(stepSixLabel);
		add(stepSevenLabel);

	}

}