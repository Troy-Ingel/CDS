/***
 * Brian Carducci, Troy Ingel
 * Insulin Administration Clinical Decision Support System
 * SER360
 * This class creates a panel that instructs the user on how to properly prepare the insulin needle for injection
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

public class PrepareNeedlePanel extends JPanel{
	// Variables
	JLabel stepOneLabel, stepTwoLabel, stepThreeLabel, stepFourLabel, stepFiveLabel, stepSixLabel;

	// Constructor
	public PrepareNeedlePanel() {
		// Set the layout of the panel
		this.setLayout(new GridLayout(6,0));
		// add text to labels
		stepOneLabel = new JLabel("1. Pull plunger down to let air in the syringe equal to the amount of insulin needed");
		stepOneLabel.setFont(new Font("Serif", Font.PLAIN, 50));
		stepTwoLabel = new JLabel("2. Push the needle through the center of the rubber top of the insulin bottle");
		stepTwoLabel.setFont(new Font("Serif", Font.PLAIN, 50));
		stepThreeLabel = new JLabel("3. Push the air into the insulin bottle, leave the needle in the insulin bottle");
		stepThreeLabel.setFont(new Font("Serif", Font.PLAIN, 50));
		stepFourLabel = new JLabel("4. Turn the insulin bottle and syringe upside down");
		stepFourLabel.setFont(new Font("Serif", Font.PLAIN, 50));
		stepFiveLabel = new JLabel("<html>5. Pull the plunger down slowly to get insulin into the syringe. Be sure to get the right<br> number of units.</html>");
		stepFiveLabel.setFont(new Font("Serif", Font.PLAIN, 50));
		stepSixLabel = new JLabel("<html>6. Check syringe to make sure you have right units and no air bubbles, pull syringe out of<br> bottle</html>");
		stepSixLabel.setFont(new Font("Serif", Font.PLAIN, 50));
		
		add(stepOneLabel);
		add(stepTwoLabel);
		add(stepThreeLabel);
		add(stepFourLabel);
		add(stepFiveLabel);
		add(stepSixLabel);

	}

}