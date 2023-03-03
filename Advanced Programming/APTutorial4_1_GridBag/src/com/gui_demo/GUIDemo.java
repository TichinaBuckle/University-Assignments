/*
Author: Tichina Buckle
Date: March 1, 2023
Description: Tutorial 4, Part 1 Gridbag - Graphical User Interface
	Exercise 1
*/

package com.gui_demo;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GUIDemo {

	// attributes
	private JFrame frame;
	private JButton button;
	private GridBagConstraints gbc;
	
	public static void main(String[] args) {
		
		GUIDemo gx = new GUIDemo();

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
		
		gx.frame.add(gx.button, gx.gbc);
		gx.frame.setVisible(true);
		
		// stops program from running in the background
		gx.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	//default constructor
	public GUIDemo( ) {
		frame = new JFrame("GUI Demo - One");
		button = new JButton("Click me");
		gbc = new GridBagConstraints();
	}

}
