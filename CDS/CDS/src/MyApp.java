import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.time.LocalDateTime;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class MyApp extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 3558285715196546142L;
	public static CardLayout card = new CardLayout();
	public static JPanel container = new JPanel();
	public static LoginPanel login;
	public static GlucoseLevelPanel glucose;
	public static PatientRightsPanel rights;
	public static DocumentPanel document;
	public static InsulinInjectionPanel insulin;
	public static LoginPanel panel5 = new LoginPanel();
	public static SplashScreenPanel splash;
	public static final int FRAME_WIDTH = java.awt.Toolkit.getDefaultToolkit().getScreenSize().width/2, 
			FRAME_HEIGHT = java.awt.Toolkit.getDefaultToolkit().getScreenSize().height/2;

	public MyApp() {
		splash = new SplashScreenPanel();
		login = new LoginPanel();
		glucose = new GlucoseLevelPanel();
		insulin = new InsulinInjectionPanel();
		
		rights = new PatientRightsPanel(this.getX() / 2, this.getY() / 2);
		document = new DocumentPanel(this.getX() / 2, this.getY() / 2);
		
		container.setLayout(card);
		//splash.setLayout(null);
		//login.setLayout(null);
		//document.setLayout(null);
	
		setSize(FRAME_WIDTH, FRAME_HEIGHT);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		container.add(splash, "1");
		container.add(login, "2");
		container.add(glucose, "3");
		container.add(rights, "4");
		container.add(insulin, "5");
		container.add(document, "6");
		//container.add(panel5, "7");

		card.show(container, "1");
		
		//this.setResizable(false);
		

	}

	public static void main(String[] args) {
		MyApp m = new MyApp();
		m.setTitle("Insulin Administation");
		m.add(container);
		m.setVisible(true);
		handleSplash();
		System.out.println(LocalDateTime.now());

	}


	public static void handleSplash() {
		try {
			Thread.sleep(1000);
			card.show(container, "2");

		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}

	
	public static void nextScreen(String curScreen) {
		if (curScreen.equals("login"))card.show(container, "3");
		if (curScreen.equals("glucose"))card.show(container, "4");
		if (curScreen.equals("rights"))card.show(container, "5");
		if (curScreen.equals("insulin"))card.show(container, "6");
		
	}

}
