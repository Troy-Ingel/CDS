import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class SplashScreenPanel extends JPanel {
	public SplashScreenPanel() {
		JLabel text = new JLabel("WELCOME TO INSULIN ADMINISTRATION", SwingConstants.CENTER);
		text.setFont(new Font("Serif", Font.BOLD, 60));
		this.add(text);
	}
}
