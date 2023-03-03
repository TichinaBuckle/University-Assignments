package view;

import javax.swing.JInternalFrame;
import javax.swing.JTextArea;

public class TextDocumentFrame extends JInternalFrame {
	
	private JTextArea textArea;
	
	public TextDocumentFrame() {
		super("Text Document Frame", true, true, true, true);
		initializeComponents();
		addComponentsToWindow();
		setWindowsProperties();
	}
	
	public void initializeComponents() {
		textArea = new JTextArea();	
	}
	
	public void addComponentsToWindow() {
		this.add(textArea);
	}

	public void setWindowsProperties() {
		this.setSize(300, 300);
		this.setVisible(true);
	}
}
