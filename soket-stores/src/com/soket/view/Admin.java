package com.soket.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JToggleButton;
import javax.swing.UIManager;
import javax.swing.JList;
import javax.swing.JRadioButtonMenuItem;
import java.awt.GridLayout;
import javax.swing.BoxLayout;
import javax.swing.JSpinner;
import javax.swing.JTable;
import javax.swing.JToolBar;
import javax.swing.ImageIcon;

public class Admin extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Admin frame = new Admin();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * trabajando en mi rama como chita
	 */
	public Admin() {
		setTitle("Consola de Administraci\u00F3n");
		try{
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
		} catch(Exception e){
		    System.out.println(e);
		}
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel pnlHeader = new JPanel();
		contentPane.add(pnlHeader, BorderLayout.NORTH);
		
		JPanel pnlMenu = new JPanel();
		contentPane.add(pnlMenu, BorderLayout.WEST);
		pnlMenu.setLayout(new BorderLayout(0, 0));
		
		JPanel pnlContent = new JPanel();
		contentPane.add(pnlContent, BorderLayout.CENTER);
		pnlContent.setLayout(null);
	}
}
