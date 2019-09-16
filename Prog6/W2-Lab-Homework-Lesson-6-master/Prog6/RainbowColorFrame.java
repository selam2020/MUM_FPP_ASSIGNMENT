package Prob7;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RainbowColorFrame {
	public static void main(String[] args) {
		JFrame frame = new JFrame("Rainbow Color Frame");
		frame.setSize(550, 200);
		frame.setLocation(500, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new FlowLayout(FlowLayout.LEFT));
		
		JButton btnRed = new JButton();
		btnRed.setPreferredSize(new Dimension(60, 60));
		btnRed.setBackground(Color.RED);
		btnRed.setName("Red");
		frame.add(btnRed);
		
		JButton btnOrange = new JButton();
		btnOrange.setPreferredSize(new Dimension(60, 60));
		btnOrange.setBackground(Color.ORANGE);
		btnOrange.setName("Orange");
		frame.add(btnOrange);
		
		JButton btnGreen = new JButton();
		btnGreen.setPreferredSize(new Dimension(60, 60));
		btnGreen.setBackground(Color.GREEN);
		btnGreen.setName("Green");
		frame.add(btnGreen);
		
		JButton btnBlue = new JButton();
		btnBlue.setPreferredSize(new Dimension(60, 60));
		btnBlue.setBackground(Color.BLUE);
		btnBlue.setName("Blue");
		frame.add(btnBlue);
		
		JButton btnYellow = new JButton();
		btnYellow.setPreferredSize(new Dimension(60, 60));
		btnYellow.setBackground(Color.YELLOW);
		btnYellow.setName("Yellow");
		frame.add(btnYellow);
		
		JButton btnIndigo = new JButton();
		btnIndigo.setPreferredSize(new Dimension(60, 60));
		btnIndigo.setBackground(new Color(75, 0, 130));
		btnIndigo.setName("Indigo");
		frame.add(btnIndigo);
		
		JButton btnViolet = new JButton();
		btnViolet.setPreferredSize(new Dimension(60, 60));
		btnViolet.setBackground(new Color(138, 43, 226));
		btnViolet.setName("Violet");
		frame.add(btnViolet);
		
		btnRed.addActionListener(new ActionEventButtons());
		btnOrange.addActionListener(new ActionEventButtons());
		btnGreen.addActionListener(new ActionEventButtons());	
		btnBlue.addActionListener(new ActionEventButtons());
		btnYellow.addActionListener(new ActionEventButtons());
		btnIndigo.addActionListener(new ActionEventButtons());
		btnViolet.addActionListener(new ActionEventButtons());
		
		frame.setVisible(true);
	
	}
	
	static class ActionEventButtons implements ActionListener{
		String colorMeaning="";
		@Override
		public void actionPerformed(ActionEvent e) {
			JButton btn=(JButton) e.getSource();
			switch (btn.getName()) {
				case "Red":
					colorMeaning="Red signifies passion, vitality,enthusiasm and security";
					break;
				case "Orange":
					colorMeaning=" It is a dynamic color representing creativity, practicality, playfulness as well as equilibrium or control";
					break;
				case "Green":
					colorMeaning="denotes fertility, growth,balance, health and wealth";
					break;
				case "Blue":
					colorMeaning= "Spirituality and Divinity";
					break;
				case "Yellow":
					colorMeaning="It represents clarity of thought,wisdom, orderliness and energy";
					break;
				case "Indigo":
					colorMeaning="used for spiritual attainment,psychic abilities, self awareness and enhancement of Intuition";
					break;
				case "Violet":
					colorMeaning="Dark tones of violet are associated with sorrow. Deeper shades of violet or purple denote high spiritual mastery";
					break;
			 	default:
			 		
			}
			JOptionPane.showMessageDialog(null, colorMeaning,btn.getName()+": Color Meaning", JOptionPane.INFORMATION_MESSAGE);
		}
		
	}
}