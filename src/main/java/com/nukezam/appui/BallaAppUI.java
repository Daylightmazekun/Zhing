package com.nukezam.appui;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class BallaAppUI {
	public static void main(String[] args) {
		JFrame jFrame = new JFrame();
		JPanel contentPane = new JPanel();
		contentPane.setLayout(null);
		jFrame.setContentPane(contentPane);

		// TODO
		jFrame.setUndecorated(false);
		jFrame.setVisible(true);
		jFrame.setSize(300, 250);
		jFrame.setLocationRelativeTo(null);
	}
}
