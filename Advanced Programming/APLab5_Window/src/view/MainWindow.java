package view;

import java.awt.AWTException;
import java.awt.Image;
import java.awt.MenuItem;
import java.awt.PopupMenu;
import java.awt.SystemTray;
import java.awt.Toolkit;
import java.awt.TrayIcon;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

public class MainWindow extends JFrame {
	
	// 6
	private JDesktopPane deskTop;
	private JMenuBar menuBar;
	private JMenu file;
	private JMenu edit;
	private JMenuItem menuItemTextDocument;
	private JMenuItem menuItemSpreadSheet;
	private JMenuItem menuItemSave;
	private MenuItem menuAbout;
	private MenuItem menuOpen;
	private MenuItem menuClose;
	private TrayIcon trayIcon;
	private PopupMenu popup;
	
	// 19 - Default Constructor
	public MainWindow() {
		this.initializeComponents();
		this.addMenuItemsToMenu();
		this.addMenuItemsToPopup();
		this.addMenusToMenuBar();
		this.addComponentsToWindow();
		this.registerListeners();
		this.setWindowProperties();
	}
	
	// gets image from folder
	private Toolkit toolkit = Toolkit.getDefaultToolkit();
	private Image image = toolkit.getImage("./images/app.png");
	
	// 7
	// initializeComponents()
	public void initializeComponents() {
		// 8
		deskTop = new JDesktopPane();
	    menuBar = new JMenuBar();
	    file = new JMenu("File");
	    file.setMnemonic('A');
	    edit = new JMenu("Edit");
	    edit.setMnemonic('S');
	    menuItemTextDocument = new JMenuItem("text Document");
	    menuItemSpreadSheet = new JMenuItem("Spreadsheet");
	    menuItemSave = new JMenuItem("Save");
	    menuItemSave.setToolTipText("Saves the active document");
	    menuAbout = new MenuItem("About");
	    menuOpen = new MenuItem("Open");
	    menuClose = new MenuItem("Close");
	    trayIcon = new TrayIcon(image, "This is a tray icon");
	    popup = new PopupMenu();
	    trayIcon.setPopupMenu(popup);
	}
	
	// addMenuItemsToPopup()
	public void addMenuItemsToPopup() {
		// 9 - Popup Menu Items
		popup.add(menuAbout);
		popup.add(menuOpen);
		popup.add(menuClose);
		
	}
		
	// addMenuItemsToMenu()
	public void addMenuItemsToMenu() {
		// 10
		file.add(menuItemSpreadSheet);
		file.add(menuItemTextDocument);
		edit.add(menuItemSave);
	}	
	
	// addMenusToMenuBar()
	public void addMenusToMenuBar() {
		// 11
		menuBar.add(edit);
		menuBar.add(file);
	}
	
	// addComponentsToWindow()
	public void addComponentsToWindow() {
		// 12
		this.add(deskTop);
	}
	
	// registerListeners()
	public void registerListeners() {
		// 17
		 menuItemTextDocument.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				deskTop.add(new TextDocumentFrame());
			}
		 });
		
		 menuItemSpreadSheet.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				deskTop.add(new SpreadSheetDocumentFrame());
			}
		 });
		 
		 menuClose.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				SystemTray.getSystemTray().remove(trayIcon);
				System.exit(0);
			}
		});
		 
		 menuAbout.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					JOptionPane.showMessageDialog(null, "Info about awesome app");
				}
			});
		 
		 menuOpen.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					SystemTray.getSystemTray().remove(trayIcon);
					setVisible(true);
				}
			});
		 
		 // 18
		 this.addWindowListener(new WindowListener() {

			@Override
			public void windowOpened(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void windowClosing(WindowEvent e) {
				try {
					SystemTray.getSystemTray().add(trayIcon);
				} catch (AWTException e1) {
					e1.printStackTrace();
				}
				
			}

			@Override
			public void windowClosed(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void windowIconified(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void windowDeiconified(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void windowActivated(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void windowDeactivated(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			 
		 }
				 
				 
		);
	}
		
	// setWindowProperties()
	public void setWindowProperties() {
		// 13
		this.setJMenuBar(menuBar);
		this.setSize(1020, 700);
		this.setResizable(true);
		this.setVisible(true);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
	}
}
