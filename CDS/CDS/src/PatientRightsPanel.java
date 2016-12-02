import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class PatientRightsPanel extends JPanel implements MouseListener {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel title;
	private JPanel rightsPanel, contentPanel;
	private JButton right1,right2,right3,right4,right5,right6,finishButton;
	private CardLayout rightsCardLayout;
	
	public static RightPatient rightPatientPanel;
	JPanel thisPanel = this;
	
	public PatientRightsPanel(int x, int y) {
		
		rightsCardLayout = new CardLayout();
		
		this.setLayout(rightsCardLayout);
		contentPanel = new JPanel(new BorderLayout());
		
		right1 = new JButton("Right Patient");
		right1.setFont(new Font("Serif", Font.PLAIN, 40));
		right1.addMouseListener(this);
		
		right2 = new JButton("Right Drug");
		right2.setFont(new Font("Serif", Font.PLAIN, 40));
		right2.addMouseListener(this);
		
		right3 = new JButton("Right Dose");
		right3.setFont(new Font("Serif", Font.PLAIN, 40));
		right3.addMouseListener(this);
		
		right4 = new JButton("Right Time");
		right4.setFont(new Font("Serif", Font.PLAIN, 40));
		right4.addMouseListener(this);
		
		right5 = new JButton("Right Route");
		right5.setFont(new Font("Serif", Font.PLAIN, 40));
		right5.addMouseListener(this);
		
		right6 = new JButton("Documentation");
		right6.setFont(new Font("Serif", Font.PLAIN, 40));
		right6.addMouseListener(this);
		
		rightsPanel = new JPanel(new GridLayout(6,0));
		rightsPanel.add(right1);
		rightsPanel.add(right2);
		rightsPanel.add(right3);
		rightsPanel.add(right4);
		rightsPanel.add(right5);
		rightsPanel.add(right6);
		
		
		title = new JLabel("Six Rights", SwingConstants.CENTER);
		title.setFont(new Font("Serif", Font.BOLD, MyApp.FRAME_WIDTH/20));
		
		finishButton = new JButton("Finished");
		finishButton.setFont(new Font("Serif", Font.PLAIN, 30));
		finishButton.addMouseListener(this);
		
		contentPanel.add(title, BorderLayout.NORTH);
		contentPanel.add(rightsPanel, BorderLayout.CENTER);
		contentPanel.add(finishButton, BorderLayout.SOUTH);
		
		rightPatientPanel = new RightPatient();
		
		this.add(contentPanel, "1");
		this.add(rightPatientPanel, "2");
		rightsCardLayout.show(this, "1");
	}
	
	public void nextScreen(String constraint){
		rightsCardLayout.show(thisPanel, constraint);
	}
	
	
	@Override
	public void mouseClicked(MouseEvent arg0) {
		if(arg0.getSource() == finishButton)
		{
		MyApp.nextScreen("rights");
		}
		else if(arg0.getSource() == right1)
		{
		nextScreen("2");
		}
		else if(arg0.getSource() == right2)
		{
		nextScreen("3");
		}
		else if(arg0.getSource() == right3)
		{
		nextScreen("4");
		}
		else if(arg0.getSource() == right4)
		{
		nextScreen("5");
		}
		else if(arg0.getSource() == right5)
		{
		nextScreen("6");
		}
		else if(arg0.getSource() == right6)
		{
		nextScreen("7");
		}
		
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