import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JMenuBar;
import java.awt.Color;
import javax.swing.JMenu;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JPanel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JToolBar;
import javax.swing.event.AncestorListener;
import javax.swing.event.AncestorEvent;

public class teamproject1 {

	private JFrame frame;
	private JTextField textField;
	private final JButton btnNewButton_37 = new JButton("Cosh");
	double number1;
	double number2;
	String op;
	double num1=0;
	double result;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					teamproject1 window = new teamproject1();
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
	public teamproject1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.CYAN);
		frame.setBounds(100, 100, 795, 478);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(123, 44, 467, 71);
		textField.setBackground(Color.LIGHT_GRAY);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 130, 21);
		frame.getContentPane().add(menuBar);
		
		JMenu mnNewMenu = new JMenu("    File");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmScientific = new JMenuItem("Scientific");
		mntmScientific.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setBounds(100, 100, 616, 478);
				textField.setBounds(123, 44, 467, 71);
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.getContentPane().setLayout(null);
				
				
			}
		});
		mnNewMenu.add(mntmScientific);
		
		JMenuItem mntmStanderd = new JMenuItem("Standerd");
		mntmStanderd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setBounds(100, 100, 358, 478);
				//textField = new JTextField();
				textField.setBounds(123, 44, 191, 71);
				
				
			}
		});
		mnNewMenu.add(mntmStanderd);
		
		JMenuItem mntmExit = new JMenuItem("UnitConversion");
		mntmExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setBounds(100, 100, 786, 478);
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.getContentPane().setLayout(null);
				
			}
		});
		mnNewMenu.add(mntmExit);
		
		JMenuItem mntmExit_1 = new JMenuItem("Exit");
		mntmExit_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int confirmed = JOptionPane.showConfirmDialog(null, "Exit conformation?");
				if(confirmed==JOptionPane.YES_OPTION){
					System.exit(0);
					
				}
				else if(confirmed==JOptionPane.CANCEL_OPTION){
					dispose();
					
				}
				
				
			}

			private void dispose() {
				// TODO Auto-generated method stub
				
			}
		});
		mnNewMenu.add(mntmExit_1);
		
		JButton btnNewButton = new JButton("c");
		btnNewButton.setBounds(10, 138, 53, 42);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 double number1=Double.parseDouble(textField.getText());

					textField.setText("");
					
			}
		});
		frame.getContentPane().add(btnNewButton);
		
		JButton button00 = new JButton("00");
		button00.setBounds(77, 138, 53, 42);
		button00.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number1=textField.getText()+button00.getText();
				textField.setText(number1);
			}
		});
		frame.getContentPane().add(button00);
		
		JButton cbr = new JButton("b");
		cbr.setBounds(146, 138, 53, 42);
		cbr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//textField.setText("ihih its a calculator mahn");
				String b=null;
				if(textField.getText().length()>0)
				{
				StringBuilder strB=new StringBuilder(textField.getText());
				strB.deleteCharAt(textField.getText().length()-1);
				b=strB.toString();
				textField.setText(b);
				}
				
			}
		});
		frame.getContentPane().add(cbr);
		
		JButton btnNewButton_3 = new JButton("+/-");
		btnNewButton_3.setBounds(219, 138, 53, 42);
		frame.getContentPane().add(btnNewButton_3);
		
		JButton button7 = new JButton("7");
		button7.setBounds(10, 191, 53, 42);
		button7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number1=textField.getText()+button7.getText();
				textField.setText(number1);
			}
		});
		frame.getContentPane().add(button7);
		
		JButton button8 = new JButton("8");
		button8.setBounds(77, 191, 53, 42);
		button8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number1=textField.getText()+button8.getText();
				textField.setText(number1);
			}
		});
		frame.getContentPane().add(button8);
		
		JButton button9 = new JButton("9");
		button9.setBounds(146, 191, 53, 42);
		button9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number1=textField.getText()+button9.getText();
				textField.setText(number1);
				
			}
		});
		frame.getContentPane().add(button9);
		
		JButton button0 = new JButton("0");
		button0.setBounds(10, 384, 120, 42);
		button0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number1=textField.getText()+button0.getText();
				textField.setText(number1);
			}
		});
		frame.getContentPane().add(button0);
		
		JButton button4 = new JButton("4");
		button4.setBounds(10, 254, 53, 42);
		button4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number1=textField.getText()+button4.getText();
				textField.setText(number1);
			}
		});
		frame.getContentPane().add(button4);
		
		JButton btnNewButton_9 = new JButton(".");
		btnNewButton_9.setBounds(146, 384, 53, 42);
		frame.getContentPane().add(btnNewButton_9);
		
		JButton button3 = new JButton("3");
		button3.setBounds(146, 321, 53, 42);
		button3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number1=textField.getText()+button3.getText();
				textField.setText(number1);
			}
		});
		frame.getContentPane().add(button3);
		
		JButton button5 = new JButton("5");
		button5.setBounds(77, 254, 53, 42);
		button5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number1=textField.getText()+button5.getText();
				textField.setText(number1);
			}
		});
		frame.getContentPane().add(button5);
		
		JButton btnNewButton_12 = new JButton("+");
		btnNewButton_12.setBounds(219, 384, 53, 42);
		btnNewButton_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 number1=Double.parseDouble(textField.getText());
					textField.setText("");
					op="+";
			}
		});
		frame.getContentPane().add(btnNewButton_12);
		
		JButton btnNewButton_13 = new JButton("/");
		btnNewButton_13.setBounds(219, 191, 53, 42);
		btnNewButton_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 number1=Double.parseDouble(textField.getText());
					textField.setText("");
					op="/";
			}
			
		});
		frame.getContentPane().add(btnNewButton_13);
		
		JButton btnNewButton_14 = new JButton("-");
		btnNewButton_14.setBounds(219, 254, 53, 42);
		btnNewButton_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 number1=Double.parseDouble(textField.getText());
					textField.setText("");
					op="-";
			}
		});
		frame.getContentPane().add(btnNewButton_14);
		
		JButton button6 = new JButton("6");
		button6.setBounds(146, 254, 53, 42);
		button6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number1=textField.getText()+button6.getText();
				textField.setText(number1);
			}
		});
		frame.getContentPane().add(button6);
		
		JButton button1 = new JButton("1");
		button1.setBounds(10, 321, 53, 42);
		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number1=textField.getText()+button1.getText();
				textField.setText(number1);
			}
		});
		frame.getContentPane().add(button1);
		
		JButton button2 = new JButton("2");
		button2.setBounds(77, 322, 53, 42);
		button2.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				String number1=textField.getText()+button2.getText();
				textField.setText(number1);
			}
		});
		frame.getContentPane().add(button2);
		
		JButton btnNewButton_18 = new JButton("*");
		btnNewButton_18.setBounds(219, 321, 53, 42);
		btnNewButton_18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 number1=Double.parseDouble(textField.getText());
				textField.setText("");
				op="*";
			}
			
		});
		frame.getContentPane().add(btnNewButton_18);
		
		JButton btnNewButton_20 = new JButton("Rt");
		btnNewButton_20.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			double number1=Double.parseDouble(textField.getText());
			double result=Math.sqrt(number1);
			String ans=String.format("%.2f",result);
			textField.setText(String.valueOf(ans));
			}
		});
		btnNewButton_20.setBounds(292, 138, 53, 42);
		frame.getContentPane().add(btnNewButton_20);
		
		JButton btnNewButton_21 = new JButton("L");
		btnNewButton_21.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double number1=Double.parseDouble(textField.getText());
				double result=Math.log(number1);
				String ans=String.format("%.2f",result);
				textField.setText(String.valueOf(ans));
			}
		});
		btnNewButton_21.setBounds(355, 138, 47, 42);
		frame.getContentPane().add(btnNewButton_21);
		
		JButton btnNewButton_22 = new JButton("Cos");
		btnNewButton_22.setBounds(416, 201, 53, 42);
		btnNewButton_22.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double number1=Double.parseDouble(textField.getText());
    			double result=Math.cos(number1);
    			String ans=String.format("%.2f",result);
    			textField.setText(String.valueOf(ans));
			}
		});
		frame.getContentPane().add(btnNewButton_22);
		
		JButton PI = new JButton("PI");
		PI.setBounds(355, 201, 47, 42);
		PI.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double number1=Double.parseDouble(textField.getText());
			double result=3.14*(number1);
			String ans=String.format("%.2f",result);
			textField.setText(String.valueOf(ans));


			}
		});
		frame.getContentPane().add(PI);
		
		JButton buttonsin = new JButton("Sin");
		buttonsin.setBounds(416, 138, 53, 42);
		buttonsin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JButton buttonsin = new JButton("Sin");
		        buttonsin.addActionListener(new ActionListener() {
		            public void actionPerformed(ActionEvent e) {
		            	double number1=Double.parseDouble(textField.getText());
		    			double result=Math.sin(number1);
		    			String ans=String.format("%.2f",result);
		    			textField.setText(String.valueOf(ans));


		                
		                
		            }
		        });
		        buttonsin.setBounds(420, 87, 59, 39);
		        //.getContentPane().add(btnsin);

			}
		});
		frame.getContentPane().add(buttonsin);
		
		JButton buttonmod = new JButton("%");
		buttonmod.setBounds(291, 201, 54, 42);
		buttonmod.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				number1=Double.parseDouble(textField.getText());
				textField.setText("");
				op="%";
				
			}
		});
		frame.getContentPane().add(buttonmod);
		
		JButton btnNewButton_28 = new JButton("1/x");
		btnNewButton_28.setBounds(292, 254, 47, 42);
		btnNewButton_28.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		frame.getContentPane().add(btnNewButton_28);
		
		JButton btnNewButton_29 = new JButton("X^Y");
		btnNewButton_29.setBounds(355, 254, 53, 42);
		frame.getContentPane().add(btnNewButton_29);
		
		JButton btnNewButton_30 = new JButton("=");
		btnNewButton_30.setBounds(291, 321, 53, 105);
		btnNewButton_30.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String ans;
				number2=Double.parseDouble(textField.getText());
				if(op=="+")
				{
				result=number1+number2;
				ans=String.format("%.2f", result);
				textField.setText(ans);
				}
				if(op=="-")
				{
				result=number1-number2;
				ans=String.format("%.2f", result);
				textField.setText(ans);
				}
				if(op=="*")
				{
				result=number1*number2;
				ans=String.format("%.2f", result);
				textField.setText(ans);
				}
				if(op=="/")
				{
				result=number1/number2;
				ans=String.format("%.2f", result);
				textField.setText(ans);
				}
				if(op=="%")
				{
				result=number1%number2;
				ans=String.format("%.2f", result);
				textField.setText(ans);
				}
				if(op=="cbr")
				{
					result=(number1/number2)*100;
					ans=String.format("%.2f", result);
					textField.setText(ans);
				}
			}
		});
		frame.getContentPane().add(btnNewButton_30);
		
		JButton btnNewButton_31 = new JButton("X^3");
		btnNewButton_31.setBounds(355, 384, 53, 42);
		btnNewButton_31.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double number1=Double.parseDouble(textField.getText());
    			double result=number1*number1*number1;
    			String ans=String.format("%.2f",result);
    			textField.setText(String.valueOf(ans));
			}
		});
		frame.getContentPane().add(btnNewButton_31);
		
		JButton btnNewButton_32 = new JButton("X^2");
		btnNewButton_32.setBounds(355, 321, 53, 42);
		btnNewButton_32.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double number1=Double.parseDouble(textField.getText());
    			double result=number1*number1;
    			String ans=String.format("%.2f",result);
    			textField.setText(String.valueOf(ans));
			}
		});
		frame.getContentPane().add(btnNewButton_32);
		
		JButton btnNewButton_33 = new JButton("Tan");
		btnNewButton_33.setBounds(416, 254, 53, 42);
		btnNewButton_33.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double number1=Double.parseDouble(textField.getText());
    			double result=Math.tan(number1);
    			String ans=String.format("%.2f",result);
    			textField.setText(String.valueOf(ans));
			}
		});
		frame.getContentPane().add(btnNewButton_33);
		
		JButton buttoncbr = new JButton("cbr");
		buttoncbr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double number1=Double.parseDouble(textField.getText());
				
    			textField.setText("");
    			op="cbr";
			}
		});
		buttoncbr.setBounds(416, 321, 53, 42);
		frame.getContentPane().add(buttoncbr);
		
		JButton btnNewButton_35 = new JButton("Bin");
		btnNewButton_35.setBounds(416, 384, 53, 42);
		btnNewButton_35.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 int number1=Integer.parseInt(textField.getText());
				//textField.setText("");
				textField.setText(Integer.toBinaryString(number1));
				
			}
		});
		frame.getContentPane().add(btnNewButton_35);
		
		JButton btnNewButton_36 = new JButton("Sinh");
		btnNewButton_36.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double number1=Double.parseDouble(textField.getText());
    			double result=Math.sinh(number1);
    			String ans=String.format("%.2f",result);
    			textField.setText(String.valueOf(ans));

			}
		});
		btnNewButton_36.setBounds(479, 138, 53, 42);
		frame.getContentPane().add(btnNewButton_36);
		btnNewButton_37.setBounds(479, 201, 53, 42);
		btnNewButton_37.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double number1=Double.parseDouble(textField.getText());
    			double result=Math.cosh(number1);
    			String ans=String.format("%.2f",result);
    			textField.setText(String.valueOf(ans));

			}
		});
		frame.getContentPane().add(btnNewButton_37);
		
		JButton btnNewButton_38 = new JButton("Tanh");
		btnNewButton_38.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double number1=Double.parseDouble(textField.getText());
    			double result=Math.tanh(number1);
    			String ans=String.format("%.2f",result);
    			textField.setText(String.valueOf(ans));

			}
		});
		btnNewButton_38.setBounds(479, 254, 53, 42);
		frame.getContentPane().add(btnNewButton_38);
		
		JButton btnNewButton_39 = new JButton("Rnd");
		btnNewButton_39.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double number1=Double.parseDouble(textField.getText());
    			double result=Math.round(number1);
    			String ans=String.format("%.2f",result);
    			textField.setText(String.valueOf(ans));

			}
		});
		btnNewButton_39.setBounds(479, 321, 53, 42);
		frame.getContentPane().add(btnNewButton_39);
		
		JButton btnNewButton_40 = new JButton("Hex");
		btnNewButton_40.setBounds(479, 384, 53, 42);
		btnNewButton_40.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//number1=Double.parseDouble(textField.getText());
				//textField.setText("");
				 int number1=Integer.parseInt(textField.getText());
					//textField.setText("");
					textField.setText(Integer.toHexString(number1));
					
			}
		});
		frame.getContentPane().add(btnNewButton_40);
		
		JButton btnNewButton_41 = new JButton("Mod");
		btnNewButton_41.setBounds(544, 138, 53, 42);
		btnNewButton_41.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		frame.getContentPane().add(btnNewButton_41);
		
		JButton btnNewButton_42 = new JButton("Inx");
		btnNewButton_42.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double number1=Double.parseDouble(textField.getText());
				double result=Math.log(number1)/10;
				String ans=String.format("%.2f",result);
				textField.setText(String.valueOf(ans));
			}
		});
		btnNewButton_42.setBounds(544, 201, 53, 42);
		frame.getContentPane().add(btnNewButton_42);
		
		JButton btnNewButton_43 = new JButton("C");
		btnNewButton_43.setBounds(544, 254, 53, 42);
		frame.getContentPane().add(btnNewButton_43);
		
		JButton btnNewButton_44 = new JButton("2*PI");
		btnNewButton_44.setBounds(542, 321, 53, 42);
		frame.getContentPane().add(btnNewButton_44);
		
		JButton btnNewButton_45 = new JButton("oc");
		btnNewButton_45.setBounds(544, 384, 53, 42);
		btnNewButton_45.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 int number1=Integer.parseInt(textField.getText());
					//textField.setText("");
					textField.setText(Integer.toOctalString(number1));
			}
		});
		frame.getContentPane().add(btnNewButton_45);
		
		JLabel lblCasio = new JLabel("CASIO");
		lblCasio.setBounds(624, 61, 143, 31);
		lblCasio.setForeground(new Color(0, 0, 0));
		lblCasio.setFont(new Font("Stencil", Font.BOLD, 30));
		lblCasio.setVerticalAlignment(SwingConstants.TOP);
		lblCasio.setToolTipText("");
		frame.getContentPane().add(lblCasio);
		
		JPanel panel = new JPanel();
		panel.setBounds(609, 140, 158, 286);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel label = new JLabel("Currency Converter");
		label.setFont(new Font("Tahoma", Font.PLAIN, 18));
		label.setBounds(0, 36, 148, 48);
		panel.add(label);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"USA", "INDIA", "CANADA", "BRAZIL", "CHINA"}));
		comboBox.setBounds(10, 98, 138, 37);
		panel.add(comboBox);
		
		textField_1 = new JTextField();
		textField_1.setBounds(34, 168, 86, 20);
		panel.add(textField_1);
		textField_1.setColumns(10);
		JLabel label_1 = new JLabel("");
		label_1.addAncestorListener(new AncestorListener() {
			public void ancestorAdded(AncestorEvent arg0) {
			}
			public void ancestorMoved(AncestorEvent arg0) {
			}
			public void ancestorRemoved(AncestorEvent arg0) {
			}
		});
		label_1.setBounds(34, 228, 83, 14);
		panel.add(label_1);
		
		JButton btnNewButton_1 = new JButton("convert");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double bp=Double.parseDouble(textField_1.getText());
				if(comboBox.getSelectedItem().equals("INDIA"))
				{
					String c=String.format("RS %.2f",bp*40);
					label_1.setText(c);
				}
				else if(comboBox.getSelectedItem().equals("USA"))
				{

					String c=String.format("$%.2f",bp*40);
					label_1.setText(c);
				}
				else if(comboBox.getSelectedItem().equals("BRAZIL"))
				{
					String c=String.format("$%.2f",bp*40);
					label_1.setText(c);	
				}
				else if(comboBox.getSelectedItem().equals("CHINA"))
				{
					String c=String.format("RS %.2f",bp*40);
					label_1.setText(c);	
				}
				else if(comboBox.getSelectedItem().equals("CANADA"))
				{
					String c=String.format("$%.2f",bp*40);
					label_1.setText(c);	
				}
			}
		});
		btnNewButton_1.setBounds(23, 194, 104, 23);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_4 = new JButton("clear");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//double number1=Double.parseDouble(textField.getText());

				textField_1.setText("");
				label_1.setText("");
				
			}
		});
		btnNewButton_4.setBounds(44, 252, 65, 23);
		panel.add(btnNewButton_4);
		
		
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(219, 2, 107, 31);
		frame.getContentPane().add(panel_1);
	}
	private static void addPopup(Component component, final JPopupMenu popup) {
	}
}
