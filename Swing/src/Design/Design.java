package Design;

import java.awt.EventQueue;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;

public class Design {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Design window = new Design();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	
	
	

	/**
	 * Create the application.
	 */
	public Design() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 927, 489);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(240, 240, 240));
		panel.setBounds(336, 11, 548, 429);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel show_image = new JLabel("");
		//lblNewLabel.setIcon(newImageIcon(Test.class.getResource("/logo.png")));
		//lblNewLabel.update("logo.PNG, true,2,2,2,2");
		show_image.setBounds(0, 0, 548, 429);
		panel.add(show_image);
	}




}