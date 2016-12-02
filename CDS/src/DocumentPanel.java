
/***
 * Brian Carducci, Troy Ingel
 * Insulin Administration Clinical Decision Support System
 * SER360
***/
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Shape;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.geom.*;
import java.util.ArrayList;
import java.util.Calendar;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.border.Border;

public class DocumentPanel extends JPanel {
	// variables
	private Border lineBorder;
	private String[] monthStrings = { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov",
			"Dec" };
	private String[] yearStrings = { "2016", "2017", "2018", "2019", "2020" };
	private String[] minuteStrings = { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12",
			"13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30",
			"31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48",
			"49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59" };
	private String[] hourStrings = { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13",
			"14", "15", "16", "17", "18", "19", "20", "21", "22", "23" };
	private String[] dayStrings = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15",
			"16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" };
	public static JCheckBox refuseCheckBox;
	public static JTextField noteBox;
	public static JComboBox<String> monthBox, dayBox, yearBox, hourBox, minuteBox;

	// CONSTRUCTOR
	public DocumentPanel() {
		// Set up image with a border
		lineBorder = BorderFactory.createLineBorder(Color.black);
		ImageIcon bodyImage = new ImageIcon("Images/human_outline.jpg");
		JLabel imageLabel = new JLabel(bodyImage);
		imageLabel.setBorder(lineBorder);
		// Create the labels
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
		JPanel sigpanel = new JPanel();
		JPanel refuseNotePanel = new JPanel();
		JLabel monthlabel = new JLabel("Month");
		JLabel daylabel = new JLabel("Day");
		JLabel yearlabel = new JLabel("Year");
		JLabel minutelabel = new JLabel("Min");
		JLabel hourlabel = new JLabel("Hour");
		JLabel am_pmlabel = new JLabel("AM/PM");
		JLabel noteLabel = new JLabel("Notes:");
		noteLabel.setFont(new Font("Serif", Font.PLAIN, 50));
		refuseCheckBox = new JCheckBox("Patient Refused");
		JLabel timelabel = new JLabel("Time: ");
		JLabel spacelabel = new JLabel("  ");
		JLabel siglabel = new JLabel("Signature: ");
		JTextField field = new JTextField(50);
		field.setFont(new Font("Serif", Font.PLAIN, 30));
		// text field to enter nots in
		noteBox = new JTextField(50);
		noteBox.setPreferredSize(new Dimension(200, 200));
		noteBox.setFont(new Font("Serif", Font.PLAIN, 30));

		// set layout for all the panels
		timePanel.setLayout(new FlowLayout());
		sigpanel.setLayout(new FlowLayout());
		injectionPanel.setLayout(new FlowLayout());
		container.setLayout(new BoxLayout(container, BoxLayout.PAGE_AXIS));
		monthpanel.setLayout(new BoxLayout(monthpanel, BoxLayout.PAGE_AXIS));
		daypanel.setLayout(new BoxLayout(daypanel, BoxLayout.PAGE_AXIS));
		yearpanel.setLayout(new BoxLayout(yearpanel, BoxLayout.PAGE_AXIS));
		minutepanel.setLayout(new BoxLayout(minutepanel, BoxLayout.PAGE_AXIS));
		hourpanel.setLayout(new BoxLayout(hourpanel, BoxLayout.PAGE_AXIS));
		refuseNotePanel.setLayout(new BoxLayout(refuseNotePanel, BoxLayout.Y_AXIS));
		// get instance of calendar to get current time
		Calendar t = Calendar.getInstance();
		// set up month combo box
		monthBox = new JComboBox<String>(monthStrings);
		monthBox.setFont(new Font("Serif", Font.PLAIN, 30));
		monthBox.setSelectedItem(monthStrings[t.get(Calendar.MONTH)]);
		// set up day combo box
		dayBox = new JComboBox<String>(dayStrings);
		dayBox.setFont(new Font("Serif", Font.PLAIN, 30));
		dayBox.setSelectedItem(Integer.toString(t.get(Calendar.DAY_OF_MONTH)));
		// set up day combo box
		yearBox = new JComboBox<String>(yearStrings);
		yearBox.setFont(new Font("Serif", Font.PLAIN, 30));
		yearBox.setSelectedItem(Integer.toString(t.get(Calendar.YEAR)));
		// set up hour combo box, if statement converts to military time by
		// adding 12
		hourBox = new JComboBox<String>(hourStrings);
		hourBox.setFont(new Font("Serif", Font.PLAIN, 30));
		if (t.get(Calendar.AM_PM) == 0) {
			if (t.get(Calendar.HOUR) < 10)
				hourBox.setSelectedItem("0" + Integer.toString(t.get(Calendar.HOUR)));
			else
				hourBox.setSelectedItem(Integer.toString(t.get(Calendar.HOUR)));
		}
		if (t.get(Calendar.AM_PM) == 1)
			hourBox.setSelectedItem(Integer.toString(t.get(Calendar.HOUR) + 12));
		// set up minute combo box, if statement adds a 0 if minute is less than
		// 10
		minuteBox = new JComboBox<String>(minuteStrings);
		minuteBox.setFont(new Font("Serif", Font.PLAIN, 30));
		if (t.get(Calendar.MINUTE) < 10)
			minuteBox.setSelectedItem("0" + Integer.toString(t.get(Calendar.MINUTE)));
		if (t.get(Calendar.MINUTE) >= 10)
			minuteBox.setSelectedItem(Integer.toString(t.get(Calendar.MINUTE)));

		JLabel injectionLabel = new JLabel("Click the injection site:");
		// set the font of the labels
		injectionLabel.setFont(new Font("Serif", Font.PLAIN, 50));
		monthlabel.setFont(new Font("Serif", Font.BOLD, 30));
		daylabel.setFont(new Font("Serif", Font.BOLD, 30));
		yearlabel.setFont(new Font("Serif", Font.BOLD, 30));
		minutelabel.setFont(new Font("Serif", Font.BOLD, 30));
		hourlabel.setFont(new Font("Serif", Font.BOLD, 30));
		am_pmlabel.setFont(new Font("Serif", Font.BOLD, 30));
		spacelabel.setFont(new Font("Serif", Font.BOLD, 30));
		// injectionsitelabel.setFont(new Font("Serif", Font.BOLD, 50));
		timelabel.setFont(new Font("Serif", Font.BOLD, 50));
		siglabel.setFont(new Font("Serif", Font.BOLD, 50));
		refuseCheckBox.setFont(new Font("Serif", Font.PLAIN, 50));
		titlePanel.add(injectionLabel);

		injectionPanel.add(imageLabel, BorderLayout.CENTER);
		// injectionPanel.add(box);

		refuseNotePanel.add(refuseCheckBox);
		refuseNotePanel.add(noteLabel);
		refuseNotePanel.add(noteBox);

		JLabel dateLabel = new JLabel("Date:");
		dateLabel.setFont(new Font("Serif", Font.BOLD, 50));
		// set up panels, labels and combo boxes for date and time
		timePanel.add(timelabel);
		hourpanel.add(hourlabel);
		hourpanel.add(hourBox);
		timePanel.add(hourpanel);
		minutepanel.add(minutelabel);
		minutepanel.add(minuteBox);
		timePanel.add(minutepanel);
		timePanel.add(spacelabel);
		monthpanel.add(monthlabel);
		monthpanel.add(monthBox);
		timePanel.add(dateLabel);
		timePanel.add(new JLabel(" "));
		timePanel.add(monthpanel);
		daypanel.add(daylabel);
		daypanel.add(dayBox);
		timePanel.add(daypanel);
		yearpanel.add(yearlabel);
		yearpanel.add(yearBox);
		timePanel.add(yearpanel);
		sigpanel.add(siglabel);
		sigpanel.add(field);
		// add all panels to the container
		container.add(titlePanel);
		container.add(new JLabel(" "));
		container.add(injectionPanel);
		container.add(new JLabel(" "));
		container.add(timePanel);
		container.add(new JLabel(" "));
		container.add(refuseNotePanel);
		container.add(new JLabel(" "));
		container.add(sigpanel);
		container.add(new JLabel(" "));
		// handle when the scroll bar should appear
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
		container.add(scrollPane);
		// add container to panel
		add(container);

	}

}