package teamwork2;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Converter {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	double num1;
	double num2;
	double result1;
	double result2;
	String ans1;
	String ans2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Converter window = new Converter();
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
	public Converter() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 350, 250);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("Cancel");
		btnNewButton.setBounds(217, 155, 89, 23);
		frame.getContentPane().add(btnNewButton);
		JLabel Label_4 = new JLabel("");
		Label_4.setBounds(248, 72, 46, 14);
		frame.getContentPane().add(Label_4);
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setBounds(248, 106, 46, 14);
		frame.getContentPane().add(lblNewLabel_5);
		
		JButton btnNewButton_1 = new JButton("Ok");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				num1=Double.parseDouble(textField.getText());
			    num2=Double.parseDouble(textField_1.getText());
			    result1=num1/3.8;
			    String ans1=String.format("%.2f",result1);
			    Label_4.setText(ans1);
			    result2=num2/2.05;
			    String ans2=String.format("%.2f",result2);
			    lblNewLabel_5.setText(ans2);   
			}
		});
		btnNewButton_1.setBounds(56, 155, 89, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		textField = new JTextField();
		textField.setBounds(117, 69, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(117, 100, 86, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Height");
		lblNewLabel.setBounds(50, 72, 46, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Weight");
		lblNewLabel_1.setBounds(50, 103, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("US measurement");
		lblNewLabel_2.setBounds(117, 44, 86, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Metric");
		lblNewLabel_3.setBounds(248, 44, 46, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		
	}
}
