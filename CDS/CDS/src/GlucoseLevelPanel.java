import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.Border;

public class GlucoseLevelPanel extends JPanel implements MouseListener {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private ImageIcon glucoseImage;
	private JLabel glucoseImageLabel;
	private JPanel titleButtonPanel, checkBoxPanel, imagePanel;
	private JCheckBox check1, check2, check3, check4;
	private Border lineBorder;
	
	public GlucoseLevelPanel() {
		this.setLayout(new GridLayout(0,3));
		
		lineBorder = BorderFactory.createLineBorder(Color.black);
		
		checkBoxPanel = new JPanel();
		checkBoxPanel.setLayout(new GridLayout(4,0));
		checkBoxPanel.setOpaque(true);
		checkBoxPanel.setBackground(Color.yellow);
		checkBoxPanel.setBorder(lineBorder);
		
		check1 = new JCheckBox("Insert test strip into meter");
		check2 = new JCheckBox("Use lancing device on side of fingertip to get drop of blood");
		check3 = new JCheckBox("Hold edge of test strip to drop of blood");
		check4 = new JCheckBox("Read result from meter");
		
		check1.setSize(new Dimension(MyApp.FRAME_WIDTH/3, MyApp.FRAME_HEIGHT/4));
		check1.setFont(new Font("Serif", Font.PLAIN, 50));
		check1.setBackground(Color.yellow);
		
		check2.setSize(new Dimension(MyApp.FRAME_WIDTH/3, MyApp.FRAME_HEIGHT/4));
		check2.setFont(new Font("Serif", Font.PLAIN, 50));
		check2.setBackground(Color.yellow);
		
		check3.setSize(new Dimension(MyApp.FRAME_WIDTH/3, MyApp.FRAME_HEIGHT/4));
		check3.setFont(new Font("Serif", Font.PLAIN, 50));
		check3.setBackground(Color.yellow);
		
		check4.setSize(new Dimension(MyApp.FRAME_WIDTH/3, MyApp.FRAME_HEIGHT/4));
		check4.setFont(new Font("Serif", Font.PLAIN, 50));
		check4.setBackground(Color.yellow);
		
		checkBoxPanel.add(check1);
		checkBoxPanel.add(check2);
		checkBoxPanel.add(check3);
		checkBoxPanel.add(check4);
		
		titleButtonPanel = new JPanel();
		titleButtonPanel.setLayout(new GridLayout(2,0));
		titleButtonPanel.setOpaque(true);
		titleButtonPanel.setBackground(Color.green);
		titleButtonPanel.setBorder(lineBorder);
		
		JButton button = new JButton("Next");
		button.addMouseListener(this);
		button.setPreferredSize(new Dimension(MyApp.FRAME_WIDTH/3,MyApp.FRAME_HEIGHT/12));
		button.setFont(new Font("Serif", Font.PLAIN, 40));
		
		JLabel title = new JLabel("Check Glucose", SwingConstants.CENTER);
		title.setFont(new Font("Serif", Font.BOLD, MyApp.FRAME_WIDTH/20));
		
		titleButtonPanel.add(title);
		titleButtonPanel.add(button);
		
		imagePanel = new JPanel();
		imagePanel.setLayout(new GridLayout());
		imagePanel.setBackground(Color.blue);
		imagePanel.setBorder(lineBorder);
		
		this.add(checkBoxPanel);
		this.add(titleButtonPanel);
		
		glucoseImageLabel = new JLabel();
		glucoseImageLabel.setOpaque(true);
		glucoseImageLabel.setBackground(Color.blue);
		glucoseImage = new ImageIcon("Images/glucose_chart.jpg");
		glucoseImageLabel.setIcon(glucoseImage);
		imagePanel.add(glucoseImageLabel);
		
		
		this.add(glucoseImageLabel);		
		
	}
	
//	public Image loadScaledImage(String path, JLabel label){
//		BufferedImage img = null;
//		try {
//		    img = ImageIO.read(new File(path));
//		} catch (IOException e) {
//		    e.printStackTrace();
//		}
//		
//		Image dimg = img.getScaledInstance(label.getWidth(), label.getHeight(),
//		        Image.SCALE_SMOOTH);
//		
//		return dimg;
//	}

	@Override
	public void mouseClicked(MouseEvent arg0) {
		MyApp.nextScreen("glucose");
		
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