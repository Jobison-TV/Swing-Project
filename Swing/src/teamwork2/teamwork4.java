package teamwork2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JSeparator;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.CardLayout;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JTree;
import javax.swing.JSpinner;
import javax.swing.JToggleButton;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JTabbedPane;
import javax.swing.border.CompoundBorder;
import javax.swing.UIManager;
import javax.swing.border.MatteBorder;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import javax.swing.DefaultComboBoxModel;

public class teamwork4 {

	private JFrame frame;
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

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					teamwork4 window = new teamwork4();
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
	public teamwork4() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setForeground(Color.MAGENTA);
		frame.getContentPane().setForeground(new Color(102, 204, 204));
		frame.setBounds(100, 100, 779, 494);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 44, 289, 219);
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblChickenBurger = new JLabel("Chicken burger");
		lblChickenBurger.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblChickenBurger.setBounds(10, 11, 91, 30);
		panel.add(lblChickenBurger);
		
		JLabel lblNewLabel = new JLabel("Chicken Burger Meal");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel.setBounds(10, 50, 140, 14);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Cheese Burger");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1.setBounds(10, 85, 101, 14);
		panel.add(lblNewLabel_1);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(0, 110, 307, 2);
		panel.add(separator);
		
		JLabel lblNewLabel_2 = new JLabel("Drink");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_2.setBounds(20, 137, 91, 14);
		panel.add(lblNewLabel_2);
		
		
		
		
		JLabel lblNewLabel_3 = new JLabel("Qty");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_3.setBounds(160, 137, 86, 14);
		panel.add(lblNewLabel_3);
		
		textField = new JTextField();
		textField.setBounds(160, 16, 86, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(160, 47, 86, 20);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(160, 79, 86, 20);
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(160, 152, 86, 20);
		panel.add(textField_3);
		textField_3.setColumns(10);
		
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(10, 270, 289, 124);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblCostOfDrinks = new JLabel("Cost of Drinks");
		lblCostOfDrinks.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblCostOfDrinks.setBounds(27, 14, 88, 14);
		panel_2.add(lblCostOfDrinks);
		
		JLabel lblCostOfMe = new JLabel("Cost of Meals");
		lblCostOfMe.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblCostOfMe.setBounds(27, 52, 75, 14);
		panel_2.add(lblCostOfMe);
		
		JLabel lblCostOfDel = new JLabel("Cost of Delivery");
		lblCostOfDel.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblCostOfDel.setBounds(27, 87, 88, 26);
		panel_2.add(lblCostOfDel);
		
		textField_6 = new JTextField();
		textField_6.setBounds(173, 11, 86, 20);
		panel_2.add(textField_6);
		textField_6.setColumns(10);
		
		textField_7 = new JTextField();
		textField_7.setBounds(173, 49, 86, 20);
		panel_2.add(textField_7);
		textField_7.setColumns(10);
		
		textField_8 = new JTextField();
		textField_8.setBounds(173, 90, 86, 20);
		panel_2.add(textField_8);
		textField_8.setColumns(10);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBounds(10, 403, 743, 42);
		frame.getContentPane().add(panel_5);
		panel_5.setLayout(null);
		
		JComboBox comboBox = new JComboBox();
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// if (jcb.isSelected()) {
	                  //  JOptionPane.showMessageDialog(frame, "JCheckBox is selected");
	                //} else {
	                   // JOptionPane.showMessageDialog(frame, "JCheckBox is NOT selected");}
			}
		});
		JCheckBox jcb = new JCheckBox("HomeDelivery");
		jcb.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (jcb.isSelected()) {
                    JOptionPane.showMessageDialog(frame, "JCheckBox is selected");
                    
                    
	                
                } else {
                    JOptionPane.showMessageDialog(frame, "JCheckBox is NOT selected");
                    
	                textField_8.setText("");
                }
			}
		});
		JCheckBox chc = new JCheckBox("Tax");
		chc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		chc.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		chc.setBounds(160, 179, 97, 23);
		panel.add(chc);
		
		jcb.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		jcb.setBounds(10, 179, 114, 23);
		panel.add(jcb);
		
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Tea", "coffee"}));
		comboBox.setBounds(20, 152, 91, 20);
		panel.add(comboBox);
		
		JButton btnTotal = new JButton("Total");
		btnTotal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 double text1=Double.parseDouble(textField.getText());
				 double cb=30;
				 double burger=0;
				 burger=text1*cb;
				 double text2=Double.parseDouble(textField_1.getText());
				 double cb1=40;
				 double burgerm=0;
				 burgerm=text2*cb1;
					double text3=Double.parseDouble(textField_2.getText());
					 double cb2=35;
					 double burgerc=0;
					 burgerc=text3*cb2;
					 double cbm=0;
					 cbm=burger+burgerm+burgerc;
					 String total1=String.format("%.2f",cbm);
		                textField_7.setText(total1);
		                
		                double del=50;
	                    String total2=String.format("%.2f",del);
		                textField_8.setText(total2);
		               
				 //textField_1.setText(burger);
				 String drink=(String)comboBox.getSelectedItem();
				
				 if(drink=="Tea") {
				
					  double[]R=new double[15];
		                
		                R[1]=Double.parseDouble(textField_3.getText());
		                R[2]=R[1]*10;
		                String total=String.format("%.2f",R[2]);
		                textField_6.setText(total);
		               
		                
				 }
				 
				

			}
		});
		btnTotal.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnTotal.setBounds(113, 11, 89, 23);
		panel_5.add(btnTotal);
		
		JButton btnReceipt = new JButton("Receipt");
		btnReceipt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnReceipt.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnReceipt.setBounds(244, 11, 89, 23);
		panel_5.add(btnReceipt);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_6.setText("");
				textField_7.setText("");
				textField_8.setText("");
				textField_9.setText("");
				textField_10.setText("");
				textField_11.setText("");
				textField_3.setText("");
				textField_4.setText("");
				textField_5.setText("");
				textField.setText("");
				textField_1.setText("");
				textField_2.setText("");
			}
		});
		btnReset.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnReset.setBounds(374, 11, 89, 23);
		panel_5.add(btnReset);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int confirmed=JOptionPane.showConfirmDialog(null,"Exit confirmation?");
				if(confirmed==JOptionPane.YES_OPTION) {
				System.exit(0);}
			}
		});
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnExit.setBounds(505, 12, 89, 23);
		panel_5.add(btnExit);
		
		JPanel panel_8 = new JPanel();
		panel_8.setBackground(new Color(255, 0, 255));
		panel_8.setForeground(new Color(153, 102, 204));
		panel_8.setBounds(0, 1, 763, 455);
		frame.getContentPane().add(panel_8);
		panel_8.setLayout(null);
		
		JLabel lblHotelManagementSystem = new JLabel("Hotel Management System");
		lblHotelManagementSystem.setBounds(312, 11, 242, 22);
		panel_8.add(lblHotelManagementSystem);
		lblHotelManagementSystem.setForeground(new Color(204, 51, 0));
		lblHotelManagementSystem.setFont(new Font("Tahoma", Font.BOLD, 18));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(312, 46, 216, 219);
		panel_8.add(panel_1);
		panel_1.setLayout(null);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"India", "Usa"}));
		comboBox_1.setBounds(12, 50, 196, 20);
		panel_1.add(comboBox_1);
		
		textField_4 = new JTextField();
		textField_4.setBounds(27, 112, 168, 20);
		panel_1.add(textField_4);
		textField_4.setColumns(10);
		
		JButton btnC = new JButton("Convert");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnC.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnC.setBounds(12, 170, 89, 23);
		panel_1.add(btnC);
		
		JButton btnClose = new JButton("Close");
		btnClose.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnClose.setBounds(119, 170, 89, 23);
		panel_1.add(btnClose);
		
		JLabel lblCurrencyConvertor = new JLabel("Currency Convertor");
		lblCurrencyConvertor.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblCurrencyConvertor.setBounds(32, 11, 146, 28);
		panel_1.add(lblCurrencyConvertor);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(312, 271, 216, 124);
		panel_8.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblTax = new JLabel("Tax");
		lblTax.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblTax.setBounds(10, 11, 46, 14);
		panel_3.add(lblTax);
		
		JLabel lblSubTotal = new JLabel("Sub total");
		lblSubTotal.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblSubTotal.setBounds(10, 49, 59, 14);
		panel_3.add(lblSubTotal);
		
		JLabel lblTotal = new JLabel("Total");
		lblTotal.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblTotal.setBounds(10, 93, 46, 14);
		panel_3.add(lblTotal);
		
		textField_9 = new JTextField();
		textField_9.setBounds(106, 8, 86, 20);
		panel_3.add(textField_9);
		textField_9.setColumns(10);
		
		textField_10 = new JTextField();
		textField_10.setBounds(106, 46, 86, 20);
		panel_3.add(textField_10);
		textField_10.setColumns(10);
		
		textField_11 = new JTextField();
		textField_11.setBounds(106, 90, 86, 20);
		panel_3.add(textField_11);
		textField_11.setColumns(10);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBounds(538, 47, 210, 348);
		panel_8.add(panel_4);
		panel_4.setBackground(new Color(240, 240, 240));
		panel_4.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setToolTipText("hh");
		tabbedPane.setBounds(10, 11, 194, 347);
		panel_4.add(tabbedPane);
		
		JPanel panel_7 = new JPanel();
		tabbedPane.addTab("Calculator ", null, panel_7, null);
		panel_7.setLayout(null);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(0, 87, 40, -17);
		panel_7.add(btnNewButton);
		
		JButton btnC_1 = new JButton("C");
		btnC_1.setBounds(0, 145, 39, 31);
		panel_7.add(btnC_1);
		
		JButton button = new JButton("...");
		button.setBounds(49, 145, 39, 31);
		panel_7.add(button);
		
		JButton btnNewButton_1 = new JButton("BC");
		btnNewButton_1.setBounds(97, 145, 40, 31);
		panel_7.add(btnNewButton_1);
		
		JButton button_1 = new JButton("7");
		button_1.setBounds(0, 179, 40, 31);
		panel_7.add(button_1);
		
		JButton button_2 = new JButton("8");
		button_2.setBounds(50, 179, 36, 31);
		panel_7.add(button_2);
		
		JButton button_3 = new JButton("9");
		button_3.setBounds(96, 179, 43, 31);
		panel_7.add(button_3);
		
		JButton button_4 = new JButton("-");
		button_4.setBounds(149, 179, 40, 31);
		panel_7.add(button_4);
		
		JButton button_5 = new JButton("6");
		button_5.setBounds(0, 211, 40, 31);
		panel_7.add(button_5);
		
		JButton button_6 = new JButton("5");
		button_6.setBounds(48, 211, 39, 31);
		panel_7.add(button_6);
		
		JButton button_7 = new JButton("4");
		button_7.setBounds(97, 211, 39, 31);
		panel_7.add(button_7);
		
		JButton button_8 = new JButton("/");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		button_8.setBounds(150, 211, 39, 31);
		panel_7.add(button_8);
		
		JButton button_9 = new JButton("3");
		button_9.setBounds(0, 243, 40, 31);
		panel_7.add(button_9);
		
		JButton button_10 = new JButton("2");
		button_10.setBounds(49, 243, 39, 31);
		panel_7.add(button_10);
		
		JButton button_11 = new JButton("1");
		button_11.setBounds(97, 243, 39, 31);
		panel_7.add(button_11);
		
		JButton button_12 = new JButton("+");
		button_12.setBounds(146, 244, 43, 28);
		panel_7.add(button_12);
		
		JButton button_13 = new JButton("=");
		button_13.setBounds(149, 277, 40, 31);
		panel_7.add(button_13);
		
		JButton button_14 = new JButton("...");
		button_14.setBounds(99, 277, 40, 31);
		panel_7.add(button_14);
		
		JButton button_15 = new JButton(".");
		button_15.setBounds(49, 277, 40, 31);
		panel_7.add(button_15);
		
		JButton button_16 = new JButton("0");
		button_16.setBounds(0, 277, 40, 31);
		panel_7.add(button_16);
		
		JButton btnNewButton_2 = new JButton("*");
		btnNewButton_2.setBounds(147, 145, 40, 31);
		panel_7.add(btnNewButton_2);
		
		textField_5 = new JTextField();
		textField_5.setBounds(10, 91, 169, 43);
		panel_7.add(textField_5);
		textField_5.setColumns(10);
		
		JPanel panel_6 = new JPanel();
		tabbedPane.addTab("RECEIPT", null, panel_6, null);
		panel_6.setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(0, 0, 189, 319);
		panel_6.add(textArea);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setBounds(84, 176, 4, 22);
		panel_6.add(textArea_1);
	}
	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
}
