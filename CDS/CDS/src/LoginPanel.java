import java.awt.Color;
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

public class LoginPanel extends JPanel implements MouseListener{

	JButton btnlogin, btnreset;
	JTextField jtfuser;
	JPasswordField jpfpass;
	JLabel jlabuser, jlabpass;
	

	public LoginPanel() {
		
		setLayout(new GridLayout(3,2));
		
		btnlogin = new JButton("Login");
		btnlogin.setFont(new Font("Serif", Font.PLAIN, 30));
		btnreset = new JButton("Reset");
		btnreset.setFont(new Font("Serif", Font.PLAIN, 30));
		

		jtfuser = new JTextField();
		jpfpass = new JPasswordField();

		jlabuser = new JLabel("Username: ");
		jlabuser.setFont(new Font("Serif", Font.PLAIN, 50));
		jlabpass = new JLabel("Password: ");
		jlabpass.setFont(new Font("Serif", Font.PLAIN, 50));
		
		
		btnlogin.addMouseListener(this);
		btnreset.addMouseListener(this);

//		jlabuser.setBounds(10, 10, 120, 20);
//		jlabpass.setBounds(10, 30, 120, 20);
//		jtfuser.setBounds(140, 10, 300, 100);
//		jpfpass.setBounds(140, 30, 300, 100);
//		btnlogin.setBounds(140, 55, 200, 50);
//		btnreset.setBounds(240, 55, 200, 50);

		this.add(jlabuser);
		this.add(jtfuser);
		this.add(jlabpass);
		this.add(jpfpass);
		this.add(btnlogin);
		this.add(btnreset);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		if(e.getSource() == btnlogin){
			if(jtfuser.getText().equals("username") && jpfpass.getText().equals("password")){
				this.successfulLogin();
				
			}
		}
		if(e.getSource() == btnlogin){
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

	public void successfulLogin(){
		MyApp.nextScreen("login");
	}

	
}
