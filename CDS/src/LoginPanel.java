
/***
 * Brian Carducci, Troy Ingel
 * Insulin Administration Clinical Decision Support System
 * SER360
 * This class creates a panel that promps the user to enter in a username and password
***/

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.BoxLayout;
import javax.swing.GroupLayout.Alignment;

public class LoginPanel extends JPanel implements MouseListener {
	// Variables
	private JButton btnLogin, btnReset;
	private JTextField jtfUser;
	private JPasswordField jpfPass;
	private JLabel jLabUser, jLabPass, jTitle;
	private JPanel titlePanel, loginSubPanel, userNamePanel, passWordPanel, buttonPanel;

	// Constructor
	public LoginPanel() {
		// set layout
		setLayout(new GridLayout(3, 0));
		// set panels and their layouts
		titlePanel = new JPanel();
		titlePanel.setLayout(new FlowLayout());
		loginSubPanel = new JPanel();
		loginSubPanel.setLayout(new BorderLayout());
		userNamePanel = new JPanel();
		userNamePanel.setLayout(new FlowLayout());
		passWordPanel = new JPanel();
		passWordPanel.setLayout(new FlowLayout());
		buttonPanel = new JPanel();
		buttonPanel.setLayout(new FlowLayout());
		// set title
		jTitle = new JLabel("Insulin Administration");
		jTitle.setFont(new Font("Serif", Font.BOLD, 100));

		// Create login button with a custom font and size
		btnLogin = new JButton("Login");
		btnLogin.setFont(new Font("Serif", Font.PLAIN, 30));
		btnLogin.setPreferredSize(new Dimension(350, 50));
		btnLogin.setLocation(50, 50);

		// Create reset button with a custom font and size
		btnReset = new JButton("Clear");
		btnReset.setFont(new Font("Serif", Font.PLAIN, 30));
		btnReset.setPreferredSize(new Dimension(350, 50));
		btnReset.setLocation(200, 200);

		// Text fields for the user to enter in username and password
		jtfUser = new JTextField(30);
		jtfUser.setFont(new Font("Serif", Font.PLAIN, 30));
		jpfPass = new JPasswordField(30);
		jpfPass.setFont(new Font("Serif", Font.PLAIN, 30));

		// Labels to put in front of the text fields
		jLabUser = new JLabel("Username: ");
		jLabUser.setFont(new Font("Serif", Font.PLAIN, 50));
		jLabPass = new JLabel("Password: ");
		jLabPass.setFont(new Font("Serif", Font.PLAIN, 50));

		// Add listener to the buttons

		btnLogin.addMouseListener(this);
		btnReset.addMouseListener(this);

		// Add all components to the grid layout
		titlePanel.add(jTitle);

		userNamePanel.add(jLabUser);
		userNamePanel.add(jtfUser);

		passWordPanel.add(jLabPass);
		passWordPanel.add(jpfPass);

		buttonPanel.add(btnLogin);
		buttonPanel.add(btnReset);

		loginSubPanel.add(userNamePanel, BorderLayout.NORTH);
		loginSubPanel.add(passWordPanel, BorderLayout.CENTER);

		add(titlePanel);
		add(loginSubPanel, BorderLayout.NORTH);
		add(buttonPanel);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// If statement to check that username and password match
		if (e.getSource() == btnLogin) {
			if (jtfUser.getText().equals("username") && jpfPass.getPassword().equals("password")) {
				this.successfulLogin();
			}
		}
		// If login button is clicked, show next screen (For testing purposes)
		if (e.getSource() == btnLogin) {
			this.successfulLogin();
		}

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	// Method is called when the login is successful, and sends request to show
	// next screen
	public void successfulLogin() {
		MyApp.handleButtonPanel("next");
	}

}
