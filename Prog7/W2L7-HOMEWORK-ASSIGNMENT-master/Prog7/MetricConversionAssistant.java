package Prog8;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

import java.awt.*;

public class MetricConversionAssistant extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel panel;
	private JTextField textMile;
	private JTextField textPound;
	private JTextField textGallon;
	private JTextField textFhrenheit;
	private JTextField textKilometer;
	private JTextField textKilogram;
	private JTextField textLitre;
	private JTextField textCentigrade;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		MetricConversionAssistant frame = new MetricConversionAssistant();
		frame.setVisible(true);
	}

	/**
	 * Create the frame.
	 */
	public MetricConversionAssistant() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setTitle("Metric Conversion Assistant");
		panel = new JPanel();
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(panel);
		panel.setLayout(null);

		JLabel lblMile = new JLabel("Mile:");
		lblMile.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblMile.setBounds(10, 36, 69, 22);
		lblMile.setAlignmentX(Component.RIGHT_ALIGNMENT);
		lblMile.setHorizontalAlignment(JLabel.RIGHT);
		panel.add(lblMile);

		JLabel lblPound = new JLabel("Pound:");
		lblPound.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblPound.setBounds(10, 78, 69, 22);
		lblPound.setAlignmentX(Component.RIGHT_ALIGNMENT);
		lblPound.setHorizontalAlignment(JLabel.RIGHT);
		panel.add(lblPound);

		JLabel lblGallon = new JLabel("Gallon:");
		lblGallon.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblGallon.setBounds(10, 120, 69, 22);
		lblGallon.setAlignmentX(Component.RIGHT_ALIGNMENT);
		lblGallon.setHorizontalAlignment(JLabel.RIGHT);
		panel.add(lblGallon);

		JLabel lblFahrenheit = new JLabel("Fahrenheit:");
		lblFahrenheit.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblFahrenheit.setBounds(10, 162, 69, 22);
		lblFahrenheit.setAlignmentX(Component.RIGHT_ALIGNMENT);
		lblFahrenheit.setHorizontalAlignment(JLabel.RIGHT);
		panel.add(lblFahrenheit);

		textMile = new JTextField();
		textMile.setBounds(89, 36, 108, 22);
		panel.add(textMile);
		textMile.setColumns(10);

		textPound = new JTextField();
		textPound.setBounds(87, 78, 110, 22);
		panel.add(textPound);
		textPound.setColumns(10);

		textGallon = new JTextField();
		textGallon.setBounds(89, 120, 108, 22);
		panel.add(textGallon);
		textGallon.setColumns(10);

		textFhrenheit = new JTextField();
		textFhrenheit.setBounds(89, 162, 108, 22);
		panel.add(textFhrenheit);
		textFhrenheit.setColumns(10);

		JLabel lblKilometer = new JLabel("Kilometer:");
		lblKilometer.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblKilometer.setBounds(226, 36, 79, 22);
		lblKilometer.setAlignmentX(Component.RIGHT_ALIGNMENT);
		lblKilometer.setHorizontalAlignment(JLabel.RIGHT);

		panel.add(lblKilometer);

		JLabel lblKilogram = new JLabel("Kilogram:");
		lblKilogram.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblKilogram.setBounds(226, 78, 79, 22);
		lblKilogram.setAlignmentX(Component.RIGHT_ALIGNMENT);
		lblKilogram.setHorizontalAlignment(JLabel.RIGHT);
		panel.add(lblKilogram);

		JLabel lblLitre = new JLabel("Litre:");
		lblLitre.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblLitre.setBounds(226, 120, 79, 22);
		lblLitre.setAlignmentX(Component.RIGHT_ALIGNMENT);
		lblLitre.setHorizontalAlignment(JLabel.RIGHT);
		panel.add(lblLitre);

		JLabel lblCentigrade = new JLabel("Centigrade:");
		lblCentigrade.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblCentigrade.setBounds(226, 162, 79, 22);
		lblCentigrade.setAlignmentX(Component.RIGHT_ALIGNMENT);
		lblCentigrade.setHorizontalAlignment(JLabel.RIGHT);
		panel.add(lblCentigrade);

		textKilometer = new JTextField();
		textKilometer.setBounds(315, 36, 109, 22);
		panel.add(textKilometer);
		textKilometer.setColumns(10);

		textKilogram = new JTextField();
		textKilogram.setBounds(315, 78, 109, 22);
		panel.add(textKilogram);
		textKilogram.setColumns(10);

		textLitre = new JTextField();
		textLitre.setBounds(315, 120, 109, 22);
		panel.add(textLitre);
		textLitre.setColumns(10);

		textCentigrade = new JTextField();
		textCentigrade.setBounds(315, 162, 109, 22);
		panel.add(textCentigrade);
		textCentigrade.setColumns(10);

		// Button

		JButton btnConvert = new JButton("Convert");
		btnConvert.setBounds(170, 218, 100, 30);
		btnConvert.addActionListener(e -> {
			String sMile = textMile.getText();
			String sPound = textPound.getText();
			String sGallon = textGallon.getText();
			String sFahrenheit = textFhrenheit.getText();
			String sKilometer = textKilometer.getText();
			String sKilogram = textKilogram.getText();
			String sLitre = textLitre.getText();
			String sCentigrade = textCentigrade.getText();

			double dMile = 0;
			double dPound = 0;
			double dGallon = 0;
			double dFahrenheit = 0;

			double dKilometer = 0;
			double dKilogram = 0;
			double dLitre = 0;
			double dCentigrade = 0;
			// check the strings for digit
			// House keeping

			if (sMile != null && !sMile.isEmpty() && !isNumber(sMile))
				JOptionPane.showMessageDialog(null, "Error: Mile must be number. Check for your input.  ");
			else {
				if (sMile.isEmpty())
					dMile = 0;
				else
					dMile = Double.parseDouble(sMile);
			}
			if (sPound != null && !sPound.isEmpty() && !isNumber(sPound))
				JOptionPane.showMessageDialog(null, "Error: Pound must be number. Check for your input.  ");
			else {
				if (sPound.isEmpty())
					dPound = 0;
				else
					dPound = Double.parseDouble(sPound);
			}
			if (sGallon != null && !sGallon.isEmpty() && !isNumber(sGallon))
				JOptionPane.showMessageDialog(null, "Error: Gallon must be number. Check for your input.  ");
			else {
				if (sGallon.isEmpty())
					dGallon = 0;
				else
					dGallon = Double.parseDouble(sGallon);
			}

			if (sFahrenheit != null && !sFahrenheit.isEmpty() && !isNumber(sFahrenheit))
				JOptionPane.showMessageDialog(null, "Error: Fahrenheit must be number. Check for your input.  ");
			else {
				if (sFahrenheit.isEmpty())
					dFahrenheit = 0;
				else
					dFahrenheit = Double.parseDouble(sFahrenheit);
			}

			if (sKilometer != null && !sKilometer.isEmpty() && !isNumber(sKilometer))
				JOptionPane.showMessageDialog(null, "Error: Kilometer must be number. Check for your input.  ");
			else {
				if (sKilometer.isEmpty())
					dKilometer = 0;
				else
					dKilometer = Double.parseDouble(sKilometer);
			}
			if (sKilogram != null && !sKilogram.isEmpty() && !isNumber(sKilogram))
				JOptionPane.showMessageDialog(null, "Error: Kilogram must be number. Check for your input.  ");
			else {
				if (sKilogram.isEmpty())
					dKilogram = 0;
				else
					dKilogram = Double.parseDouble(sKilogram);

			}
			if (sLitre != null && !sLitre.isEmpty() && !isNumber(sLitre))
				JOptionPane.showMessageDialog(null, "Error: Litre must be number. Check for your input.  ");
			else {
				if (sLitre.isEmpty())
					dLitre = 0;
				else
					dLitre = Double.parseDouble(sLitre);
			}

			if (sCentigrade != null && !sCentigrade.isEmpty() && !isNumber(sCentigrade))
				JOptionPane.showMessageDialog(null, "Error: Centigrade must be number. Check for your input.  ");
			else {
				if (sCentigrade.isEmpty())
					dCentigrade = 0;
				else
					dCentigrade = Double.parseDouble(sCentigrade);
			}

			// check for negative value.

			if (dMile < 0 || dPound < 0 || dGallon < 0 || dKilometer < 0 || dKilogram < 0 || dLitre < 0) {
				JOptionPane.showMessageDialog(null,"Error: Input must be non-negative number. Please check your field ");

			}

			if (dMile == 0 && dKilometer > 0)
				dMile = 0.62 * dKilometer;
			else if (dMile > 0 && dKilometer == 0)
				dKilometer = 1.6 * dMile;
			else {
				dMile = 0.62 * dKilometer;
				dKilometer = 1.6 * dMile;
			}

			if (dPound == 0 && dKilogram > 0)
				dPound = 2.2 * dKilogram;
			else if (dPound > 0 && dKilogram == 0)
				dKilogram = 0.45 * dPound;

			if (dGallon == 0 && dLitre > 0)
				dGallon = 0.264 * dLitre;

			else if (dGallon > 0 && dLitre == 0)
				dLitre = 3.785 * dGallon;

			if (dFahrenheit == 0 && dCentigrade > 0)
				dFahrenheit = (dCentigrade * 1.8) + 32;

			else if (dFahrenheit > 0 && dCentigrade == 0)
				dCentigrade = (dFahrenheit - 32) / 1.8;
			else {
				dFahrenheit = (dCentigrade * 1.8) + 32;
				dCentigrade = (dFahrenheit - 32) / 1.8;
			}
			// change double back to string and display with just two decimal places. See
			// helper method for the details
			textMile.setText(Double.toString(twoDecimalFormat(dMile)));
			textPound.setText(Double.toString(twoDecimalFormat(dPound)));

			textGallon.setText(Double.toString(twoDecimalFormat(dGallon)));
			textFhrenheit.setText(Double.toString(twoDecimalFormat(dFahrenheit)));
			textKilometer.setText(Double.toString(twoDecimalFormat(dKilometer)));
			textKilogram.setText(Double.toString(twoDecimalFormat(dKilogram)));
			textLitre.setText(Double.toString(twoDecimalFormat(dLitre)));
			textCentigrade.setText(Double.toString(twoDecimalFormat(dCentigrade)));

		}

		);

		panel.add(btnConvert);

	}

	/**
	 * Check if the the input is a number or something else
	 * 
	 * @param input
	 * @return double with two decimal places
	 */

	boolean isNumber(String input) {
		try {
			Double.parseDouble(input);
		} catch (NumberFormatException ex) {
			return false;
		}
		return true;
	}

	public double twoDecimalFormat(double number) {

		number = number * 100;
		number = (double) ((int) number);
		number = number / 100;
		return number;

	}
}