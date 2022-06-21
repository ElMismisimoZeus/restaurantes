package com.soket.view.modules.productos;

import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JToolBar;

import com.soket.view.modules.utils.toolbar.tools.AddItem;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.JSeparator;

public class vProductos extends JPanel {
	private JTable table;
	private AddItem addTool;

	/**
	 * Create the panel.
	 */
	public vProductos() {
		setLayout(null);
		
		table = new JTable();
		table.setBounds(33, 95, 381, 126);
		add(table);
		
		addTool = new AddItem();
		
		JToolBar toolBar = new JToolBar();
		toolBar.setBounds(0, 0, 450, 30);
		
		toolBar.add(addTool);
		
		add(toolBar);

	}
}
