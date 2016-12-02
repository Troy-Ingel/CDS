import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class InsulinInjectionPanel extends JPanel implements MouseListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JButton b1;
	JButton b2;
	JButton b3;
	JButton button;
	JPanel b1panel;
	JPanel b2panel;
	JPanel b3panel;
	public static CardLayout card = new CardLayout();
	public static JPanel container = new JPanel();

	public InsulinInjectionPanel() {
		this.setLayout(new BorderLayout());
		container.setLayout(card);
		b1 = new JButton("Prepare Insulin Bottle");
		b2 = new JButton("Prepare Insulin Needle");
		b3 = new JButton("Perform Insulin Injection");
		b1.setFont(new Font("Serif", Font.PLAIN, 50));
		b2.setFont(new Font("Serif", Font.PLAIN, 50));
		b3.setFont(new Font("Serif", Font.PLAIN, 50));
		
		JLabel text = new JLabel("WELCOME TO INJECTION", SwingConstants.CENTER);
		JLabel b1text = new JLabel("");
		JLabel b2text = new JLabel("");
		JLabel b3text = new JLabel("");
		b1panel = new JPanel();
		b2panel = new JPanel();
		b3panel = new JPanel();
		JPanel north = new JPanel();
		button = new JButton("Next");
		button.setFont(new Font("Serif", Font.PLAIN, 30));

		b1text.setText("<html>1. Wash Hands" + "<br>"
				+ "<br>2.  roll the bottle between your hands until it is uniformly cloudy" + "<br>"
				+ "<br>3. Wipe the top of the insulin bottle with an Alcohol Swab" + "</html>");
		b2text.setText("<html>1. Pull plunger down to let air in the syringe equal to the amount of insulin needed"
				+ "<br>" + "<br>2. Push the needle through the center of the rubber top of the insulin bottle" + "<br>"
				+ "<br>3. Push the air into the insulin bottle, leave the needle in the insulin bottle" + "<br>"
				+ "<br>4. Turn the insulin bottle and syringe upside down" + "<br>"
				+ "<br>5. Pull the plunger down slowly to get insulin into the syringe. Be sure to get the right number of units."
				+ "<br>"
				+ "<br>6. Check syringe to make sure you have right units and no air bubbles, pull syringe out of bottle"
				+ "</html>");
		b3text.setText(
				"<html>1. Clean a small area of skin  with an ALCOHOL SWAB. Let the alcohol dry completely before you inject"
						+ "<br>" + "<br>2. Do not let the needle touch anything" + "<br>" + "<br>3. Pinch up the skin"
						+ "<br>" + "<br>4.Push the needle through the skin" + "<br>"
						+ "<br>5. Push the insulin in with the plunger" + "<br>"
						+ "<br>6. Pull the needle out of the skin" + "<br>"
						+ "<br>7. Press your finger or an alcohol swab over the spot you gave the injection"
						+ "</html>");

		north.setLayout(new FlowLayout());
		b1.addMouseListener(this);
		b2.addMouseListener(this);
		b3.addMouseListener(this);
		north.add(b1);
		north.add(b2);
		north.add(b3);

		button.setBounds(200, 45, 100, 20);
		text.setSize(500, 50);
		text.setFont(new Font("Serif", Font.BOLD, 40));

		b1text.setSize(50, 50);
		b1text.setFont(new Font("Serif", Font.BOLD, 40));
		b1panel.add(b1text);

		b2text.setSize(50, 50);
		b2text.setFont(new Font("Serif", Font.BOLD, 40));
		b2panel.add(b2text);

		b3text.setSize(50, 50);
		b3text.setFont(new Font("Serif", Font.BOLD, 40));
		b3panel.add(b3text);

		container.add(b1panel, "1");
		container.add(b2panel, "2");
		container.add(b3panel, "3");

		this.add(north, BorderLayout.NORTH);
		this.add(container, BorderLayout.CENTER);
		this.add(button, BorderLayout.SOUTH);
		button.addMouseListener(this);
		card.show(container, "1");

	}

	@Override
	public void mouseClicked(MouseEvent arg0) {
		if (arg0.getSource() == button) {
			MyApp.nextScreen("insulin");

		}
		if (arg0.getSource() == b1) {
			card.show(container, "1");

		}
		if (arg0.getSource() == b2)
			card.show(container, "2");
		if (arg0.getSource() == b3)
			card.show(container, "3");
		// this.revalidate();

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
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}
}