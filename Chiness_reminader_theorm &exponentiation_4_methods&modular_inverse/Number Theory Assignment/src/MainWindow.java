import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.lang.reflect.Array;
import java.math.BigInteger;
import java.util.ArrayList;
import javax.swing.JTextArea;
import javax.swing.JTextPane;

public class MainWindow extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_6;
	private ArrayList<Integer> aArr;
	private ArrayList<Integer> mArr;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainWindow frame = new MainWindow();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MainWindow() {

		mArr = new ArrayList<Integer>();
		aArr = new ArrayList<Integer>();

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 849, 782);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		textField = new JTextField();
		textField.setBounds(226, 62, 179, 20);
		contentPane.add(textField);
		textField.setColumns(10);

		JLabel lblModularExponential = new JLabel("Modular Exponential ");
		lblModularExponential.setBounds(10, 11, 163, 29);
		contentPane.add(lblModularExponential);

		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(70, 87, 179, 20);
		contentPane.add(textField_1);

		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(415, 87, 179, 20);
		contentPane.add(textField_2);

		JLabel lblMod = new JLabel("Mod");
		lblMod.setBounds(380, 83, 25, 29);
		contentPane.add(lblMod);

		JLabel lblExp = new JLabel("exp");
		lblExp.setBounds(183, 65, 32, 14);
		contentPane.add(lblExp);

		final JLabel lblNumber = new JLabel("number");
		lblNumber.setBounds(24, 90, 46, 14);
		contentPane.add(lblNumber);

		JLabel label = new JLabel("Modular inverse");
		label.setBounds(10, 230, 144, 29);
		contentPane.add(label);

		JLabel label_1 = new JLabel("number");
		label_1.setBounds(26, 270, 46, 14);
		contentPane.add(label_1);

		textField_3 = new JTextField();
		textField_3.setBounds(87, 270, 86, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);

		JLabel lblMod_1 = new JLabel("mod");
		lblMod_1.setBounds(185, 273, 46, 14);
		contentPane.add(lblMod_1);

		final JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(525, 461, 298, 272);
		contentPane.add(lblNewLabel);

		textField_4 = new JTextField();
		textField_4.setBounds(241, 270, 91, 20);
		contentPane.add(textField_4);
		textField_4.setColumns(10);

		JButton btnNewButton = new JButton("Equate inverse");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				if (checkInteger(textField_3.getText())
						&& checkInteger(textField_4.getText())) {

					textField_5.setText(""
							+ MathMethods.getModularInverse(
									Integer.parseInt(textField_3.getText()),
									Integer.parseInt(textField_4.getText())));

				} else {
					textField_5.setText("Error");
				}
			}
		});
		btnNewButton.setBounds(26, 312, 130, 38);
		contentPane.add(btnNewButton);

		textField_5 = new JTextField();
		textField_5.setBounds(183, 321, 86, 20);
		contentPane.add(textField_5);
		textField_5.setColumns(10);

		JLabel lblChineesRemminderTheorm = new JLabel(
				"Chinees remminder theorm ");
		lblChineesRemminderTheorm.setBounds(10, 420, 239, 14);
		contentPane.add(lblChineesRemminderTheorm);

		textField_7 = new JTextField();
		textField_7.setBounds(90, 461, 86, 20);
		contentPane.add(textField_7);
		textField_7.setColumns(10);

		textField_8 = new JTextField();
		textField_8.setBounds(208, 461, 86, 20);
		contentPane.add(textField_8);
		textField_8.setColumns(10);

		JLabel lblX = new JLabel("X");
		lblX.setBounds(24, 464, 46, 14);
		contentPane.add(lblX);

		final JLabel lblEquation = new JLabel("Equation 1");
		lblEquation.setBounds(304, 464, 64, 14);
		contentPane.add(lblEquation);

		JLabel lblMod_2 = new JLabel("mod");
		lblMod_2.setBounds(44, 464, 46, 14);
		contentPane.add(lblMod_2);

		JButton btnSubmitEquation = new JButton("submit equation");
		btnSubmitEquation.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (checkInteger(textField_7.getText())
						&& checkInteger(textField_8.getText())) {
					mArr.add(Integer.parseInt(textField_7.getText()));
					aArr.add(Integer.parseInt(textField_8.getText()));
					System.out.println(mArr.get(mArr.size() - 1) + " "
							+ aArr.get(mArr.size() - 1));
					// lblNewLabel.setText(lblNewLabel.getText()+"X mod "+textField_7.getText()+" = "+textField_8.getText()+"\n");
					textField_7.setText("");
					textField_8.setText("");
					int x = mArr.size() + 1;
					lblEquation.setText("Equation " + x);
				} else {
					textField_7.setText("Error");
					textField_8.setText("Error");
				}
			}
		});
		btnSubmitEquation.setBounds(394, 460, 152, 23);
		contentPane.add(btnSubmitEquation);

		JLabel label_2 = new JLabel("=");
		label_2.setBounds(183, 464, 46, 14);
		contentPane.add(label_2);

		JButton btnCalculatX = new JButton("calculat X");
		btnCalculatX.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int[] ret1 = new int[aArr.size()];
				int[] ret2 = new int[aArr.size()];
				for (int i = 0; i < ret1.length; i++) {
					ret1[i] = aArr.get(i).intValue();
					ret2[i] = mArr.get(i).intValue();
				}
				textField_6.setText("" + MathMethods.CRT(ret1, ret2));
			}
		});
		btnCalculatX.setBounds(24, 519, 130, 38);
		contentPane.add(btnCalculatX);

		textField_6 = new JTextField();
		textField_6.setBounds(183, 528, 86, 20);
		contentPane.add(textField_6);
		textField_6.setColumns(10);

		JButton btnClearEqutions = new JButton("Clear equtions");
		btnClearEqutions.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				aArr.clear();
				mArr.clear();
				textField_6.setText("");
				textField_7.setText("");
				textField_8.setText("");
				lblEquation.setText("Equation " + 1);
			}
		});
		btnClearEqutions.setBounds(394, 527, 157, 23);
		contentPane.add(btnClearEqutions);

		JButton btnEquateValue = new JButton("Equate value");
		btnEquateValue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BigInteger a = getBigInteger(textField_1.getText());
				BigInteger b = getBigInteger(textField.getText());
				BigInteger n = getBigInteger(textField_2.getText());

				if (a != null && b != null & n != null) {

					textField_9.setText(""
							+ MathMethods.modularExpStraight(a, b, n));

					long startTime2 = System.currentTimeMillis();
					MathMethods.modularExpStraight(a, b, n);
					long endTime2 = System.currentTimeMillis();
					long totalTime2 = endTime2 - startTime2;
					textField_12.setText("" + totalTime2);

					startTime2 = System.currentTimeMillis();
					MathMethods.modularExpBinary(a, b, n);
					endTime2 = System.currentTimeMillis();
					totalTime2 = endTime2 - startTime2;
					textField_11.setText("" + totalTime2);

					startTime2 = System.currentTimeMillis();
					MathMethods.modularExploop(a, b, n);
					endTime2 = System.currentTimeMillis();
					totalTime2 = endTime2 - startTime2;
					textField_10.setText("" + totalTime2);

				} else {
					textField_9.setText("Error");
				}

			}
		});
		btnEquateValue.setBounds(21, 118, 119, 29);
		contentPane.add(btnEquateValue);

		textField_9 = new JTextField();
		textField_9.setBounds(161, 122, 171, 20);
		contentPane.add(textField_9);
		textField_9.setColumns(10);

		JLabel lblNewLabel_1 = new JLabel(
				"Click submit equation after each equation");
		lblNewLabel_1.setBounds(350, 487, 326, 29);
		contentPane.add(lblNewLabel_1);

		JLabel lblSimpleLoopTime = new JLabel("simple loop method time");
		lblSimpleLoopTime.setBounds(24, 158, 171, 14);
		contentPane.add(lblSimpleLoopTime);

		JLabel lblBinaryLeftTo = new JLabel("Binary left to right method time ");
		lblBinaryLeftTo.setBounds(24, 180, 191, 14);
		contentPane.add(lblBinaryLeftTo);

		JLabel lblStraightForwardMethod = new JLabel(
				"Straight forward method time ");
		lblStraightForwardMethod.setBounds(24, 205, 191, 14);
		contentPane.add(lblStraightForwardMethod);

		textField_10 = new JTextField();
		textField_10.setBounds(246, 155, 86, 20);
		contentPane.add(textField_10);
		textField_10.setColumns(10);

		textField_11 = new JTextField();
		textField_11.setBounds(246, 177, 86, 20);
		contentPane.add(textField_11);
		textField_11.setColumns(10);

		textField_12 = new JTextField();
		textField_12.setBounds(246, 202, 86, 20);
		contentPane.add(textField_12);
		textField_12.setColumns(10);

	}

	private static boolean checkInteger(String data) {

		try {
			Integer.parseInt(data);
		} catch (NumberFormatException e) {
			return false;
		}
		return true;
	}

	private static BigInteger getBigInteger(String data) {
		BigInteger z;
		try {
			z = new BigInteger(data);
		} catch (NumberFormatException e) {
			return null;
		}
		return z;
	}
}
