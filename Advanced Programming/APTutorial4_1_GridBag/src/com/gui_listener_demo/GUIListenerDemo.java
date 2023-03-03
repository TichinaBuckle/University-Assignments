/*
Author: Tichina Buckle
Date: March 1, 2023
Description: Tutorial 4, Part 1 Gridbag - Graphical User Interface
	Exercise 2
*/

package com.gui_listener_demo;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class GUIListenerDemo {

	// attributes
	private JFrame frame;
	private JButton button;
	private GridBagConstraints gbc;
	
	public static void main(String[] args) {
		
		GUIListenerDemo gx = new GUIListenerDemo();

		// configures frame
		gx.frame.setSize(400, 400);
		gx.frame.setLayout(new GridBagLayout());
		
		// configures button with GridBag Constraints
		gx.gbc = new GridBagConstraints();
		gx.gbc.gridx = 0;
		gx.gbc.gridy = 4;
		gx.gbc.gridwidth = 6;
		gx.gbc.ipadx = 50;
		gx.gbc.ipady = 10;
		gx.gbc.anchor = GridBagConstraints.CENTER;
		gx.gbc.insets = new Insets(10, 10, 11, 0);
		
		// action button
		// action listener button
		gx.button.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			JOptionPane.showMessageDialog(gx.frame, "You clicked the button", "Action Demo", JOptionPane.INFORMATION_MESSAGE);
			}
		});
		
		gx.frame.add(gx.button, gx.gbc);
		gx.frame.setVisible(true);
		
		// stops program from running in the background
		gx.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	//default constructor
	public GUIListenerDemo() {
		frame = new JFrame("GUI Demo - One");
		button = new JButton("Click me");
		gbc = new GridBagConstraints();
	}

}
