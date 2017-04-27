import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JPasswordField;

public class Calculator {

	private JFrame frame;
	private JTextField textField;
	double firstNumber;
	double secondNumber;
	String operation;
	String equal;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {

				try {
					Calculator window = new Calculator();
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
	public Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 306, 471);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		textField = new JTextField();
		textField.setBounds(10, 11, 270, 46);
		frame.getContentPane().add(textField);
		textField.setColumns(10);

		// -------------------R1-------------------------------

		JButton btn7 = new JButton("7");
		btn7.setFont(new Font("Tahoma", Font.BOLD, 16));
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				try {

				} catch (Exception e1) {
					JOptionPane.showMessageDialog(null, "Please input the valid number!", "Error message",
							JOptionPane.INFORMATION_MESSAGE);
				}
			}
		});
		btn7.setBounds(10, 74, 60, 60);
		frame.getContentPane().add(btn7);

		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				try {

				} catch (Exception e1) {
					JOptionPane.showMessageDialog(null, "Please input the valid number!", "Error message",
							JOptionPane.INFORMATION_MESSAGE);
				}
			}
		});
		btn8.setFont(new Font("Tahoma", Font.BOLD, 16));
		btn8.setBounds(80, 74, 60, 60);
		frame.getContentPane().add(btn8);

		JButton btn9 = new JButton("9");
		btn9.setFont(new Font("Tahoma", Font.BOLD, 16));
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				try {

				} catch (Exception e1) {
					JOptionPane.showMessageDialog(null, "Please input the valid number!", "Error message",
							JOptionPane.INFORMATION_MESSAGE);
				}
			}
		});
		btn9.setBounds(150, 74, 60, 60);
		frame.getContentPane().add(btn9);

		JButton btnPlus = new JButton("\u002B");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				firstNumber = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "+";

			}
		});
		btnPlus.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnPlus.setBounds(220, 74, 60, 60);
		frame.getContentPane().add(btnPlus);

		// -------------------R2-------------------------------

		JButton btn4 = new JButton("4");
		btn4.setFont(new Font("Tahoma", Font.BOLD, 16));
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				try {

				} catch (Exception e1) {
					JOptionPane.showMessageDialog(null, "Please input the valid number!", "Error message",
							JOptionPane.INFORMATION_MESSAGE);
				}
			}
		});
		btn4.setBounds(10, 145, 60, 60);
		frame.getContentPane().add(btn4);

		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				try {

				} catch (Exception e1) {
					JOptionPane.showMessageDialog(null, "Please input the valid number!", "Error message",
							JOptionPane.INFORMATION_MESSAGE);
				}
			}
		});
		btn5.setFont(new Font("Tahoma", Font.BOLD, 16));
		btn5.setBounds(80, 145, 60, 60);
		frame.getContentPane().add(btn5);

		JButton btn6 = new JButton("6");
		btn6.setFont(new Font("Tahoma", Font.BOLD, 16));
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				try {

				} catch (Exception e1) {
					JOptionPane.showMessageDialog(null, "Please input the valid number!", "Error message",
							JOptionPane.INFORMATION_MESSAGE);
				}
			}
		});
		btn6.setBounds(150, 145, 60, 60);
		frame.getContentPane().add(btn6);

		JButton btnSub = new JButton("\u2212");
		btnSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				firstNumber = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "-";

			}
		});
		btnSub.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnSub.setBounds(220, 145, 60, 60);
		frame.getContentPane().add(btnSub);

		// -------------------R3-------------------------------

		JButton btn1 = new JButton("1");
		btn1.setFont(new Font("Tahoma", Font.BOLD, 16));
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				try {

				} catch (Exception e1) {
					JOptionPane.showMessageDialog(null, "Please input the valid number!", "Error message",
							JOptionPane.INFORMATION_MESSAGE);
				}
			}
		});
		btn1.setBounds(10, 216, 60, 60);
		frame.getContentPane().add(btn1);

		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				try {

				} catch (Exception e1) {
					JOptionPane.showMessageDialog(null, "Please input the valid number!", "Error message",
							JOptionPane.INFORMATION_MESSAGE);
				}
			}
		});
		btn2.setFont(new Font("Tahoma", Font.BOLD, 16));
		btn2.setBounds(80, 216, 60, 60);
		frame.getContentPane().add(btn2);

		JButton btn3 = new JButton("3");
		btn3.setFont(new Font("Tahoma", Font.BOLD, 16));
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				try {

				} catch (Exception e1) {
					JOptionPane.showMessageDialog(null, "Please input the valid number!", "Error message",
							JOptionPane.INFORMATION_MESSAGE);
				}
			}
		});
		btn3.setBounds(150, 216, 60, 60);
		frame.getContentPane().add(btn3);

		JButton btnMul = new JButton("\u00D7");
		btnMul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				firstNumber = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "*";

			}
		});
		btnMul.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnMul.setBounds(220, 216, 60, 60);
		frame.getContentPane().add(btnMul);

		// -------------------R4-------------------------------

		JButton btn0 = new JButton("0");
		btn0.setFont(new Font("Tahoma", Font.BOLD, 16));
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				try {

				} catch (Exception e1) {
					JOptionPane.showMessageDialog(null, "Please input the valid number!", "Error message",
							JOptionPane.INFORMATION_MESSAGE);
				}
			}
		});
		btn0.setBounds(10, 289, 60, 60);
		frame.getContentPane().add(btn0);

		JButton btnPoint = new JButton("\u2022");
		btnPoint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});
		btnPoint.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnPoint.setBounds(80, 289, 60, 60);
		frame.getContentPane().add(btnPoint);

		JButton btnPN = new JButton("\u00B1");
		btnPN.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnPN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double op = Double.parseDouble(String.valueOf(textField.getText()));
				op = op * (-1);
				textField.setText(String.valueOf(op));

			}
		});
		btnPN.setBounds(150, 289, 60, 60);
		frame.getContentPane().add(btnPN);

		JButton btnDiv = new JButton("\u00F7");
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				firstNumber = Double.parseDouble(textField.getText());
				textField.getText();
				operation = "=";

			}
		});
		btnDiv.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnDiv.setBounds(218, 289, 60, 60);
		frame.getContentPane().add(btnDiv);

		// -------------------R5-------------------------------

		JButton btnDel = new JButton("C");
		btnDel.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnDel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});
		btnDel.setBounds(10, 359, 60, 60);
		frame.getContentPane().add(btnDel);

		JButton btnBack = new JButton("\u2190");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});
		btnBack.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnBack.setBounds(80, 359, 60, 60);
		frame.getContentPane().add(btnBack);

		JButton btnMod = new JButton("%");
		btnMod.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnMod.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnMod.setBounds(150, 359, 60, 60);
		frame.getContentPane().add(btnMod);

		JButton btnEqual = new JButton("\u003D");
		btnEqual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				firstNumber = Double.parseDouble(textField.getText());
				textField.getText();
				operation = "=";

			}
		});
		btnEqual.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnEqual.setBounds(218, 359, 60, 60);
		frame.getContentPane().add(btnEqual);

	}
}
