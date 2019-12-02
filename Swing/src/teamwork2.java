

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.JToggleButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.border.TitledBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class teamwork2 {

	private JFrame frmStuedentDetails;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					teamwork2 window = new teamwork2();
					window.frmStuedentDetails.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public teamwork2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmStuedentDetails = new JFrame();
		frmStuedentDetails.setTitle("Student Details");
		frmStuedentDetails.getContentPane().setBackground(Color.GRAY);
		frmStuedentDetails.setBounds(100, 100, 892, 497);
		frmStuedentDetails.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmStuedentDetails.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Student Details", TitledBorder.CENTER, TitledBorder.ABOVE_TOP, null, Color.BLUE));
		panel.setBackground(Color.CYAN);
		panel.setBounds(10, 11, 435, 299);
		frmStuedentDetails.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Student_ID");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setBounds(10, 11, 82, 29);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Firstname");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(10, 51, 82, 29);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Surename");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_2.setBounds(10, 97, 82, 29);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("CourseCode");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_3.setBounds(10, 141, 82, 29);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Total Score");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_4.setBounds(10, 188, 82, 32);
		panel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Average");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_5.setBounds(10, 224, 82, 29);
		panel.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Ranking");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_6.setBounds(10, 264, 82, 24);
		panel.add(lblNewLabel_6);
		
		textField = new JTextField();
		textField.setBounds(102, 17, 93, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(102, 57, 93, 20);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(102, 103, 93, 20);
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"301", "302", "303", "304", "305", "306"}));
		comboBox.setBounds(102, 147, 93, 20);
		panel.add(comboBox);
		
		textField_3 = new JTextField();
		textField_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
			////double[] R=new double[15];
           // R[0]=Double.parseDouble(textField_25.getText());//maths
            //R[1]=Double.parseDouble(textField_26.getText());//Computer

		});
		textField_3.setBounds(102, 196, 93, 20);
		panel.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(102, 230, 93, 20);
		panel.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(102, 268, 93, 20);
		panel.add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("Maths");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_7.setBounds(220, 14, 75, 23);
		panel.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("English");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_8.setBounds(220, 58, 53, 14);
		panel.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("Biology");
		lblNewLabel_9.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_9.setBounds(220, 104, 53, 14);
		panel.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("Computer");
		lblNewLabel_10.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_10.setBounds(220, 148, 64, 14);
		panel.add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("Chemisrty");
		lblNewLabel_11.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_11.setBounds(220, 181, 75, 14);
		panel.add(lblNewLabel_11);
		
		JLabel lblNewLabel_12 = new JLabel("Tamil");
		lblNewLabel_12.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_12.setBounds(220, 249, 53, 14);
		panel.add(lblNewLabel_12);
		
		JLabel lblNewLabel_13 = new JLabel("Malayalam");
		lblNewLabel_13.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_13.setBounds(220, 274, 75, 14);
		panel.add(lblNewLabel_13);
		
		JLabel lblNewLabel_14 = new JLabel("Physics");
		lblNewLabel_14.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_14.setBounds(220, 214, 53, 14);
		panel.add(lblNewLabel_14);
		
		textField_6 = new JTextField();
		textField_6.addKeyListener(new KeyAdapter() {
			@Override
			
			public void keyTyped(java.awt.event.KeyEvent evt) {
                char num=evt.getKeyChar();
                if(!(Character.isDigit(num))
                        ||(num==KeyEvent.VK_BACK_SPACE)
                        ||(num==KeyEvent.VK_DELETE)) {
                    evt.consume();
                }
            
			}
		});
		textField_6.setBounds(339, 17, 86, 20);
		panel.add(textField_6);
		textField_6.setColumns(10);
		
		textField_7 = new JTextField();
		textField_7.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(java.awt.event.KeyEvent evt) {
                char num=evt.getKeyChar();
                if(!(Character.isDigit(num))
                        ||(num==KeyEvent.VK_BACK_SPACE)
                        ||(num==KeyEvent.VK_DELETE)) {
                    evt.consume();
                }
            
			
			}
		});
		textField_7.setBounds(339, 57, 86, 20);
		panel.add(textField_7);
		textField_7.setColumns(10);
		
		textField_8 = new JTextField();
		textField_8.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(java.awt.event.KeyEvent evt) {
                char num=evt.getKeyChar();
                if(!(Character.isDigit(num))
                        ||(num==KeyEvent.VK_BACK_SPACE)
                        ||(num==KeyEvent.VK_DELETE)) {
                    evt.consume();
                }
            
			}
		});
		textField_8.setBounds(339, 103, 86, 20);
		panel.add(textField_8);
		textField_8.setColumns(10);
		
		textField_9 = new JTextField();
		textField_9.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(java.awt.event.KeyEvent evt) {
                char num=evt.getKeyChar();
                if(!(Character.isDigit(num))
                        ||(num==KeyEvent.VK_BACK_SPACE)
                        ||(num==KeyEvent.VK_DELETE)) {
                    evt.consume();
                }
            
			}
		});
		textField_9.setBounds(339, 142, 86, 20);
		panel.add(textField_9);
		textField_9.setColumns(10);
		
		textField_10 = new JTextField();
		textField_10.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(java.awt.event.KeyEvent evt) {
                char num=evt.getKeyChar();
                if(!(Character.isDigit(num))
                        ||(num==KeyEvent.VK_BACK_SPACE)
                        ||(num==KeyEvent.VK_DELETE)) {
                    evt.consume();
                }
            
			}
		});
		textField_10.setBounds(339, 180, 86, 20);
		panel.add(textField_10);
		textField_10.setColumns(10);
		
		textField_11 = new JTextField();
		textField_11.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(java.awt.event.KeyEvent evt) {
                char num=evt.getKeyChar();
                if(!(Character.isDigit(num))
                        ||(num==KeyEvent.VK_BACK_SPACE)
                        ||(num==KeyEvent.VK_DELETE)) {
                    evt.consume();
                }
            
			}
		});
		textField_11.setBounds(339, 213, 86, 20);
		panel.add(textField_11);
		textField_11.setColumns(10);
		
		textField_12 = new JTextField();
		textField_12.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(java.awt.event.KeyEvent evt) {
                char num=evt.getKeyChar();
                if(!(Character.isDigit(num))
                        ||(num==KeyEvent.VK_BACK_SPACE)
                        ||(num==KeyEvent.VK_DELETE)) {
                    evt.consume();
                }
            
			}
		});
		textField_12.setBounds(339, 248, 86, 20);
		panel.add(textField_12);
		textField_12.setColumns(10);
		
		textField_13 = new JTextField();
		textField_13.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(java.awt.event.KeyEvent evt) {
                char num=evt.getKeyChar();
                if(!(Character.isDigit(num))
                        ||(num==KeyEvent.VK_BACK_SPACE)
                        ||(num==KeyEvent.VK_DELETE)) {
                    evt.consume();
                }
            
			}
		});
		textField_13.setBounds(339, 273, 86, 20);
		panel.add(textField_13);
		textField_13.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(null, "Student Report", TitledBorder.CENTER, TitledBorder.ABOVE_TOP, null, Color.BLUE));
		panel_1.setBackground(Color.CYAN);
		panel_1.setBounds(476, 11, 390, 299);
		frmStuedentDetails.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(10, 22, 370, 243);
		panel_1.add(textArea);
		
		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//String number1=String.parseString(textField.getText());

				textArea.setText("");
			}
		});
		btnClear.setBounds(143, 276, 89, 23);
		panel_1.add(btnClear);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.CYAN);
		panel_2.setBounds(10, 325, 856, 100);
		frmStuedentDetails.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		table = new JTable();
		table.setFont(new Font("Tahoma", Font.BOLD, 10));
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"Student_ID"," Coursename", "Maths", "English", "Biology"," Computer", "Chemistry", "Physiscs"," Tamil", "Malayalam", "totalScore", "Average", "Ranking"},
				
			},
			new String[] {
				"New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column"
			}
		));
		table.setBounds(10, 11, 836, 76);
		panel_2.add(table);
		
		JButton btnNewButton = new JButton("ADDReport");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double[] R=new double[15];
                R[0]=Double.parseDouble(textField_6.getText());//maths
                R[1]=Double.parseDouble(textField_7.getText());//Computer
                R[2]=Double.parseDouble(textField_8.getText());//maths
                R[3]=Double.parseDouble(textField_9.getText());//Computer
                R[4]=Double.parseDouble(textField_10.getText());//maths
                R[5]=Double.parseDouble(textField_11.getText());//Computer
                R[6]=Double.parseDouble(textField_12.getText());//maths
                R[7]=Double.parseDouble(textField_13.getText());//Computer
                R[8]=(R[0]+R[1]+R[2]+R[3]+R[4]+R[5]+R[6]+R[7]/8);
                R[9]=(R[0]+R[1]+R[2]+R[3]+R[4]+R[5]+R[6]+R[7]);
                String avg=String.format("%.2f",R[8]);
                textField_4.setText(avg);
               String total=String.format("%.2f",R[9]);
               textField_3.setText(total);
               
               if(R[9]>=700)
               {
               textField_5.setText("1");
               }
               else if(R[9]>=600)
               {
               textField_5.setText("2");
               }
               else if(R[9]>=500)
               {
               textField_5.setText("3");
               }
               else if(R[9]>=400)
               {
               textField_5.setText("4");
               }
               else
               {
               textField_5.setText("5");
               }

                




				DefaultTableModel model = (DefaultTableModel) table.getModel();
				model.addRow(new String[]
				{
				textField.getText(),
				(String) comboBox.getSelectedItem(),
				textField_6.getText(),
				textField_7.getText(),
				textField_8.getText(),
				textField_9.getText(),
				textField_10.getText(),
				textField_11.getText(),
				textField_12.getText(),
				textField_13.getText(),
				textField_3.getText(),
				textField_4.getText(),
				textField_5.getText(),

								
						
						});
				
				
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton.setBounds(144, 436, 95, 23);
		frmStuedentDetails.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Delete");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model=(DefaultTableModel)table.getModel();
				int i=table.getSelectedRow();
				if(i>=0) {
					model.removeRow(i);
				}
				
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_1.setBounds(265, 436, 89, 23);
		frmStuedentDetails.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Show Report");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {


