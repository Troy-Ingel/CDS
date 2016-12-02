import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class RightPatient extends JPanel implements MouseListener {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 3161067252773054869L;
	private JCheckBox check1, check2, check3;
	private JPanel contentPanel, checkBoxPanel;
	private JButton finishButton;
	private JLabel title;

	public RightPatient(){
		//cardLayout = new CardLayout();
		this.setLayout(new BorderLayout());
		checkBoxPanel = new JPanel();
		checkBoxPanel.setLayout(new GridLayout(3,0));
		
		check1 = new JCheckBox("Verify patient by checking his or her identification bracelet/armband");
		check1.setFont(new Font("Serif", Font.PLAIN, 50));
		check2 = new JCheckBox("Ask the patient his or her name. Do not call the patient by name. \n Some clients will answer to any name. Ask for his or her date of birth (not always required)");
		check2.setFont(new Font("Serif", Font.PLAIN, 50));
		check2.setSize(new Dimension(MyApp.FRAME_WIDTH, MyApp.FRAME_HEIGHT));
		check3 = new JCheckBox("Check the name on the patient's medication label or profile in the EMAR");
		check3.setFont(new Font("Serif", Font.PLAIN, 50));
		
		checkBoxPanel.add(check1);
		checkBoxPanel.add(check2);
		checkBoxPanel.add(check3);
		
		finishButton = new JButton("Finished");
		finishButton.addMouseListener(this);
		
		title = new JLabel("Right Patient", SwingConstants.CENTER);
		title.setFont(new Font("Serif", Font.PLAIN, 40));
		
		this.add(title, BorderLayout.NORTH);
		this.add(checkBoxPanel, BorderLayout.CENTER);
		this.add(finishButton, BorderLayout.SOUTH);
		//this.add(comp, constraints);
		
	}

	@Override
	public void mouseClicked(MouseEvent arg0) {
		MyApp.rights.nextScreen("1");
		
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
