package teamwork2;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPanel;
import javax.swing.JButton;

public class Scientific {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Scientific window = new Scientific();
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
	public Scientific() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(10, 11, 46, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBounds(66, 11, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setBounds(125, 11, 46, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setBounds(10, 30, 414, 29);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setBounds(10, 73, 46, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 90, 214, 172);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(0, 11, 70, 23);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.setBounds(80, 11, 58, 23);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("New button");
		btnNewButton_2.setBounds(144, 11, 70, 23);
		panel.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("New button");
		btnNewButton_3.setBounds(0, 50, 70, 23);
		panel.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("New button");
		btnNewButton_4.setBounds(80, 50, 58, 23);
		panel.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("New button");
		btnNewButton_5.setBounds(144, 50, 70, 23);
		panel.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("New button");
		btnNewButton_6.setBounds(0, 92, 70, 23);
		panel.add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("New button");
		btnNewButton_7.setBounds(0, 138, 70, 23);
		panel.add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("New button");
		btnNewButton_8.setBounds(80, 92, 58, 23);
		panel.add(btnNewButton_8);
		
		JButton btnNewButton_9 = new JButton("New button");
		btnNewButton_9.setBounds(144, 92, 70, 23);
		panel.add(btnNewButton_9);
		
		JButton btnNewButton_10 = new JButton("New button");
		btnNewButton_10.setBounds(81, 138, 58, 23);
		panel.add(btnNewButton_10);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(224, 90, 210, 172);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_4 = new JLabel("New label");
		lblNewLabel_4.setBounds(225, 73, 46, 14);
		frame.getContentPane().add(lblNewLabel_4);
	}

}
