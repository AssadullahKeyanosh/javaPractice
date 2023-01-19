package Frams;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class MyFram {
	public MyFram() {
		JFrame frame = new JFrame();
		frame.setTitle("Buda");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400,400);
		frame.getContentPane().setBackground(new Color(12,30,44));
		frame.setResizable(false);
		frame.setVisible(true);
	ImageIcon img = new ImageIcon("src/frams/icon.png");
	frame.setIconImage(img.getImage());
	
	
	
	
	
	}
}
