import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class SwingPaint {

	JButton clearBtn;
	DrawArea drawArea;
	ActionListener actionListener = new ActionListener() {

		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == clearBtn) {
				drawArea.clear();
			}
		}
	};

	public static void main(String[] args) {
		new SwingPaint().show();
	}

	public void show() {
		// create main frame
		JFrame frame = new JFrame("Swing Paint");
		Container content = frame.getContentPane();
		// set layout on content pane
		content.setLayout(new BorderLayout());
		// create draw area
		drawArea = new DrawArea();

		// add to content pane
		content.add(drawArea, BorderLayout.CENTER);

		// create controls to apply colors and call clear feature
		JPanel controls = new JPanel();

		clearBtn = new JButton("Clear");
		clearBtn.addActionListener(actionListener);
		

		// add to panel
		controls.add(clearBtn);

		// add to content pane
		content.add(controls, BorderLayout.NORTH);

		frame.setSize(500, 500);
		// can close frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// show the swing paint result
		frame.setVisible(true);

		
	}

}