textArea.append(
"Student Name:\t\t"+textField_1.getText()+textField_2.getText()
+"\n===========================================================\t\t"
+"\nMaths:\t\t"+textField_6.getText()
+"\nEnglish:\t\t"+textField_7.getText()+"\nBiology:\t\t"+textField_8.getText()
+"\nComputer:\t\t"+textField_9.getText()+"\nChemistry:\t\t"+textField_10.getText()
+"\nPhysics:\t\t"+textField_11.getText()+"\nTamil:\t\t"+textField_12.getText()
+"\nMalayalam:\t\t"+textField_13.getText()
+"\n===========================================================\t\t"
+"\nTotal score:\t\t"+textField_3.getText()+"\nAverage:\t\t"
		+textField_4.getText()+"\nRanking:\t\t"+textField_5.getText());

				
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_2.setBounds(401, 436, 108, 23);
		frmStuedentDetails.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Exit");
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int confirmed = JOptionPane.showConfirmDialog(null, "Exit conformation?");
				if(confirmed==JOptionPane.YES_OPTION){
					System.exit(0);}
			}
		});
		btnNewButton_3.setBounds(560, 436, 89, 23);
		frmStuedentDetails.getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Reset");
		btnNewButton_4.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
				textField_1.setText("");
				//textField_2.setText("");
				//textField_7.setText("");
				textField_4.setText("");
				textField_5.setText("");//textField_11.getText(),
				//textField_12.getText(),
				//textField_13.getText(),
				textField_6.setText("");
				textField_7.setText("");
				textField_8.setText("");
				textField_9.setText("");
				textField_10.setText("");
				textField_11.setText("");
				textField_12.setText("");
				textField_13.setText("");
				textField_3.setText("");
				textField_2.setText("");
			}
		});
		btnNewButton_4.setBounds(691, 436, 89, 23);
		frmStuedentDetails.getContentPane().add(btnNewButton_4);
	}
}
