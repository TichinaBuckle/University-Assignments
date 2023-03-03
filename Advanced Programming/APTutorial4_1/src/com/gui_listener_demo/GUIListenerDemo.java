/*
Author: Tichina Buckle
Date: March 1, 2023
Description: Tutorial 4, Part 1 - Graphical User Interface
	Exercise 2
*/

package com.gui_listener_demo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import com.gui_demo.GUIDemo;

public class GUIListenerDemo {

	// attributes
		public JFrame frame;
		public JButton button;		
			
		public static void main(String[] args) {
			
			GUIListenerDemo guiL = new GUIListenerDemo();
			
			// frame & button configuration
			guiL.frame.setSize(400, 400);
			guiL.frame.setLayout(null);
			
			guiL.button.setBounds(130,100,100, 40);
			
			// action listener button
			guiL.button.addActionListener(new ActionListener() {
				 @Override
				 public void actionPerformed(ActionEvent e) {
					 JOptionPane.showMessageDialog(guiL.frame, "You clicked the button", "Action Demo", JOptionPane.INFORMATION_MESSAGE);
				 }
			});
			
			guiL.frame.add(guiL.button);
			guiL.frame.setVisible(true);
			
			// stops program from running in the background
			guiL.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}

		// default constructor
		public GUIListenerDemo() {
			frame = new JFrame("GUI Demo - One");
			button = new JButton("Click me");
		}
		
}
