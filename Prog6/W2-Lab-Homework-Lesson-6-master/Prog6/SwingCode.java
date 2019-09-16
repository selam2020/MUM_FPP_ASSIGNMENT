package Prob7;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;;

public class SwingCode {
	public static void main(String[] args) {
		JFrame frame = new JFrame("String Utility");
		frame.setSize(350, 300);
		frame.setLocation(500, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		JButton btnCount = new JButton("Count Letters");
		btnCount.setBounds(10, 80, 150, 25);
		frame.add(btnCount);
		JButton btnReverse = new JButton("Reverse Letters");
		btnReverse.setBounds(10, 120, 150, 25);
		frame.add(btnReverse);
		JButton btnRemove = new JButton("Remove Duplicates");
		btnRemove.setBounds(10, 160, 150, 25);
		frame.add(btnRemove);
		JLabel lblIput = new JLabel("Input");
		lblIput.setBounds(180, 80, 80, 25);
		frame.add(lblIput);
		JTextField txtInput = new JTextField(20);
		txtInput.setBounds(180, 100, 80, 25);
		frame.add(txtInput);
		JLabel lblOutbut = new JLabel("Output");
		lblOutbut.setBounds(180, 120, 80, 25);
		frame.add(lblOutbut);
		JTextField txtOutput = new JTextField(20);
		txtOutput.setBounds(180, 140, 80, 25);
		frame.add(txtOutput);
		btnCount.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String input = txtInput.getText();
				
				int count = 0;
				while (true) {
					if (input.equals("") || input.equals(null))
						break;
					count++;
					input = input.substring(1);
				}
				txtOutput.setText(Integer.toString(count));
			}
		});
		btnReverse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String input = txtInput.getText();
				StringBuilder output = new StringBuilder();
				for (int i = input.length() - 1; i >= 0; i--) {
					output.append(input.charAt(i));
				}
				txtOutput.setText(output.toString());
			}
		});
		btnRemove.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String input = txtInput.getText();
				String result = new String("");
				for (int i = 0; i < input.length(); i++) {
					if (!result.contains("" + input.charAt(i))) {
						result += "" + input.charAt(i);
					}
				}
				txtOutput.setText(result);
			}
		});
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}