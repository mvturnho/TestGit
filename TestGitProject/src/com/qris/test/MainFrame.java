package com.qris.test;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Choice;
import java.awt.BorderLayout;
import java.awt.TextArea;

public class MainFrame {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame window = new MainFrame();
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
	public MainFrame() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Choice choice = new Choice();
		frame.getContentPane().add(choice, BorderLayout.NORTH);
		
		TextArea textArea = new TextArea();
		frame.getContentPane().add(textArea, BorderLayout.WEST);
		
		TextArea textArea_1 = new TextArea();
		frame.getContentPane().add(textArea_1, BorderLayout.SOUTH);
	}

}
