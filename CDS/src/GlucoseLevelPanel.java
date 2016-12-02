
/***
 * Brian Carducci, Troy Ingel
 * Insulin Administration Clinical Decision Support System
 * SER360
***/

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.Border;

public class GlucoseLevelPanel extends JPanel {
	// Variables
	private ImageIcon glucoseImage;
	private JLabel glucoseImageLabel;
	private JPanel stepPanel, imagePanel;
	private JLabel step1, step2, step3, step4;
	private Border lineBorder;
	private Image image;

	// Constructor
	public GlucoseLevelPanel() {
		// Set panel to grid layout
		this.setLayout(new GridLayout(0, 2));
		// Border to go around the image
		lineBorder = BorderFactory.createLineBorder(Color.black);
		// Panel used to display the steps
		stepPanel = new JPanel();
		stepPanel.setLayout(new GridLayout(4, 0));
		stepPanel.setOpaque(true);
		stepPanel.setBorder(lineBorder);
		// Labels that will each represent 1 step
		step1 = new JLabel("1. Insert test strip into meter");
		step2 = new JLabel("<html>2. Use lancing device on side of fingertip to<br> get drop of blood</html>");
		step3 = new JLabel("3. Hold edge of test strip to drop of blood");
		step4 = new JLabel("4. Read result from meter");
		// Set size, font, color of label
		step1.setSize(new Dimension(MyApp.FRAME_WIDTH / 3, MyApp.FRAME_HEIGHT / 4));
		step1.setFont(new Font("Serif", Font.PLAIN, 50));
		// Set size, font, color of label
		step2.setSize(new Dimension(MyApp.FRAME_WIDTH / 3, MyApp.FRAME_HEIGHT / 4));
		step2.setFont(new Font("Serif", Font.PLAIN, 50));
		// Set size, font, color of label
		step3.setSize(new Dimension(MyApp.FRAME_WIDTH / 3, MyApp.FRAME_HEIGHT / 4));
		step3.setFont(new Font("Serif", Font.PLAIN, 50));
		// Set size, font, color of label
		step4.setSize(new Dimension(MyApp.FRAME_WIDTH / 3, MyApp.FRAME_HEIGHT / 4));
		step4.setFont(new Font("Serif", Font.PLAIN, 50));
		// add each step to the panel
		stepPanel.add(step1);
		stepPanel.add(step2);
		stepPanel.add(step3);
		stepPanel.add(step4);

		// set up image panel
		imagePanel = new JPanel();
		imagePanel.setLayout(new GridLayout());
		imagePanel.setBackground(Color.blue);
		imagePanel.setBorder(lineBorder);

		try {
			image = ImageIO.read(new File("Images/InsulinSlidingScale.PNG")).getScaledInstance(1000, 1000,
					Image.SCALE_SMOOTH);
		} catch (IOException e) {
			e.printStackTrace();
		}

		// Set up image and labels
		glucoseImageLabel = new JLabel();
		glucoseImageLabel.setOpaque(true);
		glucoseImageLabel.setBackground(Color.blue);
		glucoseImage = new ImageIcon(image);
		glucoseImageLabel.setIcon(glucoseImage);
		imagePanel.add(glucoseImageLabel);

		// Add the sub panels to the main panel
		this.add(stepPanel);
		this.add(imagePanel);
	}
}