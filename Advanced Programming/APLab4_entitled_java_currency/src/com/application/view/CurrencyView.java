package com.application.view;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import com.application.controller.CurrencyController;
import com.application.model.CurrencyModel;

// extended to make class a JFrame
public class CurrencyView extends JFrame implements ActionListener {

	// 10
	private JLabel lblResult;
	private JLabel lblValue;
	private JTextField txtValue;
	private JRadioButton  rdbToJMD;
	private JRadioButton  rdbToUSD;
	private ButtonGroup buttonGroup;
	private JButton btnConvert;
	private JButton btnClear;
	private JPanel panTop;
	private JPanel panMiddle;
	private JPanel panBottom;
	
	private CurrencyController controller;
	
	// 16
	public CurrencyView(CurrencyController controller) {
		this.controller = controller;
		this.setLayout (new GridLayout(3,1));
		
		// 17
		initializeComponents();
		addComponentsToPanels();
		addPanelsToWindow();
		setWindowProperties();
		registerListeners();
		
	}
	
	// 11
	private void initializeComponents() {
		lblResult = new JLabel("Result: ");
		lblValue = new JLabel("Value: ");
		txtValue = new JTextField();
		rdbToJMD = new JRadioButton("To JMD");
		rdbToUSD = new JRadioButton("To USD");
		buttonGroup = new ButtonGroup();
		buttonGroup.add(rdbToJMD);
		buttonGroup.add(rdbToUSD);
		btnClear = new JButton("Clear");
		btnConvert = new JButton("Convert");
		panTop = new JPanel (new GridLayout(1,3));
		panMiddle = new JPanel (new GridLayout(1,2));
		panBottom = new JPanel (new GridLayout(1,2));
		
	}
	
	// 12
	private void addComponentsToPanels() {
		panTop.add(lblValue);
		panTop.add(txtValue);
		panTop.add(lblResult);
		panMiddle.add(rdbToJMD);
		panMiddle.add(rdbToUSD);
		panBottom.add(btnClear);
		panBottom.add(btnConvert);
	}
	
	// 13
	private void addPanelsToWindow() {
		this.add(panTop);
		this.add(panMiddle);
		this.add(panBottom);
	}
	
	// 14
	private void setWindowProperties() {
		this.setSize(1024,680);
		this.setVisible(true);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
	}
	
	// 15
	private void registerListeners() {
		btnClear.addActionListener(this);
		btnConvert.addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		// 17 resets to null and clears selected
		if (e.getSource() == btnClear) {
			txtValue.setText(null);
			lblResult.setText("Result: ");
			rdbToJMD.setSelected(false);
			rdbToUSD.setSelected(false);
		}
		
		// 18 check which convert button was selected
		if (e.getSource() == btnConvert) {
			if (rdbToJMD.isSelected()) {
				controller.convert("USD", txtValue.getText().trim());
			} else if (rdbToUSD.isSelected()) {
				controller.convert("JMD", txtValue.getText().trim());
			}
		}
	}
	
	// 19
	public void updateResult (String value) {
		lblResult.setText(value);
	}
	
}
