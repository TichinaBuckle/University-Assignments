/*
Author: Tichina Buckle
Date: March 1, 2023
Description: Tutorial 4, Part 1 - Graphical User Interface
	Exercise 1
*/

package com.gui_demo;

import javax.swing.*;

public class GUIDemo {

	// attributes
	public JFrame frame;
	public JButton button;		
		
	public static void main(String[] args) {
		
		GUIDemo gui = new GUIDemo();
		
		// frame & button configuration
		gui.frame.setSize(400, 400);
		gui.frame.setLayout(null);
		
		gui.button.setBounds(130,100,100, 40);
		
		gui.frame.add(gui.button);
		gui.frame.setVisible(true);
		
		// stops program from running in the background
		gui.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	// default constructor
	public GUIDemo() {
		frame = new JFrame("GUI Demo - One");
		button = new JButton("Click me");
	}
}
