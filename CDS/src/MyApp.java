import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Shape;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.geom.Ellipse2D;
import java.time.LocalDateTime;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.border.Border;

public class MyApp extends JFrame {
	// variables
	public static CardLayout card = new CardLayout();
	public static JPanel container = new JPanel();
	public static LoginPanel login;
	public static GlucoseLevelPanel glucose;
	public static DocumentPanel document;
	public static InjectInsulinPanel insulin;
	public static LoginPanel panel5 = new LoginPanel();
	public static RightDosePanel rightDose;
	public static RightDrugPanel rightDrug;
	public static RightPatientPanel rightPatient;
	public static RightRoutePanel rightRoute;
	public static RightTimePanel rightTime;
	public static PrepareBottlePanel bottle;
	public static PrepareNeedlePanel needle;
	public static SummaryPanel summary;

	public static MyApp myApp;
	public static final int FRAME_WIDTH = java.awt.Toolkit.getDefaultToolkit().getScreenSize().width / 2,
			FRAME_HEIGHT = java.awt.Toolkit.getDefaultToolkit().getScreenSize().height / 2 + 500;

	private static MyGlassPane glassPane;
	public static ArrayList<Shape> ellipses = new ArrayList<Shape>();
	public static Shape clickedEllipse;
	private static JLabel title;
	MyApp frame = this;

	public static JPanel buttonPanel = new JPanel();
	public static JPanel mainPanel = new JPanel();
	public static JButton backButton, nextButton;
	public static int showingCardPanel;

	// constructor
	public MyApp() {
		//initialize the panels
		login = new LoginPanel();
		glucose = new GlucoseLevelPanel();
		insulin = new InjectInsulinPanel();
		document = new DocumentPanel();
		rightDose = new RightDosePanel();
		rightDrug = new RightDrugPanel();
		rightTime = new RightTimePanel();
		rightPatient = new RightPatientPanel();
		rightRoute = new RightRoutePanel();
		insulin = new InjectInsulinPanel();
		bottle = new PrepareBottlePanel();
		needle = new PrepareNeedlePanel();
		summary = new SummaryPanel();
		//set up card layout
		container.setLayout(card);
		//set some initial values for the frame
		setSize(FRAME_WIDTH, FRAME_HEIGHT);
		setTitle("Insulin Administration");
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setFocusable(true);
		setVisible(true);
		//add panels to the card layout
		container.add(login, "1");
		container.add(glucose, "2");
		container.add(rightPatient, "3");
		container.add(rightDrug, "4");
		container.add(rightDose, "5");
		container.add(rightTime, "6");
		container.add(rightRoute, "7");
		container.add(bottle, "8");
		container.add(needle, "9");
		container.add(insulin, "10");
		container.add(document, "11");
		container.add(summary, "12");
		//add container to the frame
		add(container);
		//show the first screen (login)
		card.show(container, "1");
		//create the glass pane and add it to the frame
		glassPane = new MyGlassPane();
		setGlassPane(glassPane);
		glassPane.setVisible(false);
		glassPane.setOpaque(false);
		//create ellipses for injection locations
		Shape ellipse1 = new Ellipse2D.Double(980, 360, 50, 50);
		Shape ellipse2 = new Ellipse2D.Double(1135, 360, 50, 50);
		Shape ellipse3 = new Ellipse2D.Double(765, 440, 50, 50);
		Shape ellipse4 = new Ellipse2D.Double(715, 560, 50, 50);
		Shape ellipse5 = new Ellipse2D.Double(812, 560, 50, 50);
		Shape ellipse6 = new Ellipse2D.Double(1025, 535, 50, 50);
		Shape ellipse7 = new Ellipse2D.Double(1102, 535, 50, 50);
		//add ellipses to the list
		ellipses.add(ellipse1);
		ellipses.add(ellipse2);
		ellipses.add(ellipse3);
		ellipses.add(ellipse4);
		ellipses.add(ellipse5);
		ellipses.add(ellipse6);
		ellipses.add(ellipse7);

		setResizable(true);
		showingCardPanel = 1;
		//set up the next and back buttons
		backButton = new JButton("Back");
		nextButton = new JButton("Next");
		backButton.setVisible(false);
		nextButton.setVisible(false);
		backButton.setFocusable(false);
		nextButton.setFocusable(false);
		backButton.setPreferredSize(new Dimension(300, 50));
		nextButton.setPreferredSize(new Dimension(300, 50));
		backButton.setFont(new Font("Serif", Font.PLAIN, 50));
		nextButton.setFont(new Font("Serif", Font.PLAIN, 50));
		//create title
		title = new JLabel();
		title.setFont(new Font("Serif", Font.BOLD, 75));
		title.setHorizontalAlignment(JLabel.CENTER);

		buttonPanel.setLayout(new BorderLayout());
		//set up the layout of the panels
		buttonPanel.add(backButton, BorderLayout.WEST);
		buttonPanel.add(nextButton, BorderLayout.EAST);
		buttonPanel.add(title, BorderLayout.CENTER);
		mainPanel.setLayout(new BorderLayout());
		mainPanel.add(container, BorderLayout.CENTER);
		mainPanel.add(buttonPanel, BorderLayout.NORTH);
		//add mouselistener to back button, that sets the card layout to previous panel
		//when clicked
		backButton.addMouseListener(new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent arg0) {

			}

			@Override
			public void mouseEntered(MouseEvent arg0) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseExited(MouseEvent arg0) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mousePressed(MouseEvent arg0) {
				handleButtonPanel("back");
			}

			@Override
			public void mouseReleased(MouseEvent arg0) {
				// TODO Auto-generated method stub

			}

		});
		//add mouselistener to next button, that sets the card layout to next panel
		//when clicked
		nextButton.addMouseListener(new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent arg0) {

			}

			@Override
			public void mouseEntered(MouseEvent arg0) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseExited(MouseEvent arg0) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mousePressed(MouseEvent arg0) {
				handleButtonPanel("next");
				System.out.println("next");
			}

			@Override
			public void mouseReleased(MouseEvent arg0) {
				// TODO Auto-generated method stub

			}

		});
		//add main panel to
		add(mainPanel);
	}
