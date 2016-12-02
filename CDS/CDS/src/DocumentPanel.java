import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class DocumentPanel extends JPanel implements MouseListener,ActionListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	String[] monthStrings = {"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
	String[] dayStrings;
	String[] yearStrings = {"2016","2017","2018","2019","2020"};
	String[] minuteStrings;
	String[] hourStrings = {"1","2","3","4","5","6","7","8","9","10","11","12"};
	String[] am_pmStrings = {"AM","PM"};
	public DocumentPanel(int x, int y) {
		
		minuteStrings = new String[61];
		dayStrings = new String[32];
		for (int i = 0; i <= 60; i++){
			if (i < 10){
				minuteStrings[i] = "0" + String.valueOf(i);
				dayStrings[i] = "0" + String.valueOf(i);
			} else {
				if (i <= 31){
					dayStrings[i] = String.valueOf(i);
				}
				minuteStrings[i] = String.valueOf(i);
			}
			
		}
		
		JPanel container = new JPanel();
		JPanel titlePanel = new JPanel();
		JPanel injectionPanel = new JPanel();
		JPanel buttonPanel = new JPanel();
		JPanel timePanel = new JPanel();
		JPanel monthpanel = new JPanel();
		JPanel daypanel = new JPanel();
		JPanel yearpanel = new JPanel();
		JPanel minutepanel = new JPanel();
		JPanel hourpanel = new JPanel();
		JPanel am_pmpanel = new JPanel();
		JPanel sigpanel = new JPanel();
		JLabel monthlabel = new JLabel("Month");
		JLabel daylabel = new JLabel("Day");
		JLabel yearlabel = new JLabel("Year");
		JLabel minutelabel = new JLabel("Min");
		JLabel hourlabel = new JLabel("Hour");
		JLabel am_pmlabel = new JLabel("AM/PM");
		JLabel injectionsitelabel = new JLabel("Injection Site: ");
		JLabel timelabel = new JLabel("Time: ");
		JLabel spacelabel = new JLabel("  ");
		JLabel siglabel = new JLabel("Signature: ");
		JTextField field = new JTextField(50);
		field.setFont(new Font("Serif", Font.PLAIN, 30));
		timePanel.setLayout(new FlowLayout());
		sigpanel.setLayout(new FlowLayout());
		injectionPanel.setLayout(new FlowLayout());
		container.setLayout(new BoxLayout(container, BoxLayout.PAGE_AXIS));
		monthpanel.setLayout(new BoxLayout(monthpanel, BoxLayout.PAGE_AXIS));
		daypanel.setLayout(new BoxLayout(daypanel, BoxLayout.PAGE_AXIS));
		yearpanel.setLayout(new BoxLayout(yearpanel, BoxLayout.PAGE_AXIS));
		minutepanel.setLayout(new BoxLayout(minutepanel, BoxLayout.PAGE_AXIS));
		hourpanel.setLayout(new BoxLayout(hourpanel, BoxLayout.PAGE_AXIS));
		am_pmpanel.setLayout(new BoxLayout(am_pmpanel, BoxLayout.PAGE_AXIS));
		String[] messageStrings = {"Abdomen","Top Outer Right Thigh","Top Outer Left Thigh",
				"Upper Outer Right Arm","Upper Outer Left Arm","Right Buttock","Left Buttock"};
		JComboBox box = new JComboBox(messageStrings);
		box.setFont(new Font("Serif", Font.PLAIN, 30));
		JComboBox month = new JComboBox(monthStrings);
		month.setFont(new Font("Serif", Font.PLAIN, 30));
		JComboBox day = new JComboBox(dayStrings);
		day.setFont(new Font("Serif", Font.PLAIN, 30));
		JComboBox year = new JComboBox(yearStrings);
		year.setFont(new Font("Serif", Font.PLAIN, 30));
		JComboBox hour = new JComboBox(hourStrings);
		hour.setFont(new Font("Serif", Font.PLAIN, 30));
		JComboBox minute = new JComboBox(minuteStrings);
		minute.setFont(new Font("Serif", Font.PLAIN, 30));
		JComboBox am_pm = new JComboBox(am_pmStrings);
		am_pm.setFont(new Font("Serif", Font.PLAIN, 30));
		
		box.addActionListener(this);
		
		JLabel text = new JLabel("Documentation");
		JButton button = new JButton("Done");
		button.setSize(100, 20);
		box.setSize(100, 20);
		text.setFont(new Font("Serif", Font.BOLD, 100));
		monthlabel.setFont(new Font("Serif", Font.BOLD, 30));
		daylabel.setFont(new Font("Serif", Font.BOLD, 30));
		yearlabel.setFont(new Font("Serif", Font.BOLD, 30));
		minutelabel.setFont(new Font("Serif", Font.BOLD, 30));
		hourlabel.setFont(new Font("Serif", Font.BOLD, 30));
		am_pmlabel.setFont(new Font("Serif", Font.BOLD, 30));
		spacelabel.setFont(new Font("Serif", Font.BOLD, 30));
		injectionsitelabel.setFont(new Font("Serif", Font.BOLD, 50));
		timelabel.setFont(new Font("Serif", Font.BOLD, 50));
		siglabel.setFont(new Font("Serif", Font.BOLD, 50));
		titlePanel.add(text);
		injectionPanel.add(injectionsitelabel);
		injectionPanel.add(box);
		buttonPanel.add(button);
		timePanel.add(timelabel);
		hourpanel.add(hourlabel);
		hourpanel.add(hour);
		timePanel.add(hourpanel);
		minutepanel.add(minutelabel);
		minutepanel.add(minute);
		timePanel.add(minutepanel);
		am_pmpanel.add(am_pmlabel);
		am_pmpanel.add(am_pm);
		timePanel.add(am_pmpanel);
		timePanel.add(spacelabel);
		monthpanel.add(monthlabel);
		monthpanel.add(month);
		timePanel.add(monthpanel);
		daypanel.add(daylabel);
		daypanel.add(day);
		timePanel.add(daypanel);
		yearpanel.add(yearlabel);
		yearpanel.add(year);
		timePanel.add(yearpanel);
		sigpanel.add(siglabel);
		sigpanel.add(field);
		
		
		
		container.add(titlePanel);
		container.add(new JLabel(" "));
		container.add(injectionPanel);
		container.add(new JLabel(" "));
		container.add(timePanel);
		container.add(new JLabel(" "));
		container.add(sigpanel);
		container.add(new JLabel(" "));
		
		button.addMouseListener(this);
		this.add(container);
	}

	@Override
	public void mouseClicked(MouseEvent arg0) {
		MyApp.nextScreen("document");
		
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

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}