
/***
 * Brian Carducci, Troy Ingel
 * Insulin Administration Clinical Decision Support System
 * SER360
***/
import java.awt.Font;
import java.awt.Shape;

import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class SummaryPanel extends JPanel {
	// variables
	private JLabel summaryLabel, dateLabel, timeLabel, injectionLabel, refuseLabel, notesLabel;

	// constructor
	public SummaryPanel() {
		// set layout
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		summaryLabel = new JLabel("Summary", SwingConstants.CENTER);
		// create labels
		dateLabel = new JLabel();
		timeLabel = new JLabel();
		injectionLabel = new JLabel();
		refuseLabel = new JLabel();
		notesLabel = new JLabel("Notes: " + DocumentPanel.noteBox.getText());
		// set font of labels
		summaryLabel.setFont(new Font("Serif", Font.PLAIN, 50));
		dateLabel.setFont(new Font("Serif", Font.PLAIN, 50));
		timeLabel.setFont(new Font("Serif", Font.PLAIN, 50));
		injectionLabel.setFont(new Font("Serif", Font.PLAIN, 50));
		refuseLabel.setFont(new Font("Serif", Font.PLAIN, 50));
		notesLabel.setFont(new Font("Serif", Font.PLAIN, 50));
		// add all components to the panel
		add(summaryLabel);
		add(injectionLabel);
		add(dateLabel);
		add(timeLabel);
		add(refuseLabel);
		add(notesLabel);
	}
	/**
	 * Method that generates a summary based on values from previous pages
	 * 1. sets the time and date
	 * 2. shows the location that the user selected for the injection
	 * 3. shows if the patient refused the drug or not
	 * 4. shows any notes that the user has added
	 **/
	public void updateComponents() {
		dateLabel.setText("Date: " + DocumentPanel.monthBox.getItemAt(DocumentPanel.monthBox.getSelectedIndex()) + " "
				+ DocumentPanel.dayBox.getItemAt(DocumentPanel.dayBox.getSelectedIndex()) + ", "
				+ DocumentPanel.yearBox.getItemAt(DocumentPanel.yearBox.getSelectedIndex()));
		timeLabel.setText("Time: " + DocumentPanel.hourBox.getItemAt(DocumentPanel.hourBox.getSelectedIndex()) + ":"
				+ DocumentPanel.minuteBox.getItemAt(DocumentPanel.minuteBox.getSelectedIndex()));

		if (DocumentPanel.refuseCheckBox.isSelected()) {
			refuseLabel.setText("Patient Refused: Yes");
		} else {
			refuseLabel.setText("Patient Refused: No");
		}

		notesLabel.setText("Notes: " + DocumentPanel.noteBox.getText());
		injectionLabel.setText("Injection Site: ");

		int index = 0;
		for (int i = 0; i < MyApp.ellipses.size(); i++) {
			if (MyApp.ellipses.get(i) == MyApp.clickedEllipse) {
				index = i;
				break;
			}
		}
		if (index == 0) {
			injectionLabel.setText("InjectionSite: Upper Outer Left Arm");
		}
		if (index == 1) {
			injectionLabel.setText("InjectionSite: Upper Outer Right Arm");
		}
		if (index == 2) {
			injectionLabel.setText("InjectionSite: Abdomen");
		}
		if (index == 3) {
			injectionLabel.setText("InjectionSite: Outer Left Thigh");
		}
		if (index == 4) {
			injectionLabel.setText("InjectionSite: Upper Outer Left Arm");
		}
		if (index == 5) {
			injectionLabel.setText("InjectionSite: Left Buttocks");
		}
		if (index == 6) {
			injectionLabel.setText("InjectionSite: Right Buttocks");
		}

		if (DocumentPanel.refuseCheckBox.isSelected()) {
			refuseLabel.setText("Patient Refused: Yes");
			injectionLabel.setText("Injection Site: None");
		} else {
			refuseLabel.setText("Patient Refused: No");
		}

	}

}