//main
	public static void main(String[] args) {
		new MyApp();
	}
/**
 * Method that is responsible for checking to see if the glass pane, back button and
 * next button should be visable or not
 **/
	public static void handleButtonPanel(String direction) {

		nextButton.setVisible(true);
		backButton.setVisible(true);
		glassPane.setVisible(false);
		if (direction.equals("next")) {
			card.next(container);
			showingCardPanel++;
			System.out.println(showingCardPanel);
			if (showingCardPanel == (11)) {
				title.setText("Documentation");
				nextButton.setVisible(false);
				glassPane.setVisible(true);
			}
			if (showingCardPanel == 12) {
				title.setText("Summary");
				glassPane.setVisible(false);
				summary.updateComponents();
			}
			if (showingCardPanel == 13) {
				showingCardPanel = 1;
				clickedEllipse = null;
				glassPane.repaint();

			}
			if (showingCardPanel == (1))
				nextButton.setVisible(false);
		}

		if (direction.equals("back")) {
			if (showingCardPanel == 11) {
				glassPane.setVisible(false);
			}
			card.previous(container);
			showingCardPanel--;
		}
		if (showingCardPanel == (1)) {
			backButton.setVisible(false);
			nextButton.setVisible(false);
			title.setText("");
		}
		if (showingCardPanel == 2) {
			backButton.setVisible(true);
			backButton.setVisible(true);
			title.setText("Check Glucose");
		}
		if (showingCardPanel == 3) {
			backButton.setVisible(true);
			nextButton.setVisible(true);
			title.setText("Check Right Patient");
		}
		if (showingCardPanel == 4) {
			backButton.setVisible(true);
			nextButton.setVisible(true);
			title.setText("Check Right Drug");
		}
		if (showingCardPanel == 5) {
			backButton.setVisible(true);
			nextButton.setVisible(true);
			title.setText("Check Right Dose");
		}
		if (showingCardPanel == 6) {
			backButton.setVisible(true);
			nextButton.setVisible(true);
			title.setText("Check Right Time");
		}
		if (showingCardPanel == 7) {
			backButton.setVisible(true);
			nextButton.setVisible(true);
			title.setText("Check Right Route");
		}
		if (showingCardPanel == 8) {
			backButton.setVisible(true);
			nextButton.setVisible(true);
			title.setText("Prepare Insulin Bottle");
		}
		if (showingCardPanel == 9) {
			backButton.setVisible(true);
			nextButton.setVisible(true);
			title.setText("Prepare Insulin Needle");
		}
		if (showingCardPanel == 10) {
			backButton.setVisible(true);
			nextButton.setVisible(true);
			title.setText("Administer Insulin");
		}
		if (showingCardPanel == 11) {
			backButton.setVisible(true);
			nextButton.setVisible(true);
			glassPane.setVisible(true);
			title.setText("Documentation");
		}
		if (showingCardPanel == 12) {
			backButton.setVisible(true);
			nextButton.setVisible(false);
			title.setText("Process Complete");
		}

	}

	// Code for glass pane, which becomes visible only over the DocumentPanel
	class MyGlassPane extends JComponent {

		MyGlassPane glass = this;

		private static final long serialVersionUID = 1L;

		public MyGlassPane() {
			addMouseListener(new MouseAdapter() {
				@Override
				public void mousePressed(MouseEvent e) {
					dispatchEvent(e);
					for (Shape ellipse : ellipses) {
						if (ellipse.contains(e.getPoint())) {
							clickedEllipse = ellipse;
						}
						repaint();
					}
				}

				private void dispatchEvent(MouseEvent e) {
					Component component = null;
					Point glassPanePoint = e.getPoint();
					Container container = frame.getContentPane();
					Point containerPoint = SwingUtilities.convertPoint(glass, glassPanePoint, container);
					if (containerPoint.y < 0) { // we're not in the content pane
						// Could have special code to handle mouse events over
						// the menu bar or non-system window decorations, such
						// as
						// the ones provided by the Java look and feel.
					} else {
						// The mouse event is probably over the content pane.
						// Find out exactly which component it's over.
						component = SwingUtilities.getDeepestComponentAt(container, containerPoint.x, containerPoint.y);
					}
					if (component != null) {
						// Forward events to component below
						Point componentPoint = SwingUtilities.convertPoint(glass, glassPanePoint, component);
						component.dispatchEvent(new MouseEvent(component, e.getID(), e.getWhen(), e.getModifiers(),
								componentPoint.x, componentPoint.y, e.getClickCount(), e.isPopupTrigger()));
						if (component == backButton) {
							backButton.doClick();
						}
						if (component == nextButton) {
							nextButton.doClick();
						}
						if (component == DocumentPanel.refuseCheckBox) {
							DocumentPanel.refuseCheckBox.doClick();
						}
					}
				}
			});
		}

		@Override
		public void paintComponent(Graphics g) {
			Graphics2D g2d = (Graphics2D) g;
			g2d.setColor(Color.red);
			for (Shape ellipse : ellipses) {
				g2d.fill(ellipse);
			}
			g2d.setColor(Color.green);
			if (clickedEllipse != null) {
				g2d.fill(clickedEllipse);
			}
		}
	}

}
