import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class BMI {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	double num1;
	double num2;
	double res;
	String ans;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BMI window = new BMI();
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
	public BMI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 300, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(34, 139, 34));
		panel.setBounds(0, 0, 284, 79);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblBodyMassIndex = new JLabel("Body Mass Index");
		lblBodyMassIndex.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblBodyMassIndex.setBounds(69, 11, 151, 27);
		panel.add(lblBodyMassIndex);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(34, 139, 34));
		panel_1.setBounds(0, 90, 284, 237);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Height(m)");
		lblNewLabel.setBounds(67, 25, 67, 14);
		panel_1.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Weight(kg)");
		lblNewLabel_1.setBounds(67, 71, 67, 14);
		panel_1.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(144, 22, 86, 20);
		panel_1.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(144, 68, 86, 20);
		panel_1.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("BMI");
		lblNewLabel_2.setBounds(26, 134, 46, 14);
		panel_1.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setBounds(160, 134, 93, 14);
		panel_1.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setBackground(new Color(255, 140, 0));
		lblNewLabel_4.setBounds(88, 134, 46, 14);
		panel_1.add(lblNewLabel_4);
		
		
		JButton btnNewButton = new JButton("Calculate");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				num1=Double.parseDouble(textField.getText());
				num2=Double.parseDouble(textField_1.getText());
				res=num2/(num1*num1);
				String ans=String.format("%.2f",res);
				lblNewLabel_4.setText(ans);
				if(res<18.5)
				{
					lblNewLabel_3.setText("under weight");
				}
				else if(res>=18.5&&res<=24.9)
				{
					lblNewLabel_3.setText("Normal weight");
				}
				else if(res>=25&&res<=29.9)
				{
					lblNewLabel_3.setText("over weight");
				}
				else
				{
					lblNewLabel_3.setText("obese");
				}


			}
		});
		btnNewButton.setBounds(10, 185, 89, 23);
		panel_1.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Clear");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText(null);
				textField_1.setText(null);
				lblNewLabel_3.setText(null);
				lblNewLabel_4.setText(null);
			}
		});
		btnNewButton_1.setBounds(109, 185, 72, 23);
		panel_1.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Exit");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton_2.setBounds(207, 185, 67, 23);
		panel_1.add(btnNewButton_2);
		
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(34, 139, 34));
		panel_2.setBounds(0, 338, 284, 124);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
	}
}